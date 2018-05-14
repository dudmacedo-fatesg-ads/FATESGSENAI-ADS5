-- 1. Listar o nome completo de todos os empregados 
-- (juntar o nome e sobrenome).
SELECT CONCAT(nome, ' ', sobrenome) AS nome_completo
FROM Empregados;

-- 2. Mostrar os fornecedores que tenham Homepage, 
-- ordenados de forma descendente pelo
-- nome e apelidando as colunas quando necessário.
SELECT NomeDaEmpresa, HomePage
FROM Fornecedores
WHERE HomePage IS NOT NULL
ORDER BY NomeDaEmpresa DESC;

-- 3. Listar o nome do produto e seu preço unitário. 
-- Na coluna seguinte, deverá mostrar o
-- valor mínimo para venda do produto (desconto de 10%).
SELECT 
    NomeDoProduto, 
    PrecoUnitario, 
    CAST((PrecoUnitario * 0.9) AS DECIMAL(10, 2)) AS ValorMinimo
FROM Produtos;

-- 4. Listar os empregados cujo nome começa com a letra A e a 
-- terceira letra é d.
SELECT Nome
FROM Empregados
WHERE LEFT(Nome, 1) = 'A'
AND SUBSTRING( Nome, 3, 1) = 'e';

-- 5. Listar a quantidade de empregados por cargo. Posteriormente, 
-- listar apenas os cargos que possuem mais de dois empregados.
SELECT * FROM
(SELECT e.Cargo, count(*) AS Quantidade
FROM Empregados e
GROUP BY e.Cargo) t
WHERE t.Quantidade > 2;

-- 6. Listar o valor total vendido por produto. Posteriormente ignorar
-- na listagem os produtos abaixo de 30 reais.
SELECT * FROM
(SELECT p.CodigoDoProduto, p.NomeDoProduto, p.PrecoUnitario, SUM((d.PrecoUnitario * d.Quantidade)) AS ValorTotal
FROM Produtos p
INNER JOIN Detalhes_Pedido d
    ON p.CodigoDoProduto = d.CodigoDoProduto
GROUP BY p.CodigoDoProduto, p.NomeDoProduto, p.PrecoUnitario) t
WHERE t.PrecoUnitario >= 30;

-- 7. Listar o nome do fornecedor, o nome da categoria, o nome do 
-- produto e o preço unitário de cada produto. Realize uma consulta
-- por INNER JOIN e outra apenas com WHERE.
SELECT f.NomeDaEmpresa, c.NomeDaCategoria, p.NomeDoProduto, p.PrecoUnitario
FROM Produtos p
INNER JOIN Fornecedores f
    ON p.CodigoDoFornecedor = f.CodigoDoFornecedor
INNER JOIN Categorias c
    ON p.CodigoDaCategoria = c.CodigoDaCategoria;
--------------------------------------------------------------------------
SELECT f.NomeDaEmpresa, c.NomeDaCategoria, p.NomeDoProduto, p.PrecoUnitario
FROM Produtos p, Fornecedores f, Categorias c
WHERE p.CodigoDoFornecedor = f.CodigoDoFornecedor
AND p.CodigoDaCategoria = c.CodigoDaCategoria;

-- 8. Quais os fornecedores que fornecem produtos da categoria
-- “condimentos”?
SELECT f.*
FROM Fornecedores f
INNER JOIN Produtos p
    ON f.CodigoDoFornecedor = p.CodigoDoFornecedor
INNER JOIN Categorias c
	ON p.CodigoDaCategoria = c.CodigoDaCategoria
WHERE c.NomeDaCategoria = 'Condimentos';

-- 9. Listar todos os clientes ao qual o empregado Andrew 
-- já fez encomendas.
SELECT DISTINCT c.* FROM Clientes c
INNER JOIN Pedidos p
    ON c.CodigoDoCliente = p.CodigoDoCliente
INNER JOIN Empregados e
    ON p.CodigoDoFuncionário = e.CodigoDoFuncionario
WHERE e.Nome = 'Andrew';

-- 10. Listar o nome do produto, o nome da categoria e o preço unitário
-- do produto mais barato de cada categoria.
SELECT p.NomeDoProduto, t.NomeDaCategoria, p.PrecoUnitario FROM
(SELECT c.CodigoDaCategoria, c.NomeDaCategoria, MIN(p.PrecoUnitario) AS PrecoUnitario
FROM Produtos p
INNER JOIN Categorias c
    ON p.CodigoDaCategoria = c.CodigoDaCategoria
GROUP BY c.CodigoDaCategoria, c.NomeDaCategoria) t
INNER JOIN Produtos p
    ON p.CodigoDaCategoria = t.CodigoDaCategoria
WHERE p.PrecoUnitario = t.PrecoUnitario;

-- 11. Listar os produtos criando uma nova coluna por meio do comando
-- Case analisando a quantidade em estoque (estoque baixo, moderado e
-- alto).
SELECT 
    *,
    (CASE
        WHEN p.UnidadesEmEstoque < 25
            THEN 'Estoque Baixo'
        WHEN p.UnidadesEmEstoque >= 25 AND p.UnidadesEmEstoque < 100
            THEN 'Estoque Moderado'
        ELSE 'Estoque Alto'
    END) AS SituacaoEstoque
FROM Produtos p;

-- 12. Cria uma tabela denominada produtos_tmp com a mesma estrutura 
-- da tabela produtos.
-- Posteriormente importe todos os valores da tabela produtos para a
-- tabela produtos_tmp.
SELECT * INTO produtos_tmp FROM Produtos;

-- 13. Criar as seguintes tabelas abaixo e posteriormente praticar os
-- conceitos de operadores de conjuntos e SQL JOINS, utilizando também
-- a tabela Produtos.
-- * Produtos1 com os produtos de preço abaixo de 50 reais;
SELECT * INTO Produtos1 
FROM Produtos p 
WHERE p.PrecoUnitario < 50;
-- * Produtos2 com os produtos de preço acima de 50 reais;
SELECT * INTO Produtos2 
FROM Produtos p 
WHERE p.PrecoUnitario >= 50;

-- 14. Realizar a comparação das consultas entre as tabelas Produtos 
-- e Produtos2 utilizando SQL JOINS e SQL Aninhado.
SELECT * FROM Produtos p
LEFT JOIN Produtos2 p2 ON p2.CodigoDoProduto = p.CodigoDoProduto 
WHERE p2.CodigoDoProduto IS NOT NULL;

SELECT p.* FROM Produtos p, Produtos2 p2 
WHERE p.CodigoDoProduto = p2.CodigoDoProduto;











