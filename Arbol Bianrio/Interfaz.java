import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 * Write a description of class Interfaz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Interfaz extends JOptionPane
{
    // instance variables - replace the example below with your own
    private final String TITULO;
    private final ImageIcon IMAGEN;
    
    /**
     * Constructor for objects of class Interfaz
     */
    public Interfaz(String miTitulo, String nombreImagen)
    {
        // initialise instance variables
        TITULO=miTitulo;
        IMAGEN=new ImageIcon(this.getClass().getResource(nombreImagen));
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void decirMensaje(String elMensaje)
    {
        // put your code here
        this.showMessageDialog(null,elMensaje);
        while ((this.equals(null))||(this.equals(""))){
            this.showMessageDialog(null,"Entrada Invalida. Vuelva a intentarlo");
            this.showMessageDialog(null,elMensaje);
        }
    }
    
    public String pedirHilera(String elMensaje){
        String resultado;
        resultado=this.showInputDialog(null,elMensaje);
        while((resultado.equals(null))||(resultado.equals(""))){
            this.showMessageDialog(null,"Entrada Invalida.Vuelva a intentarlo");
            resultado=this.showInputDialog(null,elMensaje);
        }
        return resultado;
    }
    
    public int pedirNumero(String unString){
        int resultado;
        String elString;
        elString=this.showInputDialog(null,unString);
        while((elString.equals(null))||(elString.equals(("")))){
            this.showMessageDialog(null,"Entrada Invalida.Vuelva a intentarlo");
            elString=this.showInputDialog(null,unString);
        }
        resultado=Integer.parseInt(elString);
        return resultado;
    }
    
    public int pedirOpcion(String[] lasOpciones, String elMensaje)
    {
        int resultado;
        resultado=this.showOptionDialog(null,elMensaje,TITULO,DEFAULT_OPTION,PLAIN_MESSAGE,IMAGEN,lasOpciones,null);
        return resultado;
    }
}
