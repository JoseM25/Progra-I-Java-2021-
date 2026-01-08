
/**
 * Write a description of class Experto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Experto
{
    // instance variables - replace the example below with your own
    private Interfaz interfaz;

    /**
     * Constructor for objects of class Experto
     */
    public Experto(Interfaz miInterfaz)
    {
        // initialise instance variables
        interfaz=miInterfaz;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void ejecutarUno()
    {
        // put your code here
        interfaz.decirMensaje("hola");
    }
    
    public void ejecutarDos(){
        interfaz.pedirHilera("digite lo que quiera");
    }
    
    public void ejecutarTres(){
        
    }
}
