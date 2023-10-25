    public static void espaciado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String entrada = scanner.nextLine();
        String resultado = espaciado(entrada);

        System.out.println("" + resultado);
    }

    public static String espaciado(String texto) {
        String resultado="";
        for (int i = 0; i < texto.length(); i++) {

            resultado= texto.charAt(i) + "";
        }
        return resultado;
    }

    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    public static void areayperimetro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);

        System.out.println("El área de la circunferencia es: " + Math.round(area));
        System.out.println("El perímetro de la circunferencia es: " + Math.round(perimetro));
    }
