public class cuarentaidos {
    public static void main(String[] args) {
        double radio = 5.0;
        double area = calcularAreaCirculo(radio);
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    }

    // Método para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
