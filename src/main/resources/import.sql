INSERT INTO medico (nome, crm) VALUES ('Dr. Spring Boot', '1235482');
INSERT INTO medico (nome, crm) VALUES ('Dr. Hibernate', '1235482');
INSERT INTO medico (nome, crm) VALUES ('Dr. H2', '1235482');
INSERT INTO medico (nome, crm) VALUES ('Dr. JPA', '1235482');
INSERT INTO medico (nome, crm) VALUES ('Dr. Bootstrap', '1235482');

INSERT INTO paciente (nome, telefone) VALUES ('Joao Vitor', '639847858');
INSERT INTO paciente (nome, telefone) VALUES ('Fagno Alves', '639847858');
INSERT INTO paciente (nome, telefone) VALUES ('Renato Couto', '639847858');
INSERT INTO paciente (nome, telefone) VALUES ('Hugo Santos', '639847858');
INSERT INTO paciente (nome, telefone) VALUES ('Hemmerson', '639847858');


INSERT INTO consulta(valor, data, id_medico, id_paciente, observacao) VALUES (10.00, '20230831', 1, 1, 'test')
INSERT INTO consulta(valor, data, id_medico, id_paciente, observacao) VALUES (10.00, '20230831', 1, 2, 'test')
INSERT INTO consulta(valor, data, id_medico, id_paciente, observacao) VALUES (10.00, '20230831', 1, 3, 'test')
INSERT INTO consulta(valor, data, id_medico, id_paciente, observacao) VALUES (10.00, '20230831', 1, 4, 'test')

INSERT INTO consulta(valor, data, id_medico, id_paciente, observacao) VALUES (10.00, '20230831', 1, 1, 'test')
INSERT INTO consulta(valor, data, id_medico, id_paciente, observacao) VALUES (10.00, '20230831', 2, 1, 'test')
INSERT INTO consulta(valor, data, id_medico, id_paciente, observacao) VALUES (10.00, '20230831', 3, 1, 'test')
INSERT INTO consulta(valor, data, id_medico, id_paciente, observacao) VALUES (10.00, '20230831', 4, 1, 'test')

INSERT INTO consulta(valor, data, id_medico, id_paciente, observacao) VALUES (10.00, '20230831', 1, 4, 'test')
INSERT INTO consulta(valor, data, id_medico, id_paciente, observacao) VALUES (10.00, '20230831', 2, 3, 'test')
INSERT INTO consulta(valor, data, id_medico, id_paciente, observacao) VALUES (10.00, '20230831', 3, 2, 'test')
INSERT INTO consulta(valor, data, id_medico, id_paciente, observacao) VALUES (10.00, '20230831', 4, 1, 'test')