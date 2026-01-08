import javax.swing.JOptionPane;
/**
 * Write a description of class Palindromo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindromo
{
    // instance variables - replace the example below with your own
    private JOptionPane interfaz;

    /**
     * Constructor for objects of class Palindromo
     */
    public Palindromo()
    {
        // initialise instance variables
        interfaz=new JOptionPane();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void verificarPalindromo()
    {
        // put your code here

        String palabraUsuario=interfaz.showInputDialog(null,"Introduzca la palabra que desea saber si es palindromo");
        palabraUsuario=palabraUsuario.toLowerCase();
        int contador=0;
        int limite=palabraUsuario.length();
        limite=limite-1;
        String frase="";
        boolean palidromo=true;
        
        while (contador<=limite){
            frase=frase+palabraUsuario.charAt(limite);
            limite=limite-1;
        }
        
        limite=palabraUsuario.length();
        limite=limite-1;
        
        while (contador<=limite && palidromo==true) {
            String fraseFinal=""+frase.charAt(contador);
            String palabraFinal=""+palabraUsuario.charAt(contador);
            if ((fraseFinal.equals(" "))){
                limite=limite-1;
            } 
            
            if ((palabraFinal.equals(" "))){
                contador=contador+1; 
            }
        
            if ((fraseFinal).equals(palabraFinal)) {
                palidromo=true;
                limite=limite-1;
                contador=contador+1;
            } else{
                palidromo=false;
            }
        }
        
        if (palidromo==true){
            interfaz.showMessageDialog(null,"SI es palidromo"); 
        }else{
            interfaz.showMessageDialog(null,"NO es palidromo");
        }
    }
}