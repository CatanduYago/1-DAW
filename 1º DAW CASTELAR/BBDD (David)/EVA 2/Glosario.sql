/* Esto va a ser un glosario
de las sentencias SQL del tema 3*/

CREATE USER prueba IDENTIFIED BY 1234;  --Crea un usuario.
GRANT connect,resource TO prueba;       --Asigna permisos.

SELECT 'Hola' || ' mundo' FROM dual;
SELECT LENGTH ('Hola Mundo') AS "Nº Caracteres" FROM dual ;
SELECT UPPER ('Hola Mundo') AS "Nº Caracteres" FROM dual ;
SELECT LOWER ('Hola Mundo') AS "Nº Caracteres" FROM dual ;

SELECT POWER (2,3) AS "Potencia" FROM dual;

SELECT SYSDATE FROM dual;

SELECT TO_DATE ('29/11/23','DD MM YY') FROM dual;

CREATE USER prueba_eliminacion IDENTIFIED BY 1234;
SHOW USER;