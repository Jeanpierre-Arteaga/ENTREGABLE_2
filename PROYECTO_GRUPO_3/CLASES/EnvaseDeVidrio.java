package PROYECTO_GRUPO_3.CLASES;

public class EnvaseDeVidrio extends Producto_Reciclable {
    public EnvaseDeVidrio(int cantidad) {
        super("envase de vidrio", cantidad);
    }

    public double establecerValor(String tipo) {
        return 0.30;
    }
}