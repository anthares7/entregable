import java.util.Scanner;

public class uno {
    public static void main(String[] args) {
        Scanner unoe = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = unoe.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        unoe.close();
    }
}