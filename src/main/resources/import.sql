INSERT INTO medico(id, crm, nome, telefone) VALUES(1, '1253', 'Médico 1', '984780584')

INSERT INTO paciente(id, nome, telefone) VALUES(1, 'Joao Vitor', '984780584')
INSERT INTO paciente(id, nome, telefone) VALUES(2,'Joao Vitor', '984780584')

INSERT INTO consulta(id, data, valor, id_medico, id_paciente, observacao) values (1, '20230921', 100.0, 1, 1, 'teste')