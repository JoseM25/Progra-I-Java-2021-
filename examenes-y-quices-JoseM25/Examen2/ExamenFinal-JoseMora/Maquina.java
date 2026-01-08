
/**
 *
 *
 * @Jose Antonio Mora
 * @C15114
 */
public class Maquina
{
    // instance variables - replace the example below with your own
    private String identificador;
    private int valor;

    /**
     * Constructor for objects of class Elemento
     */
    public Maquina(int valorRecibido,String identificadorRecibido)
    {
        // initialise instance variables
        identificador=identificadorRecibido;
        valor=valorRecibido;
    }
    
    public String getIdentificador()
    {
        return identificador;
    }
    
    public void setIdentificador(String unIdentificador)
    {
        identificador=unIdentificador;
    }
    
    public int getValor()
    {
        return valor;
    }
    
    public void setValor(int unValor)
    {
        valor=unValor;
    }
    
    public String toString()
    {
        String valorString=Integer.toString(valor);
        String stringFinal="El identificador corresponde a: "+identificador+" y su valor corresponde a : "+valor;
        return stringFinal;
    }
}
