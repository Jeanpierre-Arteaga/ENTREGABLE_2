package PROYECTO_GRUPO_3.CLASES;

public class EnvaseDeLata extends Producto_Reciclable {
    // CONSTRUCTOR
    public EnvaseDeLata(int cantidad) {
        // DEFINIMOS EL TIPO DE ENVASE
        super("envase de lata", cantidad);
    }

    // METODO PARA ESTABLECER EL VALOR DE UN ENVASE DE ESTE TIPO
    public double establecerValor() {
        return 0.10;
    }

    // METODO PARA CALCULAR EL VALOR TOTAL POR TODAS LAS CANTIDADES
    public double calcularValor(){
        return establecerValor()*getCantidad();
    }
}