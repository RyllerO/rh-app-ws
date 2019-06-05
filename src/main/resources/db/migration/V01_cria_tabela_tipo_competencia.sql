CREATE TABLE tipo_competencia (
    id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR (30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tipo_competencia (nome) VALUES ('APRESENTACAO_PESSOAL');
INSERT INTO tipo_competencia (nome) VALUES ('DIDATICA');
INSERT INTO tipo_competencia (nome) VALUES ('COMPROMENTIMENTO');
INSERT INTO tipo_competencia (nome) VALUES ('EXTRA_CLASSE');
