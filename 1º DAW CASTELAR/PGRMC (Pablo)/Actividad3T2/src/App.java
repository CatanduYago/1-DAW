import java.util.Random;
import java.util.Scanner;

public class App {

    public static void reloj(){ 
        int segundos = 0;
        int minutos = 0;
        int horas = 0;
        while (true) {
            System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
        
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                }
            }
        }
    }

    public static void potencia(){
    Scanner sc = new Scanner(System.in); 
    System.out.println("Ingresa un número como base:\n");
        int base = sc.nextInt();
        if (base < 0){
            System.out.println("El número no puede ser negativo");
            base = sc.nextInt();
        }

    System.out.println("Ingresa un número como exponente:\n");
        int exponente = sc.nextInt();
        if (exponente < 0){
            System.out.println("El número no puede ser negativo");
            exponente = sc.nextInt();
        }

        int potencia = 1;
        for (int i = 0; i < exponente; i++) {
            potencia *= base;
        }
        System.out.println("La potencia es: " + potencia);
        
    sc.close();
}   

    public static void frase(){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }
        sc.close();

}

    public static void limites(){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el limite inferior: ");
        int inf = sc.nextInt();
        System.out.println("Ingrese el limite superior: ");
        int sup = sc.nextInt();
        int suma = 0;
        int contador = 0;
        boolean salir = false;
        if (inf > sup){
            System.out.println("El limite inferior no puede ser mayor que el superior");
            inf = sc.nextInt();
            sup = sc.nextInt();
        }
        if (inf == sup){
            System.out.println("El limite inferior y el superior son iguales");
            salir = true;
        }
        while (!salir) {
            System.out.println("Ingrese un numero: ");
            int numero = sc.nextInt();
            if (numero == 0){
                salir = true;
            }
            if (numero >= inf && numero <= sup){
                suma += numero;
                contador++;
            }
        }
        System.out.println("La suma de los numeros dentro del intervalo es: " + suma);
        System.out.println("Cantidad de numeros fuera del intervalo: " + contador);
        if (contador == 0){
            System.out.println("No se han introducido numeros dentro del intervalo");
        }
        sc.close();
}

    public static void adivinar(){ //Adivinar un numero del 0 al 100 en maximo 10 intentos y contar los intentos en ls que se adivinA
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Ingresa un numero entre 0 y 100: ");
        int numero = sc.nextInt();
        int intentos = 10;
        int numeroAdivinado = rand.nextInt(100)+1;
        boolean salir = false;
        while (!salir) {
            System.out.println("Sigue intentadolo. Te quedan " + intentos+ " intentos");
            numero = sc.nextInt();
            while(numero!=numeroAdivinado){
                if(numero>numeroAdivinado){ {
                    System.out.println("Te has pasadoo");
                }}
                else if(numero<numeroAdivinado){
                    System.out.println("Ni de coña loco, tirale para arriba");
                }
                System.out.println("Ingrese un número: ");
                numeroAdivinado = sc.nextInt();
            }
            intentos--;
        }
        System.out.println("Has adivinado el numero: " + numeroAdivinado);
}



 public static void main(String[] args){     

        int opcion;
        Scanner sc = new Scanner(System.in);{
        opcion = 0;
        boolean salir = false;
    
        while(!salir){
            System.out.println("\n1. Cronómetro "+"\n2. Potencia de dos números "+ "\n3. Deletrear "+"\n4. Intervalos    "+"\n5. Ejercicio 5 ");
        
        
    
        try {System.out.print("Ingrese una opcion: \n");
            opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                reloj();   
                break;
            case 2: 
                potencia();
                break;
            case 3: 
                frase();
                break;
            case 4: 
                limites();
                break;
            case 5:
                adivinar();
                break;
            default:
                System.out.println("Opcion incorrecta, solo numeros entre 1 y 10");
                salir = false;
                break;
        }
       break;
       
       }
       
       catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } while ( salir = false); 


            }
        }

    }
}
