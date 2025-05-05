import java.util.Scanner;

public class trece {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
System.out.print("Ingresa un número: ");
int numero = sd.nextInt();
int cifras = String.valueOf(Math.abs(numero)).length();
System.out.println("El número tiene " + cifras + " cifras.");
    }
    
}
