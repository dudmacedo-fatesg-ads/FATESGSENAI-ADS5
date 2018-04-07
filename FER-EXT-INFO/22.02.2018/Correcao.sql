/* Corrigindo chaves primárias do banco */
ALTER TABLE Produtos
ADD PRIMARY KEY(CodigoDoProduto);

ALTER TABLE Categorias
ADD PRIMARY KEY(CodigoDaCategoria);

ALTER TABLE Fornecedores
ADD PRIMARY KEY(CodigoDoFornecedor);

ALTER TABLE Empregados
ADD PRIMARY KEY(CodigoDoFuncionario);

ALTER TABLE Pedidos
ADD PRIMARY KEY(NumeroDoPedido);

ALTER TABLE Clientes
ALTER COLUMN CodigoDoCliente NVARCHAR(5) NOT NULL;

ALTER TABLE Clientes
ADD PRIMARY KEY(CodigoDoCliente);

ALTER TABLE Transportadoras
ADD PRIMARY KEY(CodigoDaTransportadora);

ALTER TABLE Detalhes_Pedido
ALTER COLUMN NumeroDoPedido INTEGER NOT NULL;

ALTER TABLE Detalhes_Pedido
ADD PRIMARY KEY(NumeroDoPedido, CodigoDoProduto);

ALTER TABLE Pedidos
ADD CodigoDaTransportadora INTEGER;

-- Listando Categorias presentes na tabela Produtos
-- mas não cadastradas
SELECT DISTINCT p.CodigoDaCategoria 
FROM Produtos p
LEFT JOIN Categorias c ON p.CodigoDaCategoria = c.CodigoDaCategoria
WHERE c.CodigoDaCategoria IS NOT NULL;

-- Insert Categorias inexistentes
INSERT INTO 
    Categorias(CodigoDaCategoria, NomeDaCategoria, Descricao)
	VALUES(1, 'Bebidas', 'Refrigerantes, Café, Cerveja');
	
INSERT INTO 
    Categorias(CodigoDaCategoria, NomeDaCategoria, Descricao)
	VALUES(7, 'Orgânicos', 'Frutas Desidratadas, Tofu');

-- Listando Fornecedores presentes na tabela Produtos
-- mas não cadastrados
SELECT DISTINCT p.CodigoDoFornecedor 
FROM Produtos p
LEFT JOIN Fornecedores f ON p.CodigoDoFornecedor = f.CodigoDoFornecedor
WHERE f.CodigoDoFornecedor IS NOT NULL;

-- Listando Produtos presentes na tabela Detalhes_Pedido
-- mas não cadastrados
SELECT DISTINCT d.CodigoDoProduto
FROM Detalhes_Pedido d
LEFT JOIN Produtos p ON d.CodigoDoProduto = p.CodigoDoProduto
WHERE p.CodigoDoProduto IS NULL;

-- Insert Produtos inexistentes
INSERT INTO 
    Produtos(CodigodoProduto, NomeDoProduto, CodigoDoFornecedor, CodigoDaCategoria, QuantidadePorUnidade, PrecoUnitario, UnidadesEmEstoque, UnidadesPedidas, NivelDeReposicao, Descontinuado)
	VALUES(1, 'Coca-Cola', 1, 1, '1 garrafa de 2lt', 5.5, 45, 0, 25, 0);

INSERT INTO 
    Produtos(CodigodoProduto, NomeDoProduto, CodigoDoFornecedor, CodigoDaCategoria, QuantidadePorUnidade, PrecoUnitario, UnidadesEmEstoque, UnidadesPedidas, NivelDeReposicao, Descontinuado)
	VALUES(10, 'Sazon', 3, 2, '1 Sachê de 50g', 2.3, 33, 0, 25, 0);

-- Listando Pedidos presentes na tabela Detalhes_Pedido
-- mas não cadastrados
SELECT DISTINCT d.NumeroDoPedido
FROM Detalhes_Pedido d
LEFT JOIN Pedidos p ON d.NumeroDoPedido = p.NumeroDoPedido
WHERE p.NumeroDoPedido IS NULL;

-- Listando Clientes presentes na tabela Pedidos
-- mas não cadastrados
SELECT DISTINCT p.CodigoDoCliente
FROM Pedidos p
LEFT JOIN Clientes c ON p.CodigoDoCliente = c.CodigoDoCliente
WHERE c.CodigoDoCliente IS NULL;

-- Listando Empregados presentes na tabela Pedidos
-- mas não cadastrados
SELECT DISTINCT p.CodigoDoFuncionário
FROM Pedidos p
LEFT JOIN Empregados e ON p.CodigoDoFuncionário = e.CodigoDoFuncionario
WHERE e.CodigoDoFuncionario IS NULL;

-- Insert Empregados inexistentes
INSERT INTO 
    Empregados
	(CodigoDoFuncionario, Sobrenome, Nome,   Cargo,  Tratamento, DataDeNascimento,    DataDeContratacao,
	Endereco,             Cidade,    Regiao, CEP,    Pais,       TelefoneResidencial, Ramal, 
	Observacoes,          Supervisor)
	VALUES
	(1, 'Alves', 'João', 'Representante de Vendas', 'Sr.', '19700517', '19950222', 
	'Rua das Acácias 1025', 'Goiânia', 'GO', '74000-000', 'Brasil', '+55 62 3394-0300', NULL,
	'O cara das vendas', 5);

INSERT INTO 
    Empregados
	(CodigoDoFuncionario, Sobrenome, Nome,   Cargo,  Tratamento, DataDeNascimento,    DataDeContratacao,
	Endereco,             Cidade,    Regiao, CEP,    Pais,       TelefoneResidencial, Ramal, 
	Observacoes,          Supervisor)
	VALUES
	(5, 'Queiroz', 'Ulisses', 'Coordenador de Vendas', 'Sr.', '19680106', '19920703', 
	'Avenida Paulista 5552', 'São Paulo', 'SP', '01000-000', 'Brasil', '+55 11 4567-8888', NULL,
	'Formado no MOBRAL', 2);

/* Criando relacionamentos faltantes */
ALTER TABLE Produtos
ADD FOREIGN KEY (CodigoDaCategoria) REFERENCES Categorias(CodigoDaCategoria);

ALTER TABLE Produtos
ADD FOREIGN KEY (CodigoDoFornecedor) REFERENCES Fornecedores(CodigoDoFornecedor);

ALTER TABLE Detalhes_Pedido
ADD FOREIGN KEY (CodigoDoProduto) REFERENCES Produtos(CodigoDoProduto);

ALTER TABLE Detalhes_Pedido
ADD FOREIGN KEY (NumeroDoPedido) REFERENCES Pedidos(NumeroDoPedido);

ALTER TABLE Pedidos
ADD FOREIGN KEY (CodigoDoCliente) REFERENCES Clientes(CodigoDoCliente);

ALTER TABLE Pedidos
ADD FOREIGN KEY (CodigoDaTransportadora) REFERENCES Transportadoras(CodigoDaTransportadora);

ALTER TABLE Pedidos
ADD FOREIGN KEY (CodigoDoFuncionário) REFERENCES Empregados(CodigoDoFuncionario);






















