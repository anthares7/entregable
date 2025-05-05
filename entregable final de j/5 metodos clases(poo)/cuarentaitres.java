public class cuarentaitres {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5.0, 3.0);
        double area = rectangulo.calcularArea();
        System.out.println("El área del rectángulo es: " + area);
    }
}

class Rectangulo {
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área
    public double calcularArea() {
        return base * altura;
    }
}
