package PROYECTO_GRUPO_3.PRUEBAS;
import PROYECTO_GRUPO_3.CLASES.Contenedores;
import PROYECTO_GRUPO_3.CLASES.EncargadoDeVaciado;
import PROYECTO_GRUPO_3.CLASES.EnvaseDeLata;
import PROYECTO_GRUPO_3.CLASES.EnvaseDePlastico;
import PROYECTO_GRUPO_3.CLASES.EnvaseDeVidrio;
import PROYECTO_GRUPO_3.CLASES.Producto_Reciclable;

public class PruebaContenedores {
    public static void main(String[] args){
        // INSTANCIANDOS DOS OBJETOS ENCARGADOS DE VACIADO
        EncargadoDeVaciado encargado1 = new EncargadoDeVaciado("Juan Manuel", "Villegas Lopez", "Diurno");
        EncargadoDeVaciado encargado2 = new EncargadoDeVaciado("Andre Israel", "Soto Fernandez ", "Diurno");

        // INSTANCIANDO DOS OBJETOS DE LA CLASE CONTENEDORES
        Contenedores contenedores_1 = new Contenedores("1", "Santa Anita",encargado1);
        Contenedores contenedores_2 = new Contenedores("2", "Surco",encargado2);

        // INSTANCIANDO SEIS OBJETOS DE LA CLASE PRODUCTO
        Producto_Reciclable Producto_1 = new EnvaseDeLata(20);
        Producto_Reciclable Producto_2 = new EnvaseDeVidrio(30);
        Producto_Reciclable Producto_3 = new EnvaseDePlastico(15);
        Producto_Reciclable Producto_4 = new EnvaseDePlastico(20);
        Producto_Reciclable Producto_5 = new EnvaseDeLata(45);
        Producto_Reciclable Producto_6 = new EnvaseDePlastico(35);

        // UTILIZANDO EL METODO AGREGAR PRODUCTO DE LA CLASE CONTENEDORES
        // PARA INGRESAR LOS PRODUCTOS A CADA UNO DE LOS CONTENEDORES QUE LO CONFORMAN
        // YA SEA PARA EMBASES DE VIDRIO, PLASTICO O LATA
        contenedores_1.agregarProducto(2,Producto_1);
        contenedores_1.agregarProducto(0,Producto_2);
        contenedores_1.agregarProducto(1,Producto_3);
        contenedores_2.agregarProducto(1,Producto_4);
        contenedores_2.agregarProducto(2,Producto_5);
        contenedores_2.agregarProducto(1,Producto_6);

        // MOSTRANDO AMBOS CONTENEDORES CREADOS
        contenedores_1.mostrarContenedores();
        System.out.println();
        contenedores_2.mostrarContenedores();
    }
}
