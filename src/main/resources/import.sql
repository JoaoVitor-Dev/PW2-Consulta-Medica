INSERT INTO medico(id, crm, cpf, nome, telefone) VALUES(1, '1253', '32426849', 'Dr. Anderson', '984780584')
INSERT INTO medico(id, crm, cpf, nome, telefone) VALUES(2, '1253', '32426849', 'Dr. Paulo', '984780584')

INSERT INTO paciente(id, cpf, nome, telefone) VALUES(3, '06241688106', 'Joao Vitor', '984780584')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(4, '06551688306', 'Fagno', '984720554')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(5, '06351644306', 'Emmerson', '984720554')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(6, '06351644306', 'Renato', '984720554')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(7, '06351644306', 'Hugo', '984720554')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(8, '06351644306', 'Matheus', '984720554')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(9, '06351644306', 'Lucas', '984720554')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(10, '06351644306', 'Tenorio', '984720554')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(11, '06351644306', 'William', '984720554')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(12, '06351644306', 'Lalyet', '984720554')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(13, '06351644306', 'Samuel', '984720554')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(14, '06351644306', 'Daniel', '984720554')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(15, '06351644306', 'Anderson', '984720554')

INSERT INTO consulta(id, data, valor, id_medico, id_paciente, observacao) values (1, '20230921', 100.0, 1, 3, 'teste')
INSERT INTO consulta(id, data, valor, id_medico, id_paciente, observacao) values (2, '20230921', 70.0, 1, 4, 'teste')
INSERT INTO consulta(id, data, valor, id_medico, id_paciente, observacao) values (3, '20230921', 60.0, 1, 5, 'teste')

INSERT INTO perfil(id, nome) values (1, 'ROLE_ADMIN')
INSERT INTO perfil(id, nome) values (2, 'ROLE_USER')

INSERT INTO usuario(id, login, senha) values (1, 'admin', '$2a$10$MzBPcGHwyBgjNp2BjyAtbespp4q5Z9Ns/XKUjaYtdSjEhn8Q21B4i')
INSERT INTO usuario(id, login, senha) values (2, 'user', '$2a$10$MzBPcGHwyBgjNp2BjyAtbespp4q5Z9Ns/XKUjaYtdSjEhn8Q21B4i')

INSERT INTO usuario_perfis(perfis_id, usuario_id) values (1, 1)
INSERT INTO usuario_perfis(perfis_id, usuario_id) values (2, 2)






