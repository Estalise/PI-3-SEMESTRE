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

<img width="385" height="462" alt="Image" src="https://github.com/user-attachments/assets/6b519d78-3cd2-4c64-8441-9af16e8c358f" />

**Tela de Cadastro de Pessoa Física**

<img width="385" height="462" alt="Image" src="https://github.com/user-attachments/assets/df241217-bc86-4d6d-a695-557b82907a24" />

**Tela de Cadastro de Pessoa Jurídica**

<img width="385" height="462" alt="Image" src="https://github.com/user-attachments/assets/450c54d3-baa6-48c8-8234-76fac390b3bc" />

**Tela de Cadastro de Aluno**

<img width="385" height="462" alt="Image" src="https://github.com/user-attachments/assets/58f201fe-f4f0-4d6f-ba44-3c1d2393e74f" />

**Tela de Cadastro de Professor**

<img width="385" height="462" alt="Image" src="https://github.com/user-attachments/assets/fd769e5e-761f-48f8-93fb-cb836f6dd9cf" />

**Tela de Cadastro de Fornecedor**

<img width="385" height="462" alt="Image" src="https://github.com/user-attachments/assets/7d1ad98e-14b0-4af5-9159-5612a6a91a91" />

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
