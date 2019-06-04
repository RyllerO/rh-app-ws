CREATE TABLE competencia (
        id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
        id_tipo_competencia BIGINT (20) REFERENCES tipo_competencia (id),
        nome VARCHAR (30) NOT NULL,
        descricao VARCHAR (50) NOT NULL,
        peso BIGINT(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO competencia (nome,descricao, peso) VALUES
('Apresentação e Postura','aspectos pessoais e comportamento em sala', 15);
