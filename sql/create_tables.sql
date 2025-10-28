-- =========================================
-- Script de Criação das Tabelas do Projeto
-- PI 3º Semestre - Sistema de Gestão
-- =========================================

-- Caso o banco ainda não exista:
CREATE DATABASE IF NOT EXISTS pi3semestre;
USE pi3semestre;

-- =============================
-- Tabela: Pessoa (genérica)
-- =============================
CREATE TABLE pessoa (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) UNIQUE,
    email VARCHAR(100),
    telefone VARCHAR(20),
    endereco VARCHAR(150)
);

-- =============================
-- Tabela: Aluno
-- =============================
CREATE TABLE aluno (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    pessoa_id BIGINT NOT NULL,
    curso VARCHAR(100),
    matricula VARCHAR(20) UNIQUE,
    FOREIGN KEY (pessoa_id) REFERENCES pessoa(id)
);

-- =============================
-- Tabela: Professor
-- =============================
CREATE TABLE professor (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    pessoa_id BIGINT NOT NULL,
    disciplina VARCHAR(100),
    titulacao VARCHAR(50),
    FOREIGN KEY (pessoa_id) REFERENCES pessoa(id)
);

-- =============================
-- Tabela: Fornecedor
-- =============================
CREATE TABLE fornecedor (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cnpj VARCHAR(18) UNIQUE NOT NULL,
    razao_social VARCHAR(100) NOT NULL,
    contato_comercial VARCHAR(100),
    tipo_produto VARCHAR(100)
);
