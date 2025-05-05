import java.util.Scanner;

public class cuarenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        // Convertir a mayúsculas
        String mayusculas = cadena.toUpperCase();
        System.out.println("En mayúsculas: " + mayusculas);

        // Convertir a minúsculas
        String minusculas = cadena.toLowerCase();
        System.out.println("En minúsculas: " + minusculas);

        scanner.close();
    }
}