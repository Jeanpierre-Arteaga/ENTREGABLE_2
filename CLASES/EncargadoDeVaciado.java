package PROYECTO_GRUPO_3.CLASES;

public class EncargadoDeVaciado extends Persona {
    // ATRIBUTOS
    private String turno;

    // CONSTRUCTOR
    public EncargadoDeVaciado(String nombres, String apellidos, String turno) {
        super(nombres,apellidos);
        this.turno = turno;
    }

    // MÉTODO PARA VACIAR EL CONTENEDOR
    public void vaciarContenedor(Contenedor contenedor) {
        // Verificamos si el contenedor está lleno antes de vaciarlo
        if (contenedor.getCapacidadActual() >= contenedor.getCapacidadMaxima()) {
            System.out.println("El contenedor de tipo " + contenedor.getTipo() + " está lleno. Procediendo a vaciarlo...");
            contenedor.setCapacidadActual(0);  // Restablecemos la capacidad actual a 0
            System.out.println("El contenedor de tipo " + contenedor.getTipo() + " ha sido vaciado por " +nombres + " "+ apellidos + " que trabaja en turno " + turno);
        } else {
            System.out.println("El contenedor de tipo " + contenedor.getTipo() + " no está lleno aún.");
        }
    }

    // GETTERS Y SETTERS
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}