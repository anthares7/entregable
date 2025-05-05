import java.util.Scanner;

public class venite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Ingresa un número: ");
int numero = scanner.nextInt();
String numeroStr = String.valueOf(numero);
String invertido = new StringBuilder(numeroStr).reverse().toString();
if (numeroStr.equals(invertido)) {
    System.out.println(numero + " es un número capicúa.");
} else {
    System.out.println(numero + " no es un número capicúa.");
}
    }
}
