import java.util.Scanner;

public class diesinueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Ingresa un número: ");
int numero = scanner.nextInt();
int sumaDivisores = 0;
for (int i = 1; i < numero; i++) {
    if (numero % i == 0) {
        sumaDivisores += i;
    }
}
if (sumaDivisores == numero) {
    System.out.println(numero + " es un número perfecto.");
} else {
    System.out.println(numero + " no es un número perfecto.");
}
    }
}
