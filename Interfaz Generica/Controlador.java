
/**
 * Write a description of class Controlador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controlador
{
    // instance variables - replace the example below with your own
    private final String TITULO="Interfaz generica";
    private final String IMAGEN=" ";
    private final String elMensaje="Marque la opcion que desea";
    private final String[] OPCIONES={"Terminar", "Mostrar hola", "Solicitar un digito", "Mostar adios"};
    private Interfaz interfaz;
    private Experto experto1;

    /**
     * Constructor for objects of class Controlador
     */
    public Controlador()
    {
        // initialise instance variables
        interfaz=new Interfaz(TITULO,IMAGEN);
        experto1=new Experto(interfaz);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void iniciar()
    {
        int opcion;
        do{
            opcion=interfaz.pedirOpcion(OPCIONES,elMensaje);
            
            switch(opcion){
                case 1:
                    experto1.ejecutarUno();
                    break;
                case 2:
                    experto1.ejecutarDos();
                    break;
                case 3:
                    experto1.ejecutarTres();
                    break;
            }
        }while (opcion>0);
    }
    
    public static void main(String[] argumentos)
    {
        Controlador miControlador;
        miControlador=new Controlador();
        miControlador.iniciar();
    }
}
