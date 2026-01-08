import javax.swing.JOptionPane;

public class Interfaz extends JOptionPane {
    
    public void decirMensaje(String elMensaje) {
        this.showMessageDialog(null, elMensaje);
    }
    
    public String pedirHilera(String elMensaje) {
        String resultado = this.showInputDialog(null, elMensaje);
        return resultado;
    }
    
    public int pedirEntero(String elMensaje) {
        int elNumero;
        String respuesta = this.showInputDialog(null, elMensaje);
        elNumero = Integer.parseInt(respuesta);
        return elNumero;
    }
}