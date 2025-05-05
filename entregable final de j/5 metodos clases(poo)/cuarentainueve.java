public class cuarentainueve {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        String invertida = invertirCadena(cadena);
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + invertida);
    }

    // Método estático que invierte una cadena
    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }
}