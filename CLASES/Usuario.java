package PROYECTO_GRUPO_3.CLASES;
public class Usuario extends Persona {
    // ATRIBUTOS PROPIOS
    private double saldo;
    private String ID;
    private String contraseña;

    // CONSTRUCTORES
    public Usuario() {
        super();
    }

    public Usuario(String nombres, String apellidos, String email, int edad, String distrito, String ID, String contraseña) {
        super(nombres, apellidos, email, edad, distrito);
        this.saldo = 0.0;
        this.ID = ID;
        this.contraseña = contraseña;
    }

    // MÉTODOS SETTERS Y GETTERS
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getID() {
        return ID;
    }

    public String getContraseña() {
        return contraseña;
    }

    // Método para mostrar datos con saldo, ID y contraseña
    public String mostrarDatos() {
        StringBuilder tabla = new StringBuilder(super.mostrarDatos());

        tabla.append(String.format("| %s | %s |\n", 
                centrarTexto("Saldo", 15), 
                centrarTexto(String.valueOf(saldo), 40)));
        tabla.append("+-----------------+------------------------------------------+\n");

        tabla.append(String.format("| %s | %s |\n", 
                centrarTexto("ID", 15), 
                centrarTexto(ID, 40)));
        tabla.append("+-----------------+------------------------------------------+\n");

        tabla.append(String.format("| %s | %s |\n", 
                centrarTexto("Contraseña", 15), 
                centrarTexto(contraseña, 40)));
        tabla.append("+-----------------+------------------------------------------+\n");

        return tabla.toString();
    }

    public String mostrarSaldo() {
        StringBuilder tabla = new StringBuilder();
        tabla.append("+-----------------+------------------------------------------+\n");
        tabla.append(String.format("| %s | %s |\n", 
                centrarTexto("Saldo", 15), 
                centrarTexto(String.valueOf(saldo), 40)));
        tabla.append("+-----------------+------------------------------------------+\n");
        return tabla.toString();
    }


    //Mostrar solo sus datos personales
    public String datosPersonales(){
        return super.mostrarDatos();
    }
}