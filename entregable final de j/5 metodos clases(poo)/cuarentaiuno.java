public class cuarentaiuno {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 25);
        persona.mostrarInformacion();
    }
}

class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
