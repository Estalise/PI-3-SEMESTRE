# Sistema de Gestão de Cadastros

Projeto desenvolvido como parte do **Projeto Integrador - 3° semestre de ADS (Senac, 2025)**.  
O sistema tem como objetivo facilitar o gerenciamento de cadastros de pessoas físicas, jurídicas, alunos, professores e fornecedores.

---

## 👥 Integrantes do Grupo
- Gabriel Estalise    
- [adicione os demais nomes aqui]

---

## 🎯 Objetivo do Sistema
Permitir o cadastro, edição, exclusão e listagem de pessoas físicas, jurídicas, alunos, professores e fornecedores, de forma simples e centralizada.

---

## 🧩 Diagrama de Casos de Uso

**Descrição:** O diagrama abaixo representa o relacionamento entre o ator *Administrador* e os casos de uso principais do sistema.

<img width="688" height="491" alt="Image" src="https://github.com/user-attachments/assets/e626d888-d5e0-44ea-9907-bdc4b4649a60" />

---

## 🏗️ Diagrama de Classes

O diagrama de classes representa a estrutura lógica do sistema, suas entidades e heranças entre as classes.

<img width="474" height="712" alt="Image" src="https://github.com/user-attachments/assets/ade7fc3d-d646-44b2-b317-74ab7b5f03ca" />

---

## 🖥️ Protótipos das Telas

**Tela Inicial**

<img width="1414" height="2000" alt="Image" src="https://github.com/user-attachments/assets/edfe1af7-63e9-4ad3-8921-ad260d82006e" />

**Tela de Cadastro de Pessoa Física**

<img width="1414" height="2000" alt="Image" src="https://github.com/user-attachments/assets/cd82d403-ace9-4471-9ab3-68f56b1a1cb0" />

**Tela de Cadastro de Pessoa Jurídica**

<img width="1414" height="2000" alt="Image" src="https://github.com/user-attachments/assets/78499a80-fe2c-46a1-9bce-637ff1ff89c0" />

**Tela de Cadastro de Aluno**

<img width="1414" height="2000" alt="Image" src="https://github.com/user-attachments/assets/3e2fce7f-cebd-4f46-abc0-90ae7419e1e0" />

**Tela de Cadastro de Professor**

<img width="1414" height="2000" alt="Image" src="https://github.com/user-attachments/assets/a86db67f-05ee-4661-838d-054b56d15dbe" />

**Tela de Cadastro de Fornecedor**

<img width="1414" height="2000" alt="Image" src="https://github.com/user-attachments/assets/62782858-e188-4736-8acb-f6de9692dd63" />

---

## ⚙️ Tecnologias Utilizadas
- Linguagem: Java / HTML / CSS (ajuste conforme o projeto real)
- Banco de Dados: MySQL
- Ferramenta de Versionamento: Git e GitHub
- Modelagem: UML (Draw.io / Lucidchart)

---

## 🧾 Casos de Uso Documentados
**Caso de Uso Principal: Cadastrar Pessoa**

- **Pré-condição:** Administrador autenticado  
- **Pós-condição:** Cadastro registrado no sistema  

**Cenário Principal:**  
O administrador acessa o sistema, preenche os dados da pessoa e confirma o cadastro.  
O sistema valida, salva e exibe mensagem de sucesso.

**Cenários Alternativos:**
1. Dados inválidos (CPF/CNPJ incorreto) → Sistema exibe mensagem de erro.  
2. CPF/CNPJ duplicado → Sistema alerta sobre duplicidade e solicita ação.  

---

## 🧠 Observações
Este projeto foi desenvolvido com fins acadêmicos e reflete o aprendizado das disciplinas de:
- Programação Orientada a Objetos  
- Banco de Dados  
- Engenharia de Software  
- Interface e Usabilidade

---

© 2025 — Projeto Integrador | Curso de Análise e Desenvolvimento de Sistemas — **Senac**
