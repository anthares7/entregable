public class cuarentaiocho {
    public static void main(String[] args) {
        int[] numeros = {3, 7, 2, 9, 4};
        int maximo = encontrarMaximo(numeros);
        System.out.println("El valor máximo en el array es: " + maximo);
    }

    // Método que recibe un array y devuelve el máximo
    public static int encontrarMaximo(int[] numeros) {
        int maximo = numeros[0];
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }
}
