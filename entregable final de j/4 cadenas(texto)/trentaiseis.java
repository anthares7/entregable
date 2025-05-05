
import java.util.Scanner;

public class trentaiseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la primera cadena: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Ingresa la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        // Concatenar las cadenas
        String concatenada = cadena1 + " " + cadena2;

        System.out.println("La cadena concatenada es: " + concatenada);

        scanner.close();
    }
}