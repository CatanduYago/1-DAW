import java.util.Random;
import java.util.Scanner;

public class App {  
    public static void cuadrado(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        while(num>=0)
        {
            System.out.println("Elcuadrado del numero introducido es: "+num*num);
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
        }
    sc.close();
}

public static void media(){
Scanner sc = new Scanner(System.in);
System.out.println("Ingrese un numero: ");
int num = sc.nextInt();
while(num>=0)
{
    System.out.println("La media de los números introducidos es: "+num/2);
    System.out.println("Ingrese un numero: ");
    num = sc.nextInt();
}
sc.close();
}

public static void numeros(){
    int num = 100;   
    while (num >= 0) {
        System.out.println(num);       
        num -= 7;
    }
}

public static void producto(){ 
    int num = 1;
    while (num <= 19) {
        System.out.println(num);
        num += 2;
    }
}

public static void medias2(){
    Scanner sc = new Scanner(System.in);
        
    double sumaPositivos = 0;
    double sumaNegativos = 0;
    int contadorCeros = 0;
    
    for (int i = 0; i < 10; i++){
        System.out.print("Ingrese un número: ");
        double numero = sc.nextDouble();  
        if (numero > 0){
            sumaPositivos += numero;
        }
        else if (numero < 0){
            sumaNegativos += numero;
        }
        else{
            contadorCeros++;
        }
        double mediaPositivos = sumaPositivos / (10 - contadorCeros);
        double mediaNegativos = sumaNegativos / (10 - contadorCeros);
        System.out.println("Media de los números positivos: " + mediaPositivos);
        System.out.println("Media de los números negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros: " + contadorCeros);
    }
    sc.close();
}

public static void tablamultiplicar(){ 
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un numero entre 1 y 10: ");
    int num = sc.nextInt();
    while(num>=0 && num<=10)
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(num+" x "+i+" = "+(num*i));
        }
        System.out.println("Ingrese un numero entre 1 y 10: ");
        num = sc.nextInt();
    }
    sc.close();
}

public static void sueldos(){ 
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int num = sc.nextInt();
    while(num>=0)
    {
        System.out.println("El sueldo máximo es: "+(num*100));
        System.out.println("Ingrese un número: ");
        num = sc.nextInt();
    }
    sc.close();   
}

public static void adivinar(){  
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int num = sc.nextInt();
    Random rand = new Random();
    int numero = rand.nextInt(15)+1;
    while(num!=numero){
        if(num>numero) {
            System.out.println("Te has pasadoo");
        }
        else if(num<numero){
            System.out.println("Ni de coña loco, tirale para arriba");
        }
        System.out.println("Ingrese un número: ");
        num = sc.nextInt();
    }
    System.out.println("GENIO!!!");
    sc.close();
}

public static void primos(){ 
    Scanner sc = new Scanner(System.in);       
    System.out.print("Ingrese un número para comprobar si es primo: ");
    int n = sc.nextInt(); 
    if (esPrimo(n)) {
        System.out.println(n + " es un número primo.");
    } else {
        System.out.println(n + " no es un número primo.");
    }
    sc.close();
}

public static boolean esPrimo(int numero){
    if (numero <= 1) {
        return false; 
    }
    for (int i = 2; i <= Math.sqrt(numero); i++){
        if (numero % i == 0) {
            return false;
        }
    }
    return true; 
}


public static void caja(){ 
            Scanner sc = new Scanner(System.in);
            final int COMBINACION_CORRECTA = 1234;
            int intentos = 4;
            while (intentos > 0){
                System.out.print("Introduzca la combinación de la caja fuerte (4 cifras): ");
                int intento = sc.nextInt();
                
                if (intento == COMBINACION_CORRECTA){
                    System.out.println("Has abierto la caja fuerte.");
                    break;
                } else{
                    intentos--;
                    if (intentos > 0) {
                        System.out.println("Clave incorrecta. Te quedan " + intentos + " intentos.");
                    } else{
                        System.out.println("Lo siento, has agotado las 4 oportunidades.");
                    }
                }
            }
            
            sc.close();
        }

public static void main(String[] args){


    int opcion;
    Scanner sc = new Scanner(System.in); 
    opcion = 0;
    boolean salir = false;

    while(!salir){
        System.out.println("\n1. Cuadrado de un número. "+"\n2. Media de vario números. "+ "\n3. Del 100 a 0. "+"\n4. Producto de los 10 impares. "+"\n5. Media numeros negativos y positivos. "+"\n6. Tabla de multiplicar. "+"\n7. Sueldo máximo "+"\n8. Adivinar un número"+"\n9. ¿Es núero primo? "+"\n10. Control acceso caja fuerte "+"\n11. Salir.\n\n");
    
    try {System.out.print("Ingrese una opcion: \n");
        opcion = sc.nextInt();

    switch (opcion){
        case 1:
            System.out.println();
            cuadrado();        
            break;
        case 2: 
            System.out.println();
            media();
            break;
        case 3: 
            System.out.println();
                numeros();      
            break;
        case 4: 
            System.out.println();
            producto();
            break;
        case 5:
            System.out.println();
           medias2();
            break;
        case 6:
            System.out.println();
            tablamultiplicar();
            break;
        case 7: 
            System.out.println();
            sueldos();
            break;
        case 8: 
            System.out.println();
            adivinar();
            break;
        case 9: 
            System.out.println();                  
            primos();
            break;
        case 10: 
            System.out.println();
            caja();
            break;
        case 11:
            break;
        default:
            System.out.println("Opcion incorrecta, solo numeros entre 1 y 10");
            salir = false;
            break;
}
break;
    } catch (Exception e){
        System.out.println("Error: " + e.getMessage());

    } while ( salir = false); 

}
}
}