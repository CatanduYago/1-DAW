Algoritmo Juegovida
	// Definición de variables iniciales
Definir vidas, puntos, sumaDados Como Entero
Definir continuar Como Lógico
continuar <- Verdadero


vidas <- Aleatorio(1, 6)
puntos <- Aleatorio(1, 6)
Escribir "Comienzas con ", vidas, " vidas y ", puntos, " puntos."


Mientras (continuar)
    
    Dado1 <- Aleatorio(1, 6)
    Dado2 <- Aleatorio(1, 6)
    sumaDados <- Dado1 + Dado2
    Escribir "Has lanzado los dados. Dado 1:", Dado1, " Dado 2:", Dado2, " Suma:", sumaDados
    
    Si (sumaDados MOD 3 = 0 O sumaDados MOD 2 = 0) Entonces
        puntos <- puntos + 1
        Escribir "Sumas 1 punto. Puntos actuales:", puntos
    Sino Si (sumaDados MOD 2 <> 0 Y sumaDados MOD 3 <> 0 Y sumaDados <> 5) Entonces
			puntos <- puntos - 1
			Escribir "Restas 1 punto. Puntos actuales:", puntos
		FinSi
	FinSi
		
		Si (sumaDados = 5) Entonces
			Escribir "Obtuviste un 5. Fin del juego."
			continuar <- Falso
		Sino Si (sumaDados = 7 O puntos = 0) Entonces
				Escribir "Obtuviste un 7 o te quedaste sin vidas. Fin del juego. Puntuación final: 0 puntos."
				continuar <- Falso
			Fin Si
			
			Si (puntos <= 0) Entonces
				Escribir "Te quedaste sin vidas. Fin del juego. Puntuación final: 0 puntos."
				continuar <- Falso
			FinSi
		FinSi
	FinMientras
		Escribir "Puntuación final: ", puntos, " puntos."
FinAlgoritmo
