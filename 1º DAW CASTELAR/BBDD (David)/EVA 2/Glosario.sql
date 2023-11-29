/* Esto va a ser un glosario
de las sentencias SQL del tema 3*/

CREATE USER prueba IDENTIFIED BY 1234;  --Crea un usuario.
GRANT connect,resource TO prueba;       --Asigna permisos.

SELECT 'Hola' || ' mundo' FROM dual;
SELECT LENGTH ('Hola Mundo') AS "Nº Caracteres"  FROM dual ;
SELECT UPPER ('Hola Mundo')  AS "Nº Caracteres"  FROM dual ;
SELECT LOWER ('Hola Mundo')  AS "Nº Caracteres"  FROM dual ;

SELECT POWER (2,3) AS "Potencia" FROM dual;

SELECT SYSDATE FROM dual;

SELECT TO_DATE ('29/11/23','DD MM YY') FROM dual;

CREATE USER prueba_eliminacion IDENTIFIED BY 1234;
SHOW USER;

CREATE TABLE usuarios (
    nombre      CHAR (30),
    clave       VARCHAR2(10),
    telefono    NUMBER (10),
    saldo       NUMBER (6,2),
    cumpleaños  DATE,
    fecha       TIMESTAMP,
    bool        NUMBER(1,0),
    imagen      BLOB,
    descripcion CLOB
    
    );

DESCRIBE usuarios;

INSERT INTO usuarios(nombre) VALUES ('Yago');

SELECT * FROM usuarios;

INSERT INTO usuarios(nombre) VALUES ('Ramon');
INSERT INTO usuarios(nombre) VALUES ('Manu');

SELECT * FROM usuarios;

INSERT INTO usuarios(nombre,clave,telefono,saldo) VALUES ('Oscar','Lint','644850136','20,35');

SELECT * FROM usuarios;

INSERT INTO usuarios(clave) VALUES ('Miguel') WHERE clave='NULL';

CREATE TABLE borrados(
    nombre CHAR);
    
DROP TABLE BORRADOS;

INSERT INTO usuarios(cumpleaños) VALUES ('21-Noviembre-04');

SELECT * FROM usuarios;

INSERT INTO usuarios(cumpleaños,fecha) VALUES ('11-02-2006','29-11-2023');

SELECT * FROM usuarios;

INSERT ALL INTO usuarios (nombre) VALUES ('Yoya'),
            INTO usuarios (nombre) VALUES ('Estopa')
            INTO usuarios (nombre) VALUES ('David');
            
ALTER TABLE usuarios ADD (Apellido VARCHAR(10));

DESCRIBE usuarios;

ALTER TABLE usuarios DROP (Apellido);

CREATE TABLE tablacheck (
    nombre   NUMBER,
    clave    VARCHAR2(10),
    telefono NUMBER(6,2),
    saldo    NUMBER(10),
    cumpleaños DATE,
    CHECK (nombre >=10 AND
            clave IS NOT NULL AND
            telefono NOT IN(091,092) AND
            saldo<> ANY (10,11) AND
            telefono > ALL (0,00,000,'000%')
            )
            );
        
SELECT * FROM tablacheck;