CREATE TABLE assunto (
codigo SERIAL NOT NULL, 
assunto varchar(20) NOT NULL UNIQUE, 
PRIMARY KEY (codigo)
);

CREATE TABLE autor (
codigo SERIAL NOT NULL, 
nome_completo varchar(50) NOT NULL, 
nome varchar(50) NOT NULL, 
PRIMARY KEY (codigo)
);

CREATE TABLE cliente (
codigo SERIAL NOT NULL, 
nome varchar(50) NOT NULL, 
endereco varchar(100) NOT NULL, 
telefone varchar(16) NOT NULL, 
cpf bigint UNIQUE, 
cnpj bigint UNIQUE, 
PRIMARY KEY (codigo)
);

CREATE TABLE editora (
codigo SERIAL NOT NULL, 
nome varchar(50) NOT NULL UNIQUE, 
endereco varchar(100) NOT NULL, 
telefone varchar(16) NOT NULL, 
gerente varchar(50) NOT NULL, 
PRIMARY KEY (codigo)
);

CREATE TABLE estado (
codigo integer NOT NULL, 
nome varchar(30) NOT NULL, 
sigla char(2) NOT NULL, 
PRIMARY KEY (codigo)
);

CREATE TABLE compra (
codigo SERIAL NOT NULL, 
data date NOT NULL, 
cod_cliente integer NOT NULL, 
PRIMARY KEY (codigo),
FOREIGN KEY (cod_cliente) REFERENCES cliente (codigo)
);

CREATE TABLE livro (
codigo SERIAL NOT NULL, 
titulo varchar(50) NOT NULL, 
isbn bigint NOT NULL UNIQUE, 
cod_editora integer NOT NULL, 
quantidade integer DEFAULT 0 NOT NULL, 
valor_unit real NOT NULL, 
PRIMARY KEY (codigo),
FOREIGN KEY (cod_editora) REFERENCES editora (codigo)
);

CREATE TABLE endereco_cliente (
codigo SERIAL NOT NULL,
cod_cliente integer NOT NULL, 
cep integer NOT NULL, 
logradouro varchar(100) NOT NULL, 
numero integer, 
complemento varchar(100), 
bairro varchar(50) NOT NULL, 
cidade varchar(50) NOT NULL, 
cod_estado integer NOT NULL, 
padrao bool NOT NULL,
PRIMARY KEY (codigo),
FOREIGN KEY (cod_cliente) REFERENCES cliente(codigo),
FOREIGN KEY (cod_estado) REFERENCES estado(codigo)
);

CREATE TABLE item_compra (
cod_compra integer NOT NULL, 
sequencia integer NOT NULL, 
cod_livro integer NOT NULL, 
quantidade integer NOT NULL, 
valor_unit real NOT NULL, 
PRIMARY KEY (cod_compra, sequencia),
FOREIGN KEY (cod_livro) REFERENCES livro (codigo),
FOREIGN KEY (cod_compra) REFERENCES compra (codigo)
);

CREATE TABLE livro_assunto (
cod_livro integer NOT NULL, 
cod_assunto integer NOT NULL, 
PRIMARY KEY (cod_livro, cod_assunto),
FOREIGN KEY (cod_livro) REFERENCES livro (codigo),
FOREIGN KEY (cod_assunto) REFERENCES assunto (codigo)
);

CREATE TABLE livro_autor (
cod_livro integer NOT NULL,
cod_autor integer NOT NULL, 
PRIMARY KEY (cod_livro, cod_autor),
FOREIGN KEY (cod_livro) REFERENCES livro (codigo),
FOREIGN KEY (cod_autor) REFERENCES autor (codigo)
);
