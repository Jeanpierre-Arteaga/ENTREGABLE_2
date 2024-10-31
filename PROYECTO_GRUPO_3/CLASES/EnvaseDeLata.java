package PROYECTO_GRUPO_3.CLASES;

public class EnvaseDeLata extends Producto_Reciclable {
    public EnvaseDeLata(int cantidad) {
        super("envase de lata", cantidad);
    }

    public double establecerValor(String tipo) {
        return 0.10;
    }
}
