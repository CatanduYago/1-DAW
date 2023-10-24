public class Rectangulo {
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        if (ancho >= 4 && ancho <= 10 && alto >= 4 && alto <= 10) {
            this.ancho = ancho;
            this.alto = alto;
        } else {
            System.out.println("Error: Ancho y alto deben estar en el rango de 5 a 10.");
        }
    }

    public int calcularArea() {
        return ancho * alto;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                sb.append("* ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(7, 6);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Representación del rectángulo:\n" + rectangulo.toString());
    }
}
