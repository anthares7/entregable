public class cuarentaisiete {
    public static void main(String[] args) {
        Numero numero = new Numero();

        int valor = 29;
        if (numero.esPrimo(valor)) {
            System.out.println("El número " + valor + " es primo.");
        } else {
            System.out.println("El número " + valor + " no es primo.");
        }
    }
}

class Numero {
    // Método para verificar si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}