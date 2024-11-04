package PROYECTO_GRUPO_3.CLASES;
import java.util.Scanner;
public class SistemaDeReciclaje {
    // ATRIBUTOS
    private Usuario[] usuarios;
    private GestorDeUsuarios[] gestores;
    private Contenedores Contenedores_1;
    private Contenedores Contenedores_2;
    private Contenedores Contenedores_3;
    private Contenedores Contenedores_4;
    private Scanner entrada;

    // CONSTRUCTOR
    public SistemaDeReciclaje(){
        usuarios = new Usuario[0];
        gestores = new GestorDeUsuarios[0];
        EncargadoDeVaciado encargado1 = new EncargadoDeVaciado("Juan", "Vilca Lopez", 
                                                               "Santa Anita","Diurno");
        EncargadoDeVaciado encargado2 = new EncargadoDeVaciado("Andre", "Falcon Reyes", 
                                                               "Surco","Diurno");
        EncargadoDeVaciado encargado3 = new EncargadoDeVaciado("Manuel", "Tavara Suarez", 
                                                               "Miraflores","Diurno");
        EncargadoDeVaciado encargado4 = new EncargadoDeVaciado("Frank", "Gutierrez Huaman", 
                                                               "San Miguel","Diurno");
        Contenedores_1 = new Contenedores("Contenedor 1","Santa Anita",encargado1);
        Contenedores_2 = new Contenedores("Contenedor 2","Surco",encargado2);
        Contenedores_3 = new Contenedores("Contenedor 3","Miraflores",encargado3);
        Contenedores_4 = new Contenedores("Contenedor 4","San Miguel",encargado4);
        entrada = new Scanner(System.in);
    }

    // METODO PARA LEER UN USUARIO E INSTANCIARLO
    private Usuario leerUsuario(){
        int n;
        while(true){
            System.out.print("Ingrese su edad: ");
            n = entrada.nextInt();
            entrada.nextLine();
            if(n>=18){
                String a,b,c,x,y,z;
                System.out.print("Ingrese sus nombres: ");
                a = entrada.nextLine();
                System.out.print("Ingrese sus apellidos: ");
                b = entrada.nextLine();
                System.out.print("Ingrese su email: ");
                c = entrada.nextLine();
                System.out.print("Ingrese su distrito: ");
                x = entrada.nextLine();
                System.out.print("\nIngrese un ID: ");
                y = entrada.nextLine();
                System.out.print("Ingrese una contraseña: ");
                z = entrada.nextLine();
                Usuario nuevoUsuario = new Usuario(a,b,c,n,x,y,z);
                System.out.println("REGISTRO EXITOSO.");
                return nuevoUsuario;
            }
            else if(n>0&&n<18){
                System.out.println("EL REGISTRO ES SOLO PARA MAYORES DE EDAD.");
                break;
            }
            else if(n<=0){
                System.out.println("EDAD INEXISTENTE");
            }
        }
        return null;
    }

    // METODO PARA INCREMENTAR EN UNO EL TAMAÑO DEL ARRAY DE USUARIOS O GESTORES
    private void primeraRedimension(String a){
        if (a.equals("usuarios")){
            Usuario[] x=new Usuario[usuarios.length+1];
            for(int i=0;i<usuarios.length;i++){
                x[i]=usuarios[i];
            }
            usuarios=x;
        }
        else if(a.equals("gestores")){
            GestorDeUsuarios[] x=new GestorDeUsuarios[gestores.length+1];
            for(int i=0;i<gestores.length;i++){
                x[i]=gestores[i];
            }
            gestores=x;
        }
    }

    // METODO PARA DECREMENTAR EN UNO EL TAMAÑO DEL ARRAY DE USUARIOS O GESTORES
    public void segundaRedimension(String a){
        if (a.equals("usuarios")){
            Usuario[] x=new Usuario[usuarios.length-1];
            for(int i=0;i<usuarios.length-1;i++){
                x[i]=usuarios[i];
            }
            usuarios=x;
        }
        else if(a.equals("gestores")){
            GestorDeUsuarios[] x=new GestorDeUsuarios[gestores.length-1];
            for(int i=0;i<gestores.length-1;i++){
                x[i]=gestores[i];
            }
            gestores=x;
        }
    }

    // METODO PARA AGREGAR (REGISTRAR) UN USUARIO AL ARRAY DE USUARIOS
    public void registrarUsuario(){
        primeraRedimension("usuarios");
        Usuario x=leerUsuario();
        if (x != null) {
            usuarios[usuarios.length-1]=x;
        } 
        else {
            segundaRedimension("usuarios");
        }
    }

    // METODO PARA LEER UN GESTOR E INSTANCIARLO
    private GestorDeUsuarios leerGestor(){
        int n;
        while(true){
            System.out.print("Ingrese su edad: ");
            n = entrada.nextInt();
            entrada.nextLine();
            if(n>=18){
                String a,b,c,d="",x,y,z;
                int m;
                System.out.print("Ingrese sus nombres: ");
                a = entrada.nextLine();
                System.out.print("Ingrese sus apellidos: ");
                b = entrada.nextLine();
                System.out.print("Ingrese su email: ");
                c = entrada.nextLine();
                System.out.println("Elige el distrito al que quieres pertenecer: ");
                System.out.println(" 1. Santa Anita");
                System.out.println(" 2. Surco");
                System.out.println(" 3. Miraflores");
                System.out.println(" 4. San Miguel");
                do{
                    System.out.print("Ingrese una opción: ");
                    m = entrada.nextInt();
                    entrada.nextLine();
                }while(m>4||m<1);
                switch(m){
                    case 1: d = "Santa Anita"; break;
                    case 2: d = "Surco"; break;
                    case 3: d = "Miraflores"; break;
                    case 4: d = "San Miguel"; break;
                }
                System.out.print("Ingrese su telefono: ");
                x = entrada.nextLine();
                System.out.print("\nIngrese un ID: ");
                y = entrada.nextLine();
                System.out.print("Ingrese una contraseña: ");
                z = entrada.nextLine();
                GestorDeUsuarios nuevoGestor = new GestorDeUsuarios(a,b,c,n,d,y,z,x);
                System.out.println("REGISTRO EXITOSO.");
                return nuevoGestor;
            }
            else if(n>0&&n<18){
                System.out.println("EL REGISTRO ES SOLO PARA MAYORES DE EDAD.");
                break;
            }
            else if(n<=0){
                System.out.println("EDAD INEXISTENTE");
            }
        }
        return null;
    }

    // METODO PARA AGREGAR (REGISTRAR) UN GESTOR AL ARRAY DE GESTORES 
    public void registrarGestor(){
        primeraRedimension("gestores");
        GestorDeUsuarios x=leerGestor();
        if (x != null) {
            gestores[gestores.length-1]=x;
        } 
        else {
            segundaRedimension("gestores");
        }
    }

    // METODO PARA EL INICIO DE SESION DE UN USUARIO O UN GESTOR
    public boolean iniciar(String a, String b, String c){
        if(c.equals("usuarios")){
            for(int i=0;i<usuarios.length;i++){
                if(usuarios[i].getID().equals(a) && usuarios[i].getContraseña().equals(b)){
                    return true;
                }
            }
            return false;
        }
        else if(c.equals("gestores")){
            for(int i=0;i<gestores.length;i++){
                if(gestores[i].getID().equals(a) && gestores[i].getContraseña().equals(b)){
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    // METODO PARA IDENTIFICAR AL USUARIO QUE INICIO SESION
    private Usuario identificarUsuario(String a, String b){
        Usuario x = new Usuario();
        for(int i=0;i<usuarios.length;i++){
            if(usuarios[i].getID().equals(a) && usuarios[i].getContraseña().equals(b)){
                x = usuarios[i];
                break;
            }
        }
        return x;
    }

    // METODO PARA IDENTIFICAR AL GESTOR QUE INICIO SESION
    private GestorDeUsuarios identificarGestor(String a, String b){
        GestorDeUsuarios x = new GestorDeUsuarios();
        for(int i=0;i<gestores.length;i++){
            if(gestores[i].getID().equals(a) && gestores[i].getContraseña().equals(b)){
                x = gestores[i];
                break;
            }
        }
        return x;
    }

    // METODO PARA DAR EL MENSAJE DE BIENVENIDA A UN USUARIO O UN GESTOR
    public String bienvenida(String a, String b, String c){
        if(c.equals("usuarios")){
            Usuario x = identificarUsuario(a,b);
            return "BIENVENIDO SEÑOR "+primerApellido(x.getApellidos()).toUpperCase();
        }
        GestorDeUsuarios x = identificarGestor(a,b);
        return "BIENVENIDO SEÑOR "+primerApellido(x.getApellidos()).toUpperCase();
    }

    // METODO PARA OBTENER EL PRIMER APELLIDO
    private String primerApellido(String apellido){
        String b="";
        for(int i=0;i<apellido.length();i++){
            if(apellido.charAt(i)==' '){
                break;
            }
            else{
                b=b+apellido.charAt(i);
            }
        }
        return b;
    }

    // METODO PARA MOSTRAR LOS DATOS PERSONALES DEL USUARIO QUE INICIO SESION
    public String datosUsuario(String a, String b){
        Usuario x = identificarUsuario(a,b);
        return "\n"+x.datosPersonales();
    }

    // METODO PARA MOSTRAR LOS DATOS PERSONALES DEL GESTOR QUE INICIO SESION
    public String datosGestor(String a, String b){
        GestorDeUsuarios x = identificarGestor(a,b);
        return "\n"+x.datosDelGestor();
    }

    // METODO PARA MOSTRAR SALDO ACTUAL DEL USUARIO 
    public String mostrarSaldo(String a,String b){
        Usuario x = identificarUsuario(a,b);
        return x.mostrarSaldo();
    }

    // METODO PARA MOSTRAR SALARIO ACTUAL DEL GESTOR 
    public String mostrarSalario(String a,String b){
        GestorDeUsuarios x = identificarGestor(a,b);
        return x.mostrarSalario();
    }

    // METODO PARA BUSCAR SI UN USUARIO FUE ATENDIDO POR UN GESTOR
    public void buscarUsuario(String a,String b){
        GestorDeUsuarios x = identificarGestor(a,b);
        x.buscarUsuario();
    }

    // METODO PARA AGREGAR PRODUCTOS A LOS CONTENEDORES
    public void agregar_1(String a,String b){
        int opc;
        Usuario x = identificarUsuario(a,b);
        do{
            System.out.println("\nCONTENEDORES DISPONIBLES (DISTRITOS):");
            System.out.println(" 1. Santa Anita");
            System.out.println(" 2. Surco");
            System.out.println(" 3. Miraflores");
            System.out.println(" 4. San Miguel");
            System.out.println(" 5. Salir");
            System.out.print(" Ingrese una opción: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1: agregado(x,Contenedores_1,"Santa Anita"); break;
                case 2: agregado(x,Contenedores_2,"Surco"); break;
                case 3: agregado(x,Contenedores_3,"Miraflores"); break;
                case 4: agregado(x,Contenedores_4,"San Miguel"); break;
                case 5: System.out.println("Saliendo..."); break;
                default: System.out.println("Opcion no valida.");
            }
        }while(opc!=5);  
    }

    // METODO PARA UTILIZAR EL MOSTRADO DE GESTORES Y VER SI HAY O NO GESTORES EN EL DISTRITO
    public void agregado(Usuario x,Contenedores y,String z){
        int opc;
        gestorDistrito(z);
        if(posicionesGestorDistrito(z).length==0){
            System.out.println(" No hay gestores en este distrito, una disculpa.");
        }
        else{
            System.out.print(" Ingrese una opción: ");
            opc = entrada.nextInt();
            agregar_2(y,x,opc);
        }
    }

    // METODO PARA MOSTRAR TODOS LOS GESTORES DISPONIBLES EN UN DISTRITO
    public void gestorDistrito(String a){
        int n=0;
        System.out.println("\n GESTORES DISPONIBLES:");
        for(int i=0;i<gestores.length;i++){
            if(gestores[i].getDistrito().equals(a)){
                System.out.println(" " + (n+1) + ". " + gestores[i].getApellidos().toUpperCase() 
                + " " + gestores[i].getNombres().toUpperCase());
                n++;
            }
        }
    }

    // METODO PARA IDENTIFICAR LA POSICION DE LOS GESTORES DISPONIBLES EN CADA DISTRITO EN EL ARRAY
    public int[] posicionesGestorDistrito(String a){
        int n=0;
        int[] x = new int[0];
        for(int i=0;i<gestores.length;i++){
            if(gestores[i].getDistrito().equals(a)){
                int[] y = new int[x.length+1];
                for(int j=0;j<x.length;i++){
                    y[j]=x[j];
                }
                x=y;
                x[n] = i;
                n++;
            }
        }
        return x;
    }

    // METODO PARA DETERMINAR EL TAMAÑO ACTUAL DEL ARRAY DE USUARIOS O DE GESTORES
    public int tamaño(String a){
        if(a.equals("usuarios")){
            return usuarios.length;
        }
        else if(a.equals("gestores")){
            return gestores.length;
        }
        return 0;
    }

    // METODO PARA FACILITAR EL AGREGADO DE PRODUCTOS RECICLABLES A CADA UNO DE LOS CONTENEDORES
    public void agregar_2(Contenedores y, Usuario x, int a){ 
        int opc,n,p =posicionesGestorDistrito(y.getUbicacion())[a-1];
        Producto_Reciclable z;
        do{
            System.out.println("\n ELEGIR PRODUCTOS RECICLABLES:");
            System.out.println(" 1. Envases de vidrios");
            System.out.println(" 2. Envases de plasticos");
            System.out.println(" 3. Envases de latas");
            System.out.println(" 4. Salir");
            System.out.print(" Ingrese una opción: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1: System.out.print(" Ingrese la cantidad: ");
                        n = entrada.nextInt();
                        z = new EnvaseDeVidrio(n);
                        y.agregarProducto(0,z);
                        x.setSaldo(x.getSaldo()+z.calcularValor());
                        System.out.println(" Productos reciclables agregados."); 
                        break;
                case 2: System.out.print(" Ingrese la cantidad: ");
                        n = entrada.nextInt();
                        z = new EnvaseDePlastico(n);
                        y.agregarProducto(1, z);
                        x.setSaldo(x.getSaldo()+z.calcularValor());
                        System.out.println(" Productos reciclables agregados."); 
                        break;
                case 3: System.out.print(" Ingrese la cantidad: ");
                        n = entrada.nextInt();
                        z = new EnvaseDeLata(n);
                        y.agregarProducto(2, z);
                        x.setSaldo(x.getSaldo()+z.calcularValor());
                        System.out.println(" Productos reciclables agregados."); 
                        break;
                case 4: System.out.println("Saliendo..."); 
                        System.out.println("Los datos del gestor que le atendió"+ 
                                           "son los siguientes: ");
                        System.out.println(gestores[p].datosDelGestor());
                        gestores[p].agregarUsuarioAtendido(x);
                        gestores[p].setSalario(gestores[p].getSalario()+20);
                        break;
                default: System.out.println("Opcion no valida.");
            }
        }while(opc!=4);
    }

    // METODO PARA MOSTRAR EL ESTADO DE LOS CONTENEDORES
    public void estadoContenedores(){
        int opc;
        do{
            System.out.println("\nCONTENEDORES DISPONIBLES (DISTRITOS):");
            System.out.println(" 1. Santa Anita");
            System.out.println(" 2. Surco");
            System.out.println(" 3. Miraflores");
            System.out.println(" 4. San Miguel");
            System.out.println(" 5. Salir");
            System.out.print(" Ingrese una opción: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1: Contenedores_1.mostrarContenedores(); break;
                case 2: Contenedores_2.mostrarContenedores(); break;
                case 3: Contenedores_3.mostrarContenedores(); break;
                case 4: Contenedores_4.mostrarContenedores(); break;
                case 5: System.out.println("Saliendo..."); break;
                default: System.out.println("Opcion no valida.");
            }
        }while(opc!=5);  
    }
    
    // METODO PARA ACTUALIZAR DATOS PERSONALES DEL USUARIO
    public void actualizar_1(String p,String q){
        int opc,n;
        String a,b,c,x;
        Usuario Usuario = identificarUsuario(p,q);
        do{
            System.out.println("\n Posibles datos a actualizar:");
            System.out.println(" 1. Nombres");
            System.out.println(" 2. Apellidos");
            System.out.println(" 3. Edad");
            System.out.println(" 4. Email");
            System.out.println(" 5. Distrito");
            System.out.println(" 6. Salir");
            System.out.print(" Elija una opción: ");
            opc = entrada.nextInt();
            entrada.nextLine();
            switch(opc){
                case 1: System.out.print(" Ingrese el/los nuevo(s) nombre(s): ");
                        a = entrada.nextLine(); Usuario.setNombres(a);
                        System.out.println(" Nombre(s) actualizados."); break;
                case 2: System.out.print(" Ingrese los nuevos apellidos: ");
                        b = entrada.nextLine(); Usuario.setApellidos(b);
                        System.out.println(" Apellidos actualizados."); break;
                case 3: System.out.print(" Ingrese su edad actual: ");
                        n = entrada.nextInt(); Usuario.setEdad(n);
                        System.out.println(" Edad actualizada."); break;
                case 4: System.out.print(" Ingrese el nuevo email: ");
                        c = entrada.nextLine(); Usuario.setEmail(c);
                        System.out.println(" Email actualizado."); break;
                case 5: System.out.print(" Ingrese el nuevo distrito: ");
                        x = entrada.nextLine(); Usuario.setDistrito(x);
                        System.out.println(" Distrito actualizado."); break;
                case 6: System.out.println("Saliendo de la actualización de datos..."); break;
                default: System.out.println("Opción no valida.");
            }
        }while(opc!=6);
    }

    // METODO PARA ACTUALIZAR EL ID O CONTRASEÑA DEL USUARIO
    public void actualizar_2(String p,String q){
        int opc;
        String a,b;
        Usuario Usuario = identificarUsuario(p,q);
        System.out.println(" 1. Actualizar ID");
        System.out.println(" 2. Actualizar contraseña");
        System.out.print(" Elija una opción: ");
        opc = entrada.nextInt();
        entrada.nextLine();
        switch(opc){
            case 1: System.out.print(" Ingrese el nuevo ID: ");
                    a = entrada.nextLine(); Usuario.setID(a);
                    System.out.println(" ID actualizado.\nRegresando al inicio..."); break;
            case 2: System.out.print(" Ingrese la nueva contraseña: ");
                    b = entrada.nextLine(); Usuario.setContraseña(b);
                    System.out.println(" Contraseña actualizada.\nRegresando al inicio..."); break;
            default: System.out.println("Opción no valida.");
        }
    }

    // METODO PARA ELIMINAR LA CUENTA DEL USUARIO
    public void eliminar(String a,String b){
        String p;
        do{
            System.out.print("¿Estas seguro que quieres eliminar tu cuenta permanentemente?"+ 
                            "(SI o NO): ");
            p = entrada.next(); p.toUpperCase();
            if(p.equals("SI")){
                int x=0;
                for(int i=0;i<usuarios.length;i++){
                    if(usuarios[i].getID().equals(a) && usuarios[i].getContraseña().equals(b)){
                        x = i; break;
                    }
                }
                for (int i = x; i < usuarios.length - 1; i++) {
                    usuarios[i] = usuarios[i + 1];
                }
                segundaRedimension("usuarios");
                System.out.println("Eliminación exitosa.\nRegresando al inicio...");
            }
            else if(p.equals("NO")){
                System.out.println("No se procedió con la eliminación.\nRegresando al inicio...");
            }
            else{
                System.out.println("Opcion no valida, ingrese nuevamente.");
            }
        }while(!p.equals("SI") && !p.equals("NO"));    
    }
}