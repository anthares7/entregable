import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        Scanner cinco  = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = cinco.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = cinco.nextDouble();

        System.out.println("Seleccione una operación (+, -, *, /):");
        char operation = cinco.next().charAt(0);

        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("El resultado es: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("El resultado es: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("El resultado es: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("El resultado es: " + result);
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }

        cinco.close();
    }
}
