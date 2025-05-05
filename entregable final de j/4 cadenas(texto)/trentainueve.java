import java.util.Scanner;

public class trentainueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        // Eliminar los espacios de la frase
        String fraseSinEspacios = frase.replaceAll("\\s+", "");

        System.out.println("La frase sin espacios es: " + fraseSinEspacios);

        scanner.close();
    }
}
