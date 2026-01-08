
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
    private Cajero miCajero;
    private final String MENSAJE="Escoga una opcion";
    private final String[] OPCIONES={"Terminar","Realizar Deposito","Realizar Retiro"};

    /**
     * Constructor for objects of class Controlador
     */
    public Controlador()
    {
        interfaz=new Interfaz("Cajero automatico","mouse.png");
        miCajero=new Cajero(interfaz);
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
                    miCajero.realizarDeposito();
                    break;
                case 2:
                    miCajero.realizarRetiro();
                    break;
            }
        }while (opcion>0);
    }
    
    public static void main(String[] parametros)
    {
        Controlador controlador;
        controlador=new Controlador();
        controlador.iniciar();
    }
}
