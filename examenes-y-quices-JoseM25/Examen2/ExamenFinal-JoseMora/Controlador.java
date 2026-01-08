/**
 *
 *
 * @Jose Antonio Mora
 * @C15114
 */
public class Controlador{
    private final String TITULO_VENTANAS = " ";
    private final String NOMBRE_ARCHIVO_IMAGEN = " ";
    private final String MENSAJE = "Escoja una opción";
    private final String[] OPCIONES = {"Salir", "Verificar vacia", "Agregar final","Buscar","Imprimir","Valor Maquinas"}; 
    private Interfaz interfaz;
    private Lista lista;
    public Controlador(){
        interfaz= new Interfaz("Bienvenido", "Maquina.PNG");
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
                    int val=interfaz.pedirNumero("Digite el valor");
                    String id=interfaz.pedirHilera("Digite el identificador");
                    Maquina unaMaquina=new Maquina(val,id);  
                    lista.agregarFinal(unaMaquina);
                    break;

                case 6:
                    String iden=interfaz.pedirHilera("Digite el identificador que desea buscar");
                    String maquina=lista.buscarMaquina(iden);
                    interfaz.decirMensaje(maquina);
                    break;
    
                case 7:
                    String imprimir=lista.toString();
                    interfaz.decirMensaje(imprimir);
                    break;
                
                case 8:
                    int valorMaquinas=lista.costosRecursivos();
                    //String valor=valorMaquinas.toString();
                    //interfaz.decirMensaje(valor);
            }
        }while(opcion > 0);
    }

    public static void main(String[] parametros){
        Controlador controlador;
        controlador = new Controlador();
        controlador.iniciar();
    }

}

