import java.util.Arrays;
import java.util.LinkedHashSet;

public class veintisiete {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 2, 4, 5, 1, 6, 3, 7};

        // Usar LinkedHashSet para eliminar duplicados y mantener el orden
        LinkedHashSet<Integer> conjunto = new LinkedHashSet<>();
        for (int numero : numeros) {
            conjunto.add(numero);
        }

        // Convertir el conjunto de nuevo a un array
        int[] sinDuplicados = conjunto.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Array sin duplicados: " + Arrays.toString(sinDuplicados));
    }
}