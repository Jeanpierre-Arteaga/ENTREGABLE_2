package PROYECTO_GRUPO_3.CLASES;

public class Persona {
    // ATRIBUTOS
    protected String nombres;
    protected String apellidos;
    protected String email;
    protected int edad;
    protected String distrito;

    // CONSTRUCTORES
    public Persona() {
    }

    public Persona(String nombres, String apellidos, String email, int edad, String distrito) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.edad = edad;
        this.distrito = distrito;
    }

    public Persona(String nombres, String apellidos){
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    // MÉTODOS SETTERS Y GETTERS
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    public String getDistrito() {
        return distrito;
    }

    // MÉTODO PARA CENTRAR TEXTO
    protected String centrarTexto(String texto, int ancho) {
        if (texto.length() >= ancho) {
            return texto.substring(0, ancho);
        }
        int espaciosTotal = ancho - texto.length();
        int izquierda = espaciosTotal / 2;
        int derecha = espaciosTotal - izquierda;
        return " ".repeat(izquierda) + texto + " ".repeat(derecha);
    }

    // MÉTODO PARA MOSTRAR DATOS EN FORMATO DE TABLA
    public String mostrarDatos() {
        StringBuilder tabla = new StringBuilder();

        tabla.append("+-----------------+------------------------------------------+\n");
        tabla.append("|     Dato        |               Información                |\n");
        tabla.append("+-----------------+------------------------------------------+\n");

        tabla.append(String.format("| %s | %s |\n", 
                centrarTexto("Apellidos", 15), 
                centrarTexto(apellidos, 40)));
        tabla.append("+-----------------+------------------------------------------+\n");

        tabla.append(String.format("| %s | %s |\n", 
                centrarTexto("Nombres", 15), 
                centrarTexto(nombres, 40)));
        tabla.append("+-----------------+------------------------------------------+\n");

        tabla.append(String.format("| %s | %s |\n", 
                centrarTexto("Edad", 15), 
                centrarTexto(String.valueOf(edad), 40)));
        tabla.append("+-----------------+------------------------------------------+\n");

        tabla.append(String.format("| %s | %s |\n", 
                centrarTexto("Email", 15), 
                centrarTexto(email, 40)));
        tabla.append("+-----------------+------------------------------------------+\n");

        tabla.append(String.format("| %s | %s |\n", 
                centrarTexto("Distrito", 15), 
                centrarTexto(distrito, 40)));
        tabla.append("+-----------------+------------------------------------------+\n");

        return tabla.toString();
    }
}