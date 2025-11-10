# Sistema de Gestão de Cadastros

Projeto desenvolvido como parte do **Projeto Integrador - 3° semestre de ADS (Senac, 2025)**.  
O sistema tem como objetivo facilitar o gerenciamento de cadastros de pessoas físicas, jurídicas, alunos, professores e fornecedores.

---

## 👥 Integrantes do Grupo
- Gabriel Estalise
- Alexandre Braz Bessa
- Mateus Magalhães   
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

<img width="1414" height="2000" alt="Image" src="https://github.com/user-attachments/assets/472c6c50-0283-4a75-82dd-cce52a28c6a3" />

**Tela de Cadastro de Pessoa Física**

<img width="1414" height="2000" alt="Image" src="https://github.com/user-attachments/assets/5a4dbcc9-f772-4fd8-9eb1-08e4b90ed7c7" />

**Tela de Cadastro de Pessoa Jurídica**

<img width="1414" height="2000" alt="Image" src="https://github.com/user-attachments/assets/c0714830-6399-4ac9-a756-fa228fd48c09" />

**Tela de Cadastro de Aluno**

<img width="1414" height="2000" alt="Image" src="https://github.com/user-attachments/assets/2cf5e755-f4f1-4f4f-907c-cf218e15af4a" />

**Tela de Cadastro de Professor**

<img width="1414" height="2000" alt="Image" src="https://github.com/user-attachments/assets/c7479546-a5cd-49f8-868a-5e68a2544b47" />

**Tela de Cadastro de Fornecedor**

<img width="1414" height="2000" alt="Image" src="https://github.com/user-attachments/assets/70e5329a-3f68-430c-b14d-c5a0e5b7ac6a" />

---

## ⚙️ Tecnologias Utilizadas
- Linguagem: Java / HTML / CSS / JAVASCRIPT
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
