INSERT INTO assunto(codigo, assunto) VALUES (1, 'Ficção Fantástica');
INSERT INTO assunto(codigo, assunto) VALUES (2, 'Ficção Científica');
INSERT INTO assunto(codigo, assunto) VALUES (3, 'Mistério');
INSERT INTO assunto(codigo, assunto) VALUES (4, 'História');
INSERT INTO assunto(codigo, assunto) VALUES (5, 'História do Brasil');
INSERT INTO assunto(codigo, assunto) VALUES (6, 'História Geral');

INSERT INTO autor(codigo, nome_completo, nome) VALUES (1, 'George Raymond Richard Martin', 'George R. R. Martin');
INSERT INTO autor(codigo, nome_completo, nome) VALUES (2, 'Daniel Gerhard Brown', 'Dan Brown');
INSERT INTO autor(codigo, nome_completo, nome) VALUES (3, 'Reinaldo José Lopes', 'Reinaldo José Lopes');
INSERT INTO autor(codigo, nome_completo, nome) VALUES (4, 'Joanne Rowling', 'J. K. Rowling');
INSERT INTO autor(codigo, nome_completo, nome) VALUES (5, 'Martin Gilbert', 'Martin Gilbert');
INSERT INTO autor(codigo, nome_completo, nome) VALUES (6, 'John Boyne', 'John Boyne');
INSERT INTO autor(codigo, nome_completo, nome) VALUES (7, 'Oliver Jeffers', 'Oliver Jeffers');
INSERT INTO autor(codigo, nome_completo, nome) VALUES (8, 'John Ronald Reuel Tolkien', 'J. R. R. Tolkien');
INSERT INTO autor(codigo, nome_completo, nome) VALUES (9, 'Clive Staples Lewis', 'C. S. Lewis');

INSERT INTO editora(codigo, nome, endereco, telefone, gerente) VALUES (1, 'Leya', 'Av. Angélica, 2318 - 11º andar - Consolação, São Paulo - SP', '(11) 3129-5448', 'Carlos Santana');
INSERT INTO editora(codigo, nome, endereco, telefone, gerente) VALUES (2, 'Arqueiro', 'Rua Funchal, 538 - conjuntos 52 e 54 Vila Olimpia - CEP 04551-060, São Paulo-SP', '(11) 3868-4492', 'Manoel Ribeiro');
INSERT INTO editora(codigo, nome, endereco, telefone, gerente) VALUES (3, 'Harpercollins', 'São Paulo - SP', '(11) 4950-6800', 'Maria Souza e Silva');
INSERT INTO editora(codigo, nome, endereco, telefone, gerente) VALUES (4, 'Rocco', 'Av. Pres. Wilson, 231 - 8º andar 20030-021 Rio de Janeiro-RJ', '(21) 3525-2000', 'Corina Campos');
INSERT INTO editora(codigo, nome, endereco, telefone, gerente) VALUES (5, 'Casa da Palavra', 'Av. Angélica, 2318 - 11º andar - Consolação, São Paulo - SP', '(11) 3129-5448', 'Carlos Santana');
INSERT INTO editora(codigo, nome, endereco, telefone, gerente) VALUES (6, 'Seguinte', 'Rua Bandeira Paulista, 702, cj. 32 04532-002 - São Paulo-SP', '(11) 3707-3500', 'Luiz Schwarcz');
INSERT INTO editora(codigo, nome, endereco, telefone, gerente) VALUES (7, 'Martins Fontes', 'R. Prof Laerte Ramos de Carvalho 133 - Bela Vista - São Paulo-SP CEP 01325-030', '(11) 2167-9900', 'Ronaldo Martins');

INSERT INTO livro(codigo, titulo, isbn, cod_editora, quantidade, valor_unit) 
VALUES (1, 'As Crônicas de Gelo e Fogo - Vol. 1 -  A Guerra dos Tronos 1ª ed.', 4870000224623, 1, 50, 26.9);
INSERT INTO livro(codigo, titulo, isbn, cod_editora, quantidade, valor_unit) 
VALUES (2, 'As Crônicas de Gelo e Fogo - Vol. 2 - A Fúria dos Reis 1ª ed.', 4870000224586, 1, 50, 21.9);
INSERT INTO livro(codigo, titulo, isbn, cod_editora, quantidade, valor_unit) 
VALUES (3, 'As Crônicas de Gelo e Fogo - Vol. 3 - A Tormenta de Espadas 1ª ed.', 4870000224616, 1, 50, 21.9);
INSERT INTO livro(codigo, titulo, isbn, cod_editora, quantidade, valor_unit) 
VALUES (4, 'As Crônicas de Gelo e Fogo - Vol. 4 - A Dança dos Dragões 1ª ed.', 4870000224609, 1, 50, 21.9);
INSERT INTO livro(codigo, titulo, isbn, cod_editora, quantidade, valor_unit) 
VALUES (5, 'Origem 1ª ed.', 9788580417661, 2, 25, 39.9);
INSERT INTO livro(codigo, titulo, isbn, cod_editora, quantidade, valor_unit) 
VALUES (6, '1499 1ª ed.', 9788595080324, 3, 25, 23.3);
INSERT INTO livro(codigo, titulo, isbn, cod_editora, quantidade, valor_unit) 
VALUES (7, 'Harry Potter e a Câmara Secreta 1ª ed.', 9788532530790, 4, 75, 28.9);
INSERT INTO livro(codigo, titulo, isbn, cod_editora, quantidade, valor_unit) 
VALUES (8, 'Harry Potter e a Pedra Filosofal 1ª ed.', 9788532530783, 4, 75, 28.9);
INSERT INTO livro(codigo, titulo, isbn, cod_editora, quantidade, valor_unit) 
VALUES (9, 'A Primeira Guerra Mundial - Os 1.590 Dias que Transformaram o Mundo 1ª ed.', 9788544106037, 5, 30, 49.95);
INSERT INTO livro(codigo, titulo, isbn, cod_editora, quantidade, valor_unit) 
VALUES (10, 'O Menino Do Pijama Listrado 1ª ed.', 9788555340482, 6, 30, 32.9);
INSERT INTO livro(codigo, titulo, isbn, cod_editora, quantidade, valor_unit) 
VALUES (11, 'O Senhor dos Anéis - A Sociedade do Anel 2ª ed.', 9788533613379, 7, 30, 50);
INSERT INTO livro(codigo, titulo, isbn, cod_editora, quantidade, valor_unit) 
VALUES (12, 'O Senhor dos Anéis - As Duas Torres 2ª ed.', 9788533613386, 7, 30, 33.96);
INSERT INTO livro(codigo, titulo, isbn, cod_editora, quantidade, valor_unit) 
VALUES (13, 'O Senhor dos Anéis - O Retorno do Rei 2ª ed.', 9788533613393, 7, 30, 33.9);
INSERT INTO livro(codigo, titulo, isbn, cod_editora, quantidade, valor_unit) 
VALUES (14, 'O Senhor dos Anéis - Volume Único', 9788533613409, 7, 20, 199.9);
INSERT INTO livro(codigo, titulo, isbn, cod_editora, quantidade, valor_unit) 
VALUES (15, 'As Crônicas de Nárnia - Volume Único', 9788578270698, 7, 35, 77.82);

INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (1, 1);
INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (2, 1);
INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (3, 1);
INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (4, 1);
INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (5, 3);
INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (6, 4);
INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (6, 5);
INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (7, 1);
INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (8, 1);
INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (9, 4);
INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (9, 6);
INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (10, 1);
INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (11, 1);
INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (12, 1);
INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (13, 1);
INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (14, 1);
INSERT INTO livro_assunto(cod_livro, cod_assunto) VALUES (15, 1);

INSERT INTO livro_autor(cod_livro, cod_autor) VALUES (1, 1);
INSERT INTO livro_autor(cod_livro, cod_autor) VALUES (2, 1);
INSERT INTO livro_autor(cod_livro, cod_autor) VALUES (3, 1);
INSERT INTO livro_autor(cod_livro, cod_autor) VALUES (4, 1);
INSERT INTO livro_autor(cod_livro, cod_autor) VALUES (5, 2);
INSERT INTO livro_autor(cod_livro, cod_autor) VALUES (6, 3);
INSERT INTO livro_autor(cod_livro, cod_autor) VALUES (7, 4);
INSERT INTO livro_autor(cod_livro, cod_autor) VALUES (8, 4);
INSERT INTO livro_autor(cod_livro, cod_autor) VALUES (9, 5);
INSERT INTO livro_autor(cod_livro, cod_autor) VALUES (10, 6);
INSERT INTO livro_autor(cod_livro, cod_autor) VALUES (10, 7);
INSERT INTO livro_autor(cod_livro, cod_autor) VALUES (11, 8);
INSERT INTO livro_autor(cod_livro, cod_autor) VALUES (12, 8);
INSERT INTO livro_autor(cod_livro, cod_autor) VALUES (13, 8);
INSERT INTO livro_autor(cod_livro, cod_autor) VALUES (14, 8);
INSERT INTO livro_autor(cod_livro, cod_autor) VALUES (15, 9);


INSERT INTO estado(codigo, nome, sigla) VALUES ('Goiás', 'GO');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Distrito Federal', 'DF');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Mato Grosso', 'MT');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Mato Grosso do Sul', 'MS');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Rio Grande do Sul', 'RS');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Santa Catarina', 'SC');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Paraná', 'PR');
INSERT INTO estado(codigo, nome, sigla) VALUES ('São Paulo', 'SP');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Rio de Janeiro', 'RJ');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Espírito Santo', 'ES');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Minas Gerais', 'MG');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Bahia', 'BA');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Alagoas', 'AL');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Sergipe', 'SE');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Pernambuco', 'PE');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Paraíba', 'PB');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Rio Grande do Norte', 'RN');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Ceará', 'CE');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Piauí', 'PI');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Maranhão', 'MA');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Tocantins', 'TO');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Pará', 'PA');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Rondônia', 'RO');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Amazonas', 'AM');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Roraima', 'RR');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Acre', 'AC');
INSERT INTO estado(codigo, nome, sigla) VALUES ('Amapá', 'AP');















