import java.util.Arrays;

public class treinta {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Array original: " + Arrays.toString(numeros));

        // Rotar a la derecha
        int ultimo = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;

        System.out.println("Array después de rotar a la derecha: " + Arrays.toString(numeros));
    }
}