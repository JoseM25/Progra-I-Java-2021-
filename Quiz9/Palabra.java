
/**
 * Write a description of class Elemento here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palabra
{
    // instance variables - replace the example below with your own
    private String palabra;
    private String definicion;
    

    /**
     * Constructor for objects of class Elemento
     */
    public Palabra(String definicionRecibida,String palabraRecibida)
    {
        // initialise instance variables
        palabra=palabraRecibida;
        definicion=definicionRecibida;
    }
    
    public String getPalabra()
    {
        return palabra;
    }
    
    public void setPalabra(String unaPalabra)
    {
        palabra=unaPalabra;
    }

    public String toString()
    {
        String stringFinal="El identificador corresponde a: "+palabra;
        return stringFinal;
    }
}
