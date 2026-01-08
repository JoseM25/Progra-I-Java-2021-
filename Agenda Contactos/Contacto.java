
/**
 * Write a description of class Contacto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Contacto
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String numeroTelefono;
    private Interfaz interfaz;

    /**
     * Constructor for objects of class Contacto
     */
    public Contacto()
    {
        // initialise instance variables
        nombre=interfaz.showInputDialog(null,"Digite el nombre");
        numeroTelefono=interfaz.showInputDialog(null,"Digite el numero de telefono");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getNombre()
    {
        return nombre; 
    }
    
    public String getTelefono()
    {
        return numeroTelefono;
    }
}
