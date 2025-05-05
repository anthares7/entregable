import java.util.Scanner;

public class veintitres{
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número a buscar: ");
        int buscar = scanner.nextInt();
        boolean encontrado = false;

        for (int numero : numeros) {
            if (numero == buscar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número " + buscar + " está en el array.");
        } else {
            System.out.println("El número " + buscar + " no está en el array.");
        }

        scanner.close();
    }
}
