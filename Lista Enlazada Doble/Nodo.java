
/**
 * Write a description of class Nodo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nodo
{
    // instance variables - replace the example below with your own
    private Elemento elemento;
    private Nodo siguiente;
    private Nodo anterior;

    /**
     * Constructor for objects of class Nodo
     */
    public Nodo(Elemento elElementoRecibido)
    {
        elemento=elElementoRecibido;
        siguiente=null;
        anterior=null;
    }
    
    public Elemento getElemento()
    {
        return elemento;
    }
    
    public void setElemento(Elemento unElemento)
    {
        elemento=unElemento;
    }
    
    public Nodo getSiguiente()
    {
        return siguiente;
    }
    
    public void setSiguiente(Nodo unSiguiente)
    {
        siguiente=unSiguiente;
    }
    
    public Nodo getAnterior()
    {
        return anterior;
    }
    
    public void setAnterior(Nodo unAnterior)
    {
        anterior=unAnterior;
    }
    
    public String toString()
    {
        String stringFinal=elemento.toString();
        
        return stringFinal;
    }
}
