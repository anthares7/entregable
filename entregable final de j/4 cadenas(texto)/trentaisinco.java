import java.util.Scanner;

public class trentaisinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la primera cadena: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Ingresa la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }

        scanner.close();
    }
}
