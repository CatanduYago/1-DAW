package src;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    int resultado = src.Calculadora.resultado;
    Scanner sc = new Scanner(System.in);
    System.out.println(resultado);

    String operador = sc.nextLine();
    int num = sc.nextInt();
    
    switch (operador) {
        case "+":
        resultado = (resultado+num);
        System.out.println("="+resultado);
            break;
        case "-":
        resultado = (resultado-num);
        System.out.println("="+resultado);
        break;
        case "*":
        resultado = (resultado*num);
        System.out.println("="+resultado);
        break;
        case "/":
        resultado = (resultado/num);
        System.out.println("="+resultado);
        break;
        case "factorial":

        break;
        case "primo":

        break;
        case "CE":
        
        break;
        case "FIN":
        break;
        
    }
    sc.close();
    
    }
}