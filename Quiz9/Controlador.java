
public class Controlador{
    private final String TITULO_VENTANAS = " ";
    private final String NOMBRE_ARCHIVO_IMAGEN = " ";
    private final String MENSAJE = "Escoja una opción";
    private final String[] OPCIONES = {"Salir", "Verificar vacia", "Agregar final", "Contar", "Eliminar","Buscar","Imprimir"}; 
    private Interfaz interfaz;
    private Lista lista;
    private Lector lector;
    public Controlador(){
        interfaz= new Interfaz("Bienvenido", "Lista.JPG");
        lista=new Lista();
    }

    public void iniciar()
    {
        int opcion;
        do {
            opcion = interfaz.pedirOpcion(OPCIONES, MENSAJE);
            switch (opcion) {

                case 1: 
                    boolean verdad=lista.estarVacia();
                    String vacia=Boolean.toString(verdad);
                    interfaz.decirMensaje(vacia);
                    break;

                case 2: 
                    String palabra=lector.leerFrases();
                    String def=lector.leerFrases();
                    Palabra unaPalabra=new Palabra(def,palabra);  
                    lista.agregarFinal(unaPalabra);
                    break;

                case 3:
                    int contador=lista.contar();
                    String contadorString=Integer.toString(contador);
                    interfaz.decirMensaje(contadorString);
                    break;

                case 4:
                    String identif=interfaz.pedirHilera("Digite el identificador");
                    boolean confirmador=lista.eliminar(identif);
                    String eliminar=Boolean.toString(confirmador);
                    interfaz.decirMensaje(eliminar);
                    break;

                // case 5:
                    // String pal=interfaz.pedirHilera("Digite la palabra que desea buscar");
                    // Palabra palabra=lista.buscarPalabra(palabra);
                    // if(palabra.getPalabra().equals("cero") && palabra.getDefinicion().equals("cero")){
                        // interfaz.decirMensaje("El elemento no esta en la lista");
                    // }else{
                        // String buscar=palabra.toString();
                        // interfaz.decirMensaje(buscar);
                    // }
                    // break;

                case 6:
                    String imprimir=lista.toString();
                    interfaz.decirMensaje(imprimir);
                    break;
            }
        }while(opcion > 0);
    }

    public static void main(String[] parametros){
        Controlador controlador;
        controlador = new Controlador();
        controlador.iniciar();
    }

}

