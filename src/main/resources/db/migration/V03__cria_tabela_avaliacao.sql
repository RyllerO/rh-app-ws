CREATE TABLE avaliacao (
        id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
        membro_avaliador VARCHAR (150) NOT NULL,
        departamento VARCHAR (70) NOT NULL,
        professor_avaliado VARCHAR (150) NOT NULL,
        data VARCHAR (50) NOT NULL,
        total_avaliadores BIGINT(30) NOT NULL,
        avaliador_responsavel VARCHAR (150) NOT NULL,
        id_competencia BIGINT(20) REFERENCES competencia (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
