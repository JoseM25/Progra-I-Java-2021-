import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 * Clase para la interacción con el usuario.
 * Programación 1
 * Profesores: V.Lara / M.Murillo
 */

public class Interfaz extends JOptionPane
{
    private final String TITULO;
    private final ImageIcon IMAGEN;
    
    /**
     * Le asocia al objeto un título y una imagen que serán utilizados en las ventanas de interacción.
     * Supone que el archivo con la imagen se encuentra en la misma carpeta del código fuente.
     */
    public Interfaz(String elTitulo, String nombreArchivoImagen)
    {
        TITULO = elTitulo;
        IMAGEN = new ImageIcon(this.getClass().getResource(nombreArchivoImagen));
    }
    
    public void decirMensaje(String elMensaje)
    {
        this.showMessageDialog(null, elMensaje, TITULO, PLAIN_MESSAGE, IMAGEN);
    }
    
    public String pedirHilera(String elMensaje)
    {
        String resultado;
        resultado = this.showInputDialog(null, elMensaje, TITULO, PLAIN_MESSAGE);
        return resultado;
    }
    
    public int pedirOpcion(String[] lasOpciones, String elMensaje)
    {
        int resultado;
        resultado = this.showOptionDialog(null, elMensaje, TITULO, DEFAULT_OPTION, PLAIN_MESSAGE, IMAGEN, lasOpciones, null);
        return resultado;
    }
}