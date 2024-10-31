package PROYECTO_GRUPO_3.CLASES;

public class EnvaseDePlastico extends Producto_Reciclable {
    public EnvaseDePlastico(int cantidad) {
        super("envase de plastico", cantidad);
    }

    public double establecerValor(String tipo) {
        return 0.20;
    }
}