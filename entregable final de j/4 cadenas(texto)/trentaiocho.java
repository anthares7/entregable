import java.util.Scanner;

public class trentaiocho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        System.out.print("Ingresa la letra que deseas contar: ");
        char letra = scanner.next().charAt(0);

        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if (c == letra) {
                contador++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la cadena.");

        scanner.close();
    }
}
