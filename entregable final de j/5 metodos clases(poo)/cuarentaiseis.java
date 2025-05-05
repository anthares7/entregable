public class cuarentaiseis {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Suma de enteros
        int sumaEnteros = calculadora.suma(5, 10);
        System.out.println("Suma de enteros: " + sumaEnteros);

        // Suma de números de punto flotante
        double sumaDoubles = calculadora.suma(5.5, 10.2);
        System.out.println("Suma de doubles: " + sumaDoubles);
    }
}

class Calculadora {
    // Método para sumar enteros
    public int suma(int a, int b) {
        return a + b;
    }

    // Método para sumar números de punto flotante
    public double suma(double a, double b) {
        return a + b;
    }
}