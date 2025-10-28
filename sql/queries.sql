-- =========================================
-- Consultas SQL de Exemplo
-- =========================================

-- Listar todas as pessoas
SELECT * FROM pessoa;

-- Listar alunos e seus cursos
SELECT a.id, p.nome, a.curso, a.matricula
FROM aluno a
JOIN pessoa p ON a.pessoa_id = p.id;

-- Listar professores e suas disciplinas
SELECT pr.id, p.nome, pr.disciplina, pr.titulacao
FROM professor pr
JOIN pessoa p ON pr.pessoa_id = p.id;

-- Listar fornecedores e produtos fornecidos
SELECT * FROM fornecedor;
