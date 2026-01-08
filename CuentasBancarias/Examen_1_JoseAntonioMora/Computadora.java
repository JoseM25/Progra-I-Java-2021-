import java.util.Random;
//Jose Antonio Mora M C15114
/**
 * Write a description of class Computadora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Computadora
{
    // instance variables - replace the example below with your own
    private Random generador;
    private int ancho;
    private int posicionComputadora;
    /**
     * Constructor for objects of class Computadora
     */
    public Computadora()
    {
        // initialise instance variables
        generador=new Random();
        
        ancho=generador.nextInt(2)+1;
        posicionComputadora=0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getAncho()
    {
        // put your code here
        return ancho;
    }
    
    public int getPosicion()
    {
        return posicionComputadora;
    }
    
    public void setPosicion(int posicionUsuario)
    {
        posicionComputadora=posicionUsuario;
    }
}
