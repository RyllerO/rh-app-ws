CREATE TABLE avaliacao (
        id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
        membroAvaliador VARCHAR (150) NOT NULL,
        departamento VARCHAR (70) NOT NULL,
        professorAvaliado VARCHAR (150) NOT NULL,
        data TIMESTAMP NOT NULL,
        totalAvaliadores BIGINT(30) NOT NULL,
        avaliadorResponsavel VARCHAR (150) NOT NULL,
) ENGINE=InnoDB DEFAULT CHARSET=utf8;