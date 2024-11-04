package PROYECTO_GRUPO_3.PRUEBAS;
import PROYECTO_GRUPO_3.CLASES.ContenedorDePlastico;
import PROYECTO_GRUPO_3.CLASES.ContenedorDeVidrio;
import PROYECTO_GRUPO_3.CLASES.ContenedorDeLata;
import PROYECTO_GRUPO_3.CLASES.EnvaseDeVidrio;
import PROYECTO_GRUPO_3.CLASES.EnvaseDePlastico;
import PROYECTO_GRUPO_3.CLASES.EnvaseDeLata;

public class PruebaContenedor {
    public static void main(String[] args) {
        // INSTANCIANDO UN OBJETO DE CADA UNA DE LAS CLASES DE CONTENEDORES
        ContenedorDeVidrio contenedor_1 = new ContenedorDeVidrio(100);
        ContenedorDePlastico contenedor_2 = new ContenedorDePlastico(120);
        ContenedorDeLata contenedor_3 = new ContenedorDeLata(150);

        // INSTANCIANDO DOS OBJETOS DE LA CLASE ENVASE DE VIDRIO
        EnvaseDeVidrio Envase_1 = new EnvaseDeVidrio(60);
        EnvaseDeVidrio Envase_2 = new EnvaseDeVidrio(30);

        // INSTANCIANDO DOS OBJETOS DE LA CLASE ENVASE DE PLASTICO
        EnvaseDePlastico Envase_3 = new EnvaseDePlastico(45);
        EnvaseDePlastico Envase_4 = new EnvaseDePlastico(58);

        // INSTANCIANDO DOS OBJETOS DE LA CLASE ENVASE DE LATA
        EnvaseDeLata Envase_5 = new EnvaseDeLata(100);
        EnvaseDeLata Envase_6 = new EnvaseDeLata(25);

        // UTILIZANDO EL METODO AGREGAR DE LA CLASE CONTENEDOR
        // PARA AGREGAR CADA UNO DE LOS ENVASES EN SU CONTENEDOR CORRESPONDIENTE
        contenedor_1.agregar(Envase_1);
        contenedor_1.agregar(Envase_2);
        contenedor_2.agregar(Envase_3);
        contenedor_2.agregar(Envase_4);
        contenedor_3.agregar(Envase_5);
        contenedor_3.agregar(Envase_6);

        // MOSTRANDO LOS CONTENEDORES CON LOS ENVASES INGRESADOS
        contenedor_1.mostrarContenedor();
        contenedor_2.mostrarContenedor();
        contenedor_3.mostrarContenedor();
    }
}