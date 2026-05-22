-- 1. cria candidato
INSERT INTO candidato (nome) VALUES ('Pedro');

-- 2. cria responsável
INSERT INTO responsavel (nome) VALUES ('Ana');

-- 3. cria vínculo
INSERT INTO candidato_responsavel (id_candidato, id_responsavel, qualificacao)
VALUES (1, 1, 'pai');


insert into usuarios (nome, matricula, senha, ativo) values ('peralta', '123', '123', true);


insert into crbm( codigo ) values ('1º CRBM');
insert into crbm( codigo ) values ('2º CRBM');
insert into crbm( codigo ) values ('3º CRBM');
insert into crbm( codigo ) values ('4º CRBM');
insert into crbm( codigo ) values ('5º CRBM');
insert into crbm( codigo ) values ('6º CRBM');
insert into crbm( codigo ) values ('7º CRBM');
insert into crbm( codigo ) values ('8º CRBM');

insert into obm(codigo, telefone, crbm_id, cep, logradouro, numero, complemento, bairro, cidade, estado)
values ('5ª CRBM Trindade', '123456789', 7, '12345-678', 'Rua Exemplo', '123', 'Apto 101', 'Bairro Exemplo', 'Cidade Exemplo', 'Estado Exemplo');
insert into obm(codigo, telefone, crbm_id, cep, logradouro, numero, complemento, bairro, cidade, estado)
values ('6ª BBM Itumbiara', '123456789', 7, '12345-678', 'Rua Exemplo', '123', 'Apto 101', 'Bairro Exemplo', 'Cidade Exemplo', 'Estado Exemplo');