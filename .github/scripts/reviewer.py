import os

import google.generativeai as genai
import requests

# Configurações iniciais pegando as variáveis de ambiente do GitHub Actions
GEMINI_API_KEY = os.environ.get("GEMINI_API_KEY")
GITHUB_TOKEN = os.environ.get("GITHUB_TOKEN")
REPO = os.environ.get("GITHUB_REPOSITORY")
PR_NUMBER = os.environ.get("PR_NUMBER")

# Configura a API do Gemini
genai.configure(api_key=GEMINI_API_KEY)
model = genai.GenerativeModel("gemini-1.5-flash")


def get_pr_diff():
    """Puxa as alterações de código feitas no Pull Request"""
    url = f"https://api.github.com/repos/{REPO}/pulls/{PR_NUMBER}"
    headers = {
        "Authorization": f"token {GITHUB_TOKEN}",
        "Accept": "application/vnd.github.v3.diff",
    }
    response = requests.get(url, headers=headers)
    return response.text


def post_comment(review_text):
    """Posta o resultado do Gemini como um comentário no PR"""
    url = f"https://api.github.com/repos/{REPO}/issues/{PR_NUMBER}/comments"
    headers = {
        "Authorization": f"token {GITHUB_TOKEN}",
        "Accept": "application/vnd.github.v3+json",
    }
    data = {"body": review_text}
    requests.post(url, headers=headers, json=data)


def main():
    diff = get_pr_diff()

    if not diff:
        print("Nenhuma alteração encontrada.")
        return

    # O Prompt rigoroso do Mooc.fi
    prompt = f"""
    Você é um validador de código super rigoroso do curso de Java do MOOC.fi (Universidade de Helsinki).
    Sua missão é analisar o git diff abaixo e apontar erros de lógica, problemas de Orientação a Objetos
    e, principalmente, erros de formatação em Strings (como espaços sobrando ou faltando em System.out.println).

    Seja direto, profissional e, se o código estiver bom, parabenize o aluno. Responda em Português.

    Código alterado:
    {diff}
    """

    # Chama o Gemini
    response = model.generate_content(prompt)

    # Comenta no GitHub
    post_comment(response.text)


if __name__ == "__main__":
    main()
