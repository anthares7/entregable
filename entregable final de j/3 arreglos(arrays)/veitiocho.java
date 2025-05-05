import java.util.Arrays;

public class veitiocho {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Crear un nuevo array con la longitud combinada
        int[] combinado = new int[array1.length + array2.length];

        // Copiar elementos del primer array
        System.arraycopy(array1, 0, combinado, 0, array1.length);

        // Copiar elementos del segundo array
        System.arraycopy(array2, 0, combinado, array1.length, array2.length);

        System.out.println("Array combinado: " + Arrays.toString(combinado));
    }
}
