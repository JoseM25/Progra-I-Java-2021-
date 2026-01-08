
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
    private Arbol izquierdo;
    private Arbol derecho;
    /**
     * Constructor for objects of class Nodo
     */
    public Nodo(Elemento elElementoRecibido)
    {
        elemento=elElementoRecibido;
        izquierdo=new Arbol();
        derecho=new Arbol();
    }
    
    public Elemento getElemento()
    {
        return elemento;
    }
    
    public void setElemento(Elemento unElemento)
    {
        elemento=unElemento;
    }
    
    public Arbol getIzquierdo()
    {
        return izquierdo;
    }
    
    public void setIzquierdo(Arbol unArbolIz)
    {
        izquierdo=unArbolIz;
    }
    
      public Arbol getDerecho()
    {
        return derecho;
    }
    
    public void setDerecho(Arbol unArbolDe)
    {
        derecho=unArbolDe;
    }
    

    public String toString()
    {
        String stringFinal=elemento.toString();
        
        return stringFinal;
    }
}
