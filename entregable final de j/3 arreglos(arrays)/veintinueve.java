import java.util.Scanner;

public class veintinueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de notas: ");
        int cantidad = scanner.nextInt();
        double[] notas = new double[cantidad];
        double suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / cantidad;
        System.out.println("El promedio de las notas es: " + promedio);

        scanner.close();
    }
}
