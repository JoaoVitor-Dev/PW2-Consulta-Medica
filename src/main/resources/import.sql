INSERT INTO medico(id, crm, cpf, nome, telefone) VALUES(1, '1253', '32426849', 'Médico 1', '984780584')

INSERT INTO paciente(id, cpf, nome, telefone) VALUES(2, '06241688106', 'Joao Vitor', '984780584')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(3, '06551688306', 'Fagno', '984720554')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(4, '06351644306', 'Emmerson', '984720554')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(5, '06351644306', 'Renato', '984720554')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(6, '06351644306', 'Hugo', '984720554')
INSERT INTO paciente(id, cpf,  nome, telefone) VALUES(7, '06351644306', 'Matheus', '984720554')

INSERT INTO consulta(id, data, valor, id_medico, id_paciente, observacao) values (1, '20230921', 100.0, 1, 2, 'teste')
INSERT INTO consulta(id, data, valor, id_medico, id_paciente, observacao) values (2, '20230921', 70.0, 1, 3, 'teste')
INSERT INTO consulta(id, data, valor, id_medico, id_paciente, observacao) values (3, '20230921', 60.0, 1, 4, 'teste')
INSERT INTO consulta(id, data, valor, id_medico, id_paciente, observacao) values (4, '20230921', 40.0, 1, 6, 'teste')