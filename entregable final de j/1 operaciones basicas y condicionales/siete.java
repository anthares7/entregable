import java.util.Scanner;

public class siete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor de la primera variable (a): ");
        int a = scanner.nextInt();

        System.out.print("Ingresa el valor de la segunda variable (b): ");
        int b = scanner.nextInt();

        System.out.println("Antes del intercambio: a = " + a + ", b = " + b);

        // Intercambiar valores
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Después del intercambio: a = " + a + ", b = " + b);

        scanner.close();
    }
}
