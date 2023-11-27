import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int vector_numeros [];
        vector_numeros = new int [2];
        for (int i = 0; i<vector_numeros.length;i++){
            int numero = aleatorio.nextInt (10)+1;
            vector_numeros [i] = numero;
            int valor = vector_numeros [i];
            int cuadrado = valor *valor;
            int cubo = cuadrado * valor;

            System.out.println(valor+" Su cuadrado es: "+ cuadrado + " y su cubo es: "+ cubo);
        }

    for (int numero : vector_numeros) {
        System.out.println(numero + "-" + numero*numero+ "-"+ numero*numero*numero);

    }
    }
    
}
