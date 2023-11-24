CREATE TABLE Libro (
    autor CHAR,
    titulo CHAR,
    indice NUMBER (p),
    editor CHAR, 
    clase  CONSTRAINT fk_clase REFERENCES Clase(clave),
    prestado BOOLEAN DEFAULT TRUE
);
CREATE TABLE Usuario (
    secuencia AUTO PRIMARY KEY UNIQUE,
    nombre CHAR,
    sexo CHAR(1),
    direccion CHAR,
    fecha_ingreso DATE
);
CREATE TABLE Clase_nueva (
    clave INT PRIMARY KEY UNIQUE,
    planta INT,
    tiempo_de_prestamo DATE NOT NULL
);
CREATE TABLE Prestamo (
    codigo CONSTRAINT fk_codigo REFERENCES Libro (codigo),
    secuencia CONSTRAINT fk_secuencia REFERENCES Usuarios (secuencia),
    cuantia CHAR(),
    fecha_inicio DATE
);
