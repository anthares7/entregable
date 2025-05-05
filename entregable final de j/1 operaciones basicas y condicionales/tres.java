import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        Scanner tres = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = tres.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = tres.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int numero3 = tres.nextInt();

        int mayor;

        if (numero1 > numero2 && numero1 > numero3) {
            mayor = numero1;
        } else if (numero2 > numero1 && numero2 > numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        System.out.println("El número mayor es: " + mayor);

        tres.close();
    }
}
