import java.util.Scanner;

public class dos {
    public static void main(String[] args) {
        Scanner dos = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = dos.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = dos.nextInt();

        if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El número mayor es: " + numero2);
        } else {
            System.out.println("Ambos números son iguales.");
        }

        dos.close();
    }
}



