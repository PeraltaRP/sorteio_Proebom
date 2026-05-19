-- 1. cria candidato
INSERT INTO candidato (nome) VALUES ('Pedro');

-- 2. cria responsável
INSERT INTO responsavel (nome) VALUES ('Ana');

-- 3. cria vínculo
INSERT INTO candidato_responsavel (candidato_id, responsavel_id)
VALUES (1, 1);