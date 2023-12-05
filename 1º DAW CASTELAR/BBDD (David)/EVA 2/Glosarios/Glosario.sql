/* Esto va a ser un glosario
de las sentencias SQL del tema 3*/

CREATE USER prueba IDENTIFIED BY 1234;                          --Crea un usuario.
GRANT connect,resource TO prueba;                               --Asigna permisos.

SELECT 'Hola' || ' mundo' FROM dual;                            --Junta cadena de caracteres
SELECT LENGTH ('Hola Mundo') AS "Nº Caracteres"  FROM dual ;    --Cuenta el numero de caracteres
SELECT UPPER ('Hola Mundo')  AS "Nº Caracteres"  FROM dual ;    --Pone en mayuscula todas las letras
SELECT LOWER ('Hola Mundo')  AS "Nº Caracteres"  FROM dual ;    --POne en minuscula todas las letras

SELECT POWER (2,3) AS "Potencia" FROM dual;                     --Hace 2 elevado a 3

SELECT SYSDATE FROM dual;                                       --Recoge la fecha actual del ordenador

SELECT TO_DATE ('29/11/23','DD MM YY') FROM dual;               --Le da formato fecha a unos caracteres

CREATE USER prueba_eliminacion IDENTIFIED BY 1234;              --Crea el usuario prueba eliminacion
SHOW USER;

CREATE TABLE usuarios (                                         --Crea la tabla usuarios
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
       ( 'Estopa'),
       ( 'David');
ALTER TABLE usuarios ADD (Apellido VARCHAR(10));

DESCRIBE usuarios;

ALTER TABLE usuarios DROP (Apellido);

CREATE TABLE tablacheck (
    nombre   NUMBER,
    apellido CHAR (25),
    clave    VARCHAR2(10),
    telefono NUMBER(6,2),
    saldo    NUMBER(10),
    cumpleaños DATE,
    CONSTRAINT constraint1 CHECK (nombre >=10 AND
                              clave IS NOT NULL AND
                              telefono NOT IN(091,092) AND
                              saldo= ANY (10,11) AND
                              apellido LIKE ('La%')
            )
            );

DROP TABLE tablacheck;

SELECT * FROM tablacheck;

INSERT INTO tablacheck(nombre) VALUES (5);

INSERT INTO tablacheck(nombre,clave) VALUES (14,1);

INSERT INTO tablacheck(nombre,clave,telefono) VALUES (10,2,192);

INSERT INTO tablacheck(nombre,clave,telefono,saldo) VALUES (10,3,192,10.5);

INSERT INTO tablacheck(nombre,clave,telefono,saldo,apellido,constraint1) VALUES (10,3,192,10,'La eh');

SELECT * FROM tablacheck;

CREATE TABLE restricciones(
    nombre CHAR (5),
    CONSTRAINT claveprimaria PRIMARY KEY (nombre)
);

CREATE TABLE restricciones2( nombre CHAR(5) CONSTRAINT clavprim1 PRIMARY KEY);

CREATE TABLE restricciones3(
nombre CHAR (5) CONSTRAINT clavprim2 PRIMARY KEY,
CONSTRAINT clavfor FOREIGN KEY (nombre) REFERENCES restricciones(nombre));

CREATE TABLE restricciones4(
nombre CHAR (5) CONSTRAINT clavprim1 PRIMARY KEY,
CONSTRAINT clavfor FOREIGN KEY (nombre) REFERENCES restricciones2(nombre));

INSERT ALL INTO restricciones(nombre) VALUES('Yago')
            INTO restricciones(nombre) VALUES('Yago')
            INTO restricciones(nombre) VALUES('Yago')
            INTO restricciones(nombre) VALUES('Yago')
            

;
            

SELECT * FROM USER_TABLES;

