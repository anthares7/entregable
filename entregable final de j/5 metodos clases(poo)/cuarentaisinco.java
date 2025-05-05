

public class cuarentaisinco {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos", 30);
        persona.mostrarInformacion();
    }
}

class Persona {
    private String nombre;
    private int edad;

    // Constructor que utiliza 'this' para diferenciar los atributos de los parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre + ", Edad: " + this.edad);
    }
}
