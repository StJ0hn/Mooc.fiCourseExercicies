import os

import requests
from google import genai

# Resgata as variáveis de ambiente injetadas pelo YAML
GEMINI_API_KEY = os.environ.get("GEMINI_API_KEY")
GITHUB_TOKEN = os.environ.get("GITHUB_TOKEN")
REPO = os.environ.get("GITHUB_REPOSITORY")
PR_NUMBER = os.environ.get("PR_NUMBER")


def get_pr_diff():
    """Puxa o texto das alterações (diff) feitas no Pull Request"""
    url = f"https://api.github.com/repos/{REPO}/pulls/{PR_NUMBER}"
    headers = {
        "Authorization": f"token {GITHUB_TOKEN}",
        "Accept": "application/vnd.github.v3.diff",
    }
    response = requests.get(url, headers=headers)

    if response.status_code != 200:
        print(f"Erro ao buscar o diff no GitHub: {response.status_code}")
        return None

    return response.text


def post_comment(review_text):
    """Posta o texto da revisão como um comentário no PR"""
    url = f"https://api.github.com/repos/{REPO}/issues/{PR_NUMBER}/comments"
    headers = {
        "Authorization": f"token {GITHUB_TOKEN}",
        "Accept": "application/vnd.github.v3+json",
    }
    data = {"body": review_text}
    response = requests.post(url, headers=headers, json=data)

    if response.status_code == 201:
        print("Comentário postado com sucesso!")
    else:
        print(f"Erro ao postar comentário: {response.status_code} - {response.text}")


def main():
    # Validação de segurança inicial
    # --- INÍCIO DO RAIO-X ---
        print("=== RAIO-X DAS VARIÁVEIS DE AMBIENTE ===")
        print(f"GEMINI_API_KEY: {'OK (Recebida)' if GEMINI_API_KEY else 'FALHA (Vazia ou Nula)'}")
        print(f"GITHUB_TOKEN: {'OK (Recebida)' if GITHUB_TOKEN else 'FALHA (Vazia ou Nula)'}")
        print(f"PR_NUMBER: {PR_NUMBER if PR_NUMBER else 'FALHA (Vazio)'}")
        print("========================================")

        if not GEMINI_API_KEY or not GITHUB_TOKEN:
            print("ERRO FATAL: Execução abortada por falta de chaves.")
            return

    diff = get_pr_diff()
    if not diff:
        print("O Diff retornou vazio. Nenhuma alteração para avaliar.")
        return

    prompt = f"""
    Você é um validador de código super rigoroso do curso de Java do MOOC.fi (Universidade de Helsinki).
    Sua missão é analisar o git diff abaixo e apontar erros de lógica, problemas de Orientação a Objetos
    e, principalmente, erros de formatação em Strings (como espaços sobrando, faltando, ou o uso de '?' no lugar de ':').

    Seja direto, profissional e, se o código estiver bom, parabenize o aluno. Responda em Português.

    Código alterado:
    {diff}
    """

    try:
        # Inicialização do novo SDK do Google GenAI
        client = genai.Client(api_key=GEMINI_API_KEY)

        # Chamada ao modelo Gemini 1.5 Flash
        response = client.models.generate_content(
            model="gemini-1.5-flash", contents=prompt
        )

        # Envio da resposta para o GitHub
        post_comment(response.text)

    except Exception as e:
        print(f"Ocorreu um erro durante a geração ou postagem da revisão: {e}")


if __name__ == "__main__":
    main()
