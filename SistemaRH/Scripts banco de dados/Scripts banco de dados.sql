
-- ESSA CONSULTA MOSTRA TODOS OS CARGOS E EMPREGOS POR CONCURSO
SELECT ce.*
FROM cargo_emprego ce
INNER JOIN listadecargosempregos lc ON ce.codigo_cargo_emprego = lc.fk_codigo_cargo_emprego
WHERE lc.fk_codigo_concurso = 1;

-- NESSA CONSULTA EU ESCOLHO O CARGO E ELA ME MOSTRA TODOS OS CONCURSOS QUE TENHAM O CARGO OU EMPREGO ESCOLHIDO
SELECT c.*
FROM concurso_publico c
INNER JOIN listadecargosempregos lc ON c.codigo_concurso = lc.fk_codigo_concurso
WHERE lc.fk_codigo_cargo_emprego = 1;


SELECT *
FROM listadecargosempregos
WHERE fk_codigo_concurso = 1 AND fk_codigo_cargo_emprego = 1;

