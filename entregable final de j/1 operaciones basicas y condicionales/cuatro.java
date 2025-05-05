import java.util.Scanner;

public class cuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingresa un numero: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("el numero es positivo.");
        } else if (number < 0) {
            System.out.println("el numero es negativo.");
        } else {
            System.out.println("el numero es cero");
        }

        scanner.close();
    }
}
