import java.util.Scanner;

public class trentaiuno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine().toLowerCase();

        int contadorVocales = 0;
        for (char c : frase.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("La cantidad de vocales en la frase es: " + contadorVocales);

        scanner.close();
    }
}
