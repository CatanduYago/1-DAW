import java.util.Scanner;
public class App {

public static void multiplo(){
Scanner sc = new Scanner(System.in);
    System.out.println("Escriba el primer numero: ");
float x = sc.nextInt();
    System.out.println("Escriba el segundo numero: ");
float y = sc.nextInt();
if (EsMultiplo(x,y) == 0)
    System.out.println("El número "+x+" es multiplo de "+ y);
else 
    System.out.println("El número "+x+" no es multiplo de "+y);

} 
public static float EsMultiplo(float x, float y){
    return (x % y);
    
} 

    public static void TempMedia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas medias quieres calcular");
        int calculosTotales = sc.nextInt();
        for (int i = 0; i < calculosTotales; i++) {
            System.out.println("Dame una temperatura máxima");
            float tempMax = sc.nextInt();
            System.out.println("Dame una temperatura mínima");
            float tempMin = sc.nextInt();
            System.out.println ("En el día " + i + " tenemos una temperatura media de: " + calcularMedia(tempMax, tempMin));
        }
    }
        public static float calcularMedia(float temperaturaMin, float temperaturaMax) {
        return (temperaturaMax + temperaturaMin) / 2;
    }

public static void espaciado(){ 
    //Pedir una frase e imprimirla con espaciado entre letra y letra
    Scanner sc = new Scanner(System.in);
    System.out.println("Escriba una frase");
    String frase = sc.nextLine();
    long longitud = frase.length();
    
    System.out.println(frase.charAt((int) (longitud -1)));


}

    public static String espaciadoString(String s) {
    return s + "\r";
    
    }

public static void main(String[] args) throws Exception {
    
    int opcion;
    Scanner sc = new Scanner(System.in);{
    opcion = 0;
    boolean salir = false;

    while(!salir){
        System.out.println("\n1. ¿Es multiplo? "+"\n2. Media de temperaturas "+ "\n3. Deletrear "+"\n4. Intervalos    "+"\n5. Adivina un numero entre el 1 y el 100 ");
    
    

    try {System.out.print("Ingrese una opcion: \n");
        opcion = sc.nextInt();

    switch (opcion) {
        case 1:
            multiplo();
            break;
        case 2: 
            TempMedia();
            break;
        case 3: 
            espaciado();
            break;
        case 4: 
            
            break;
        case 5:
            
            break;
        case 6:
            
            break;
        case 7:
            
            break;
        default:
            System.out.println("Opcion incorrecta, solo numeros entre 1 y 7");
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

   