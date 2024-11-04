package PROYECTO_GRUPO_3.PRUEBAS;

import PROYECTO_GRUPO_3.CLASES.GestorDeUsuarios;

public class PruebaGestor {
    public static void main(String[] args) {
        // INSTANCIANDO TRES OBJETOS DE LA CLASE GESTOR
        GestorDeUsuarios Gestor_1 = new GestorDeUsuarios("Julio Daniel", "Chavez Huamani", 
        "daniel2020@gmail.com", 30, "Miraflores", "daniel30", "julio_2020","987654321");
        GestorDeUsuarios Gestor_2 = new GestorDeUsuarios("Luis Geronimo", "Aceituno Huaman", 
        "luisG2003@gmail.com", 45, "Surco", "luiAceituno", "gero_2003","956487213");
        GestorDeUsuarios Gestor_3 = new GestorDeUsuarios("Manuel Pierce", "Ocana Suarez", 
        "manuel2012@gmail.com", 22, "San Miguel", "manu22", "ocanasP","945872136");

        // MOSTRANDO LOS TRES GESTORES CREADOS
        System.out.println(Gestor_1.datosDelGestor());
        System.out.println();
        System.out.println(Gestor_2.datosDelGestor());
        System.out.println();
        System.out.println(Gestor_3.datosDelGestor());
    }
}