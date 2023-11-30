import java.util.Scanner;

public class App {

    public static void alumnos() {
        Scanner sc = new Scanner(System.in);
        String[][] matriz = {
            {"Yago", "Manu", "Oscar"},
            {String.valueOf(19),String.valueOf(22) , String.valueOf(19)}};

        String elemento = matriz[1][0];
        String nombre = matriz [0][0];
        System.out.println("Alumno: "+ nombre+". Tiene: " +elemento+ " años");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i < matriz.length || j < matriz[i].length) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    public static void main(String[] args) throws Exception {

        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "\nIngrese una opcion: \n 1.  \n 2.  \n 3.  \n 4.  \n 5.  \n 6. Salir\n");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1: //
                System.out.println("Ejercicio 1\n ");
                alumnos();
                break;
            case 2: //
                System.out.println("Ejercicio 2\n  ");

                break;
            case 3: //
                System.out.println("Ejercicio 3\n  ");

                break;
            case 4: //
                System.out.println("Ejercicio 4\n  ");

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
