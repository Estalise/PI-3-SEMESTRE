# 🗄️ Banco de Dados do Projeto – PI 3º Semestre

Este projeto utiliza **Spring Boot + JPA (Hibernate)** para gerenciar o banco de dados.  
Por isso, **não é necessário criar manualmente as tabelas**, pois elas são geradas automaticamente a partir das classes Java anotadas com `@Entity`.

---

## ⚙️ Configuração do Banco de Dados

### 🧱 1. Criar o banco no MySQL

Antes de executar o projeto pela primeira vez, crie o banco de dados localmente:

```sql
CREATE DATABASE PI3semestre;
