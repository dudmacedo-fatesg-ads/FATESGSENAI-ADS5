/* */
SELECT 
   l.titulo
FROM livro l 
INNER JOIN livro_autor la ON l.codigo = la.cod_livro
INNER JOIN autor a ON a.codigo = la.cod_autor
WHERE
   a.nome = 'J. R. R. Tolkien';

/* */
SELECT
   
FROM compra c
