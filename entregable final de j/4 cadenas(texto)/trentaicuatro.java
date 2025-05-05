
import java.util.Scanner;

public class trentaicuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");

        // Verificar si es palíndroma
        String invertida = new StringBuilder(palabra).reverse().toString();
        if (palabra.equals(invertida)) {
            System.out.println("La palabra es palíndroma.");
        } else {
            System.out.println("La palabra no es palíndroma.");
        }

        scanner.close();
    }
}