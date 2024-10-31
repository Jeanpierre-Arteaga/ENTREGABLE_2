package PROYECTO_GRUPO_3.PRUEBAS;
import PROYECTO_GRUPO_3.CLASES.EnvaseDeLata;
import PROYECTO_GRUPO_3.CLASES.EnvaseDePlastico;
import PROYECTO_GRUPO_3.CLASES.EnvaseDeVidrio;
import PROYECTO_GRUPO_3.CLASES.Producto_Reciclable;

public class PruebaProducto {
    public static void main(String[] args) {
        // INSTANCIANDO TRES OBJETOS DE LA CLASE PRODUCTO RECICLABLE
        Producto_Reciclable Producto_1 = new EnvaseDeLata(20);
        Producto_Reciclable Producto_2 = new EnvaseDeVidrio(30);
        Producto_Reciclable Producto_3 = new EnvaseDePlastico(15);

        // MOSTRANDO LOS PRODUCTOS RECICLABLES CREADOS
        Producto_1.mostrarProducto();
        System.out.println();
        Producto_2.mostrarProducto();
        System.out.println();
        Producto_3.mostrarProducto();
    }
}