CREATE TABLE competencia (
        id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
        nome VARCHAR (100) NOT NULL,
        descricao VARCHAR (800),
        peso BIGINT(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




INSERT INTO competencia (nome,descricao,peso) VALUES
('Apresentação e Postura','aspectos pessoais e comportamento em sala', 15);

INSERT INTO competencia (nome,descricao,peso) VALUES
('Comunicação oral','dicção, tom, firmeza de voz, vocabulário e erros de língua portuguesa', 9);

INSERT INTO competencia (nome,descricao,peso) VALUES
('Comunicação gestual','movimentação em sala, domínio do palco e capacidade de prender a atenção dos alunos', 7);

INSERT INTO competencia (nome,descricao,peso) VALUES
('Comunicação visual','qualidade do material utilizado na apresentação, do material de apoio aos alunos, da escrita e esquemas na lousa', 7);

INSERT INTO competencia (nome,descricao,peso) VALUES
('Clima da aula','(percepção do clima criado no ambiente pelo docente e ou a capacidade de criar um bom clima, bem como manter a disciplina em sala de aula', 8);

INSERT INTO competencia (nome,descricao,peso) VALUES
('Clareza nas explicações','utilização de exemplos, facilidade em responder aos questionamentos e o entendimento dos participantes', 15);

INSERT INTO competencia (nome,descricao,peso) VALUES
('Controle do tempo','controle e distribuição do tempo proposto', 5);

INSERT INTO competencia (nome,descricao,peso) VALUES
('Segurança','habilidade em transmitir e poder de convencimento', 10);

INSERT INTO competencia (nome,descricao,peso) VALUES
('Conhecimento do conteúdo', NULL, 17);

INSERT INTO competencia (nome,descricao,peso) VALUES
('Qualidade do planejamento e execução das aulas',NUll, 12);

INSERT INTO competencia (nome,descricao,peso) VALUES
('Compromisso com registros acadêmicos ',NULL, 16);

INSERT INTO competencia (nome,descricao,peso) VALUES
('Assiduidade e Pontualidade','frequência regular nos locais de trabalho, de acordo com as normas de conduta estabelecidas', 11);

INSERT INTO competencia (nome,descricao,peso) VALUES
('Compromisso com a operacionalização',NULL, 11);

INSERT INTO competencia (nome,descricao,peso) VALUES
('Participação do professor nas atividades institucionais ', NULL, 11);
