import java.util.Scanner;
import java.util.Random;

public class App {

    public static void valores() {

        Random aleatorio = new Random();
        int vector_numeros[];
        vector_numeros = new int[2];
        for (int i = 0; i < vector_numeros.length; i++) {
            int numero = aleatorio.nextInt(10) + 1;
            vector_numeros[i] = numero;
            int valor = vector_numeros[i];
            int cuadrado = valor * valor;
            int cubo = cuadrado * valor;

            System.out.println(valor + " Su cuadrado es: " + cuadrado + " y su cubo es: " + cubo);
        }

        for (int numero : vector_numeros) {
            System.out.println(numero + "-" + numero * numero + "-" + numero * numero * numero);

        }
    }

    public static void invertir() {
        Scanner sc = new Scanner(System.in);

        String[] original = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". ");
            original[i] = sc.nextLine();
        }

        String[] invertido = new String[5];

        for (int i = 0; i < 5; i++) {
            invertido[i] = original[4 - i];
        }

        System.out.println("Vector Invertido:");
        mostrarVector(invertido);
    }

    public static void mostrarVector(String[] vector) {
        for (String elemento : vector) {
            System.out.print(elemento + " ");
        }
    }

    public static void media() {
        Scanner sc = new Scanner(System.in);
        String[] notas = new String[5];

        for (int i = 0; i > 0; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextLine();

        }
        System.out.println(notas);

    }

    public static void vector() {

        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        int numero;
        int contador = 0;
        int l = 0;
        while (contador < 10) {
            l++;
            System.out.print( (l) + ". ");
            numero = sc.nextInt();

            if (numero < 0) {
                break;
            }

            vector[contador] = numero;
            contador++;
        }

        System.out.print("Vector: ");
        for (int i = 0; i < contador; i++) {
            System.out.print(vector[i] + " ");
        }
    }

    public static void main(String[] args) {

        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "\nIngrese una opcion: \n 1. Calcular el cuadrado y el cubo de un número. \n 2. Inversion de cadena de caracteres \n 3. Muestra la nota mas alta, la mas baja y la media \n 4. Introduce 10 elementos \n 6. Salir\n"
                        + " ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1: // Calcula cuadrado y cubo de un numero introducido por teclado
                System.out.println("Ejercicio 1\n Ingrese un numero entero: ");
                valores();
                break;
            case 2: // Invierte una cadena e caracteres introducida
                System.out.println("Ejercicio 2\n Ingrese una cadena de caracteres: ");
                invertir();
                break;
            case 3: // Muestra la nota mas alta, la mas baja y la media
                System.out.println("Ejercicio 3\n Ingrese tres numeros: ");
                media();
                break;
            case 4: //
                System.out.println("Ejercicio 4\n  ");
                vector();
                break;
            case 5://
                System.out.println("Ejercicio 5\n ");

                break;
            case 6:
                break;
            default:
                System.out.println("Opción incorrecta, solo numeros entre 1 y 6");
                break;
        }
    }
}
