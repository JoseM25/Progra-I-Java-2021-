import java.util.ArrayList;

/**
 *
 *
 * @Jose Antonio Mora
 * @C15114
 */
public class Nodo
{
    // instance variables - replace the example below with your own
    private Maquina maquina;
    private ArrayList<Nodo> siguientes=new ArrayList<Nodo>();

    /**
     * Constructor for objects of class Nodo
     */
    public Nodo(Maquina laMaquinaRecibida)
    {
        maquina=laMaquinaRecibida;
    }
    
    public Maquina getMaquina()
    {
        return maquina;
    }
    
    public void setMaquina(Maquina unaMaquina)
    {
        maquina=unaMaquina;
    }
    
    public ArrayList<Nodo> getSiguiente()
    {
        return siguientes;
    }
    
    public void setSiguiente(Nodo unSiguiente)
    {
        siguientes.add(unSiguiente);
    }
    
    public String toString()
    {
        String stringFinal=maquina.toString();
        
        return stringFinal;
    }
}
