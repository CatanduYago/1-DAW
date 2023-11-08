import java.util.Scanner;

class Calculadora {
    private static int resultado;
    
public Calculadora (int resultado) {
        resultado = 0;

        
}

    
public class App {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
   
    System.out.println(resultado);
    String operador = sc.nextLine();
    System.out.println(operador);
    int num = sc.nextInt();
    switch (operador) {
        case "+":
        resultado = (resultado+num);
            break;
        case "-":
        resultado = (resultado-num);
        break;
        case "*":
        resultado = (resultado*num);
        break;
        case "/":
        resultado = (resultado/num);
        break;
        case "factorial":

        break;
        case "primo":

        break;
        case "CE":
        resultado = 0;
        break;
        case "FIN":
        break;
        
    }
    
}
}
}




