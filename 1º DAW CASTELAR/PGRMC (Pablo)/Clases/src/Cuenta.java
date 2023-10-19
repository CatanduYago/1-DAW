public class Cuenta {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private int genero;
    private double peso;
    private double altura;

    public Cuenta(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public Cuenta(String nombre, String apellido1, String apellido2, int genero) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double calcularIMC() {
        if (altura <= 0) {
            return 0; 
        }
        return peso / (altura * altura);
    }

    public boolean isMayordeedad() {
        return edad > 18;
    }

    public boolean isSobrepeso() {
        double imc = calcularIMC();
        return imc > 20;
    }

Cuenta mayordeedad = new Cuenta("Yago", "Catalano", "Andújar");
mayordeedad.setedad(19);
mayordeedad.setpeso(61.8);
mayordeedad.setaltura(1.71);
}
