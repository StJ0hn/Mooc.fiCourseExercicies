# Resoluções - MOOC.fi Java Programming

Repositório destinado ao armazenamento das resoluções dos exercícios práticos do curso Java Programming I e II, oferecido pela Universidade de Helsinque.

## Estrutura do Repositório
* `/java-programming-i`: Resoluções das partes 1 a 7 (aproximadamente 133 exercícios), englobando fundamentos de sintaxe, estruturas de controle, coleções básicas e introdução à Programação Orientada a Objetos.
* `/java-programming-ii`: Resoluções das partes 8 a 14 (aproximadamente 125 exercícios), abordando conceitos avançados como herança, polimorfismo, tratamento de exceções, Stream API, manipulação de arquivos e estruturas de dados.

## Proposta
O objetivo principal deste repositório é o registro da progressão técnica e a construção de uma base sólida na linguagem Java, consolidando os conceitos teóricos através da resolução exaustiva de problemas algorítmicos.

## 🤖 Automação e CI/CD (AI Code Reviewer)
Para garantir a qualidade do código e a aderência às exigências estritas do sistema de testes do MOOC.fi (TMC), desenvolvi e integrei uma esteira de **Integração Contínua (CI)**. 

O repositório conta com um **bot de code review customizado**, operando da seguinte forma:
- Todo código novo é enviado através de **Pull Requests**.
- A abertura do PR aciona um fluxo automático no **GitHub Actions**.
- Um script em **Python** consome a **API do Google Gemini**, que atua como um validador rigoroso do MOOC.fi.
- A IA analisa o *diff* do código, valida a lógica de Orientação a Objetos, verifica a formatação minuciosa de strings e posta um feedback detalhado diretamente no Pull Request antes que o merge seja realizado.

## Tecnologias Utilizadas
* **Java 21** (Linguagem base)
* **GitHub Actions** (Infraestrutura de CI/CD)
* **Python** (Scripting de automação)
* **Google Gemini API** (Análise e revisão de código)

## Licença
Este repositório possui fins estritamente educacionais. O conteúdo e a propriedade intelectual do curso pertencem à Universidade de Helsinque.
