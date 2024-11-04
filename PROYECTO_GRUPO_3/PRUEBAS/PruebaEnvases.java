package PROYECTO_GRUPO_3.PRUEBAS;
import PROYECTO_GRUPO_3.CLASES.EnvaseDeLata;
import PROYECTO_GRUPO_3.CLASES.EnvaseDePlastico;
import PROYECTO_GRUPO_3.CLASES.EnvaseDeVidrio;

public class PruebaEnvases {
    public static void main(String[] args) {
        // INSTANCIANDO TRES OBJETOS DE LOS TRES TIPOS (CLASES) DE ENVASES
        EnvaseDeLata Envase_1 = new EnvaseDeLata(20);
        EnvaseDeVidrio Envase_2 = new EnvaseDeVidrio(30);
        EnvaseDePlastico Envase_3 = new EnvaseDePlastico(15);

        // MOSTRANDO LOS PRODUCTOS RECICLABLES CREADOS
        Envase_1.mostrarProducto();
        System.out.println();
        Envase_2.mostrarProducto();
        System.out.println();
        Envase_3.mostrarProducto();
    }
}