
/**
 * Write a description of class Controlador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controlador
{
    // instance variables - replace the example below with your own
    private Interfaz interfaz;
    private final String MENSAJE="Escoga una opcion";
    private final String[] OPCIONES={"Terminar","Jugar","Ver Creditos"};
    private Arbitro arbitro1;

    /**
     * Constructor for objects of class Controlador
     */
    public Controlador()
    {
        // initialise instance variables
        interfaz=new Interfaz("Adivinador","");
        arbitro1=new Arbitro(interfaz);
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
            opcion=interfaz.pedirOpcion(OPCIONES,MENSAJE);
            switch(opcion){
                case 1:
                    arbitro1.iniciarJuego();
                    break;
                case 2:
                    arbitro1.mostrarCreditos();
            }
        }while(opcion>0);
    }
    
    public static void main(String[] parametros)
    {
        Controlador controlador;
        controlador=new Controlador();
        controlador.iniciar();
    }
}
