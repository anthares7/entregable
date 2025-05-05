import java.util.Scanner;

public class trentaidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine().trim();

        // Dividir la frase en palabras usando espacios como delimitador
        String[] palabras = frase.split("\\s+");
        int cantidadPalabras = palabras.length;

        System.out.println("La cantidad de palabras en la frase es: " + cantidadPalabras);

        scanner.close();
    }
}