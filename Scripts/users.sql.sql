CREATE ROLE diretor;
CREATE ROLE visitante;

/*TIRA O ACESSO DE TODOS OS USUARIOS AS FUNCOES ABAIXO*/
REVOKE ALL ON FUNCTION consulta_um(VARCHAR) FROM PUBLIC;
REVOKE ALL ON FUNCTION consulta_dois(VARCHAR, int, int) FROM PUBLIC;

/*CONCEDE ACESSO A CONSULTA 1 e 2 AO DIRETOR*/
GRANT EXECUTE ON FUNCTION consulta_um(VARCHAR) TO diretor;
GRANT EXECUTE ON FUNCTION consulta_dois(VARCHAR, int, int) TO diretor;

/*CONCEDE ACESSO A CONSULTA 2 AO VISITANTE*/
GRANT EXECUTE ON FUNCTION consulta_dois(VARCHAR, int, int) TO visitante;

CREATE ROLE dir LOGIN PASSWORD '111' IN ROLE diretor;
CREATE ROLE vis LOGIN PASSWORD '111' IN ROLE visitante;