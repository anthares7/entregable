import java.util.Scanner;

public class diesiciete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Ingresa el número de términos de la serie Fibonacci: ");
int n = scanner.nextInt();
int a = 0, b = 1;
System.out.print("Serie Fibonacci: " + a + ", " + b);
for (int i = 3; i <= n; i++) {
    int siguiente = a + b;
    System.out.print(", " + siguiente);
    a = b;
    b = siguiente;
}
System.out.println();
    }
}
