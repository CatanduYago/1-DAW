CREATE TABLE Libro (
    autor CHAR,
    titulo CHAR,
    indice NUMBER,
    editor CHAR, 
    clase  CONSTRAINT clase REFERENCES Clase_nueva(clave),
    prestado CHAR
);
CREATE TABLE Usuario (
    secuencia CHAR PRIMARY KEY,
    nombre CHAR,
    sexo CHAR(1),
    direccion CHAR,
    fecha_ingreso DATE
);
CREATE TABLE Clase_nueva (
    clave INT PRIMARY KEY ,
    planta INT,
    tiempo_de_prestamo DATE NOT NULL
);
CREATE TABLE Prestamo (
    codigo CONSTRAINT fk_codigo REFERENCES Libro (codigo),
    secuencia CONSTRAINT fk_secuencia REFERENCES Usuarios(secuencia),
    cuantia CHAR,
    fecha_inicio DATE
);
