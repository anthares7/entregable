import java.util.Scanner;

public class trentaisiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        System.out.print("Ingresa la letra que deseas reemplazar: ");
        char letraOriginal = scanner.next().charAt(0);

        System.out.print("Ingresa la nueva letra: ");
        char nuevaLetra = scanner.next().charAt(0);

        // Reemplazar letras en la cadena
        String cadenaModificada = cadena.replace(letraOriginal, nuevaLetra);

        System.out.println("La cadena modificada es: " + cadenaModificada);

        scanner.close();
    }
}
