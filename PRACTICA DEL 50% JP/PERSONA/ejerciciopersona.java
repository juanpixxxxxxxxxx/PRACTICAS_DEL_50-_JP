package ejerciciopersona;


public class ejerciciopersona {
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private int anoNacimiento;
    private String paisNacimiento;
    private char genero;

    public ejerciciopersona(String nombre, String apellido, String numeroDocumento, int anoNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.anoNacimiento = anoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Número de Documento: " + numeroDocumento);
        System.out.println("Año de Nacimiento: " + anoNacimiento);
        System.out.println("País de Nacimiento: " + paisNacimiento); // Mostrar el nuevo atributo
        System.out.println("Género: " + genero); // Mostrar el nuevo atributo
    }

    public static void main(String[] args) {
        ejerciciopersona persona = new ejerciciopersona("Juan", "Pérez", "12345678", 1990, "España", 'H');

        System.out.println("Datos de la Persona:");
        persona.imprimir();
    }
}
