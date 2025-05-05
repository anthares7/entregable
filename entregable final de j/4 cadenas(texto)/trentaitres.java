import java.util.Scanner;

public class trentaitres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        // Revertir la cadena
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();

        System.out.println("La cadena invertida es: " + cadenaInvertida);

        scanner.close();
    }
}
