
/**
 * Write a description of class Nodo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nodo
{
    // instance variables - replace the example below with your own
    private Palabra palabra;
    private Nodo siguiente;

    /**
     * Constructor for objects of class Nodo
     */
    public Nodo(Palabra laPalabra)
    {
        palabra=laPalabra;
        siguiente=null;
    }
    
    public Palabra getPalabra()
    {
        return palabra ;
    }
    
    public void setElemento(Palabra unaPalabra)
    {
        palabra=unaPalabra;
    }
    
    public Nodo getSiguiente()
    {
        return siguiente;
    }
    
    public void setSiguiente(Nodo unSiguiente)
    {
        siguiente=unSiguiente;
    }
    
    public String toString()
    {
        String stringFinal=palabra.toString();
        
        return stringFinal;
    }
}
