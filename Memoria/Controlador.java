
/**
 * Write a description of class Controlador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controlador
{
    // instance variables - replace the example below with your own
    private Tablero tablero;
    private Arbitro arbitro;

    /**
     * Constructor for objects of class Controlador
     */
    public Controlador()
    {
        // initialise instance variables
        tablero=new Tablero();
        arbitro=new Arbitro(tablero);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void iniciar()
    {
        arbitro.jugar();
        
    }
    
    public static void main(String[] paramteros){
        Controlador controlador;
        controlador=new Controlador();
        controlador.iniciar();
    }
}
