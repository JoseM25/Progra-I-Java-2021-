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
        this.showMessageDialog(null,elMensaje,TITULO,PLAIN_MESSAGE,IMAGEN);
        while ((this==null)||(this.equals(""))){
            this.showMessageDialog(null,"Entrada Invalida. Vuelva a intentarlo");
            this.showMessageDialog(null,elMensaje,TITULO,PLAIN_MESSAGE,IMAGEN);
        }
    }
    
    public String pedirHilera(String elMensaje){
        String resultado;
        resultado=this.showInputDialog(null,elMensaje,TITULO,PLAIN_MESSAGE);
        while((resultado==null)||(resultado.equals(""))){
            this.showMessageDialog(null,"Entrada Invalida.Vuelva a intentarlo");
            resultado=this.showInputDialog(null,elMensaje,TITULO,PLAIN_MESSAGE);
        }
        return resultado;
    }
    
    public int pedirOpcion(String[] lasOpciones, String elMensaje)
    {
        int resultado;
        resultado=this.showOptionDialog(null,elMensaje,TITULO,DEFAULT_OPTION,PLAIN_MESSAGE,IMAGEN,lasOpciones,null);
        return resultado;
    }
}
