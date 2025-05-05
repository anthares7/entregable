import java.util.Scanner;

public class ocho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();

        if (numero < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            double raizCuadrada = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
        }

        scanner.close();
    }
}
