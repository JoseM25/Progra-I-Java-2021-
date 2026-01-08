import java.util.Random;
import javax.swing.JOptionPane;
/**
 * Write a description of class Experto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Experto
{
    // instance variables - replace the example below with your own
    private Random generador;
    private JOptionPane interfaz;
    /**
     * Constructor for objects of class Experto
     */
    public Experto()
    {
        // initialise instance variables
        generador=new Random();
        interfaz=new JOptionPane();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void conseguirNumeroAleatorio()
    {
        String continuar=("1");
        while (continuar.equals("1")){
            int numeroAleatorio=generador.nextInt(10)+1;
            interfaz.showMessageDialog(null,"Su numero es: "+numeroAleatorio);
            continuar=interfaz.showInputDialog(null,"Desea continuar? 1.Si 2.No");
        }
    }

    public int cantidadNumerosAleatorios(int numeroRecibido)
    { 
        int numeroAleatorio=generador.nextInt(10);
        int cantidadNumeros=0;
        cantidadNumeros=cantidadNumeros+1;
        while (numeroRecibido!=numeroAleatorio){
            numeroAleatorio=generador.nextInt(10);
            cantidadNumeros=cantidadNumeros+1;
        }
        return cantidadNumeros;
    }

    public boolean encontrarCaracter(String palabraRecibida, String caracterRecibido)
    {
        boolean encontrado=false;
        int indice=0;
        String letra="";
        while(indice<palabraRecibida.length()&&(encontrado==false)){
            letra=palabraRecibida.substring(indice,indice+1);
            if(letra.equalsIgnoreCase(caracterRecibido)){
                encontrado=true;
            }else {
                indice=indice+1;   
            }
        }
        return encontrado;
    }

    public void divisibleEntre2y5(){
        boolean continuar=true;
        while (continuar==true){
            String numeroRecibido=interfaz.showInputDialog(null,"Digite un numero divisible por 2 o 5");
            int numeroFinal=Integer.parseInt(numeroRecibido);
            if ((numeroFinal%2)==0 || (numeroFinal%5)==0){
                continuar=true;
            }else{
                continuar=false;
            }
        }
    }

    public void adivinarNumero(){
        boolean continuar=true;
        int contador=2;
        int numeroOculto=generador.nextInt(10);
        interfaz.showMessageDialog(null,"Adivine el numero escondido(de 0 a 9). Tiene 3 intentos");
        String numeroAdivinado=interfaz.showInputDialog(null,"Adivinador. Intentos restantes: "+(contador));
        int numeroFinal=Integer.parseInt(numeroAdivinado);
        while (continuar==true){
            if ((numeroFinal)==(numeroOculto)){
                interfaz.showMessageDialog(null,"Felicidades, ha adivinado");
                continuar=false;
            }else {
                if((numeroFinal)<(numeroOculto)){
                    contador=contador-1;
                    interfaz.showMessageDialog(null,"Equivocado.El numero es mayor.");
                    numeroAdivinado=interfaz.showInputDialog("Adivinador. Intentos restantes: "+(contador));
                    numeroFinal=Integer.parseInt(numeroAdivinado);
                } else{
                    contador=contador-1;
                    interfaz.showMessageDialog(null,"Equivocado.El numero es menor.");
                    numeroAdivinado=interfaz.showInputDialog("Adivinador. Intentos restantes: "+(contador));
                    numeroFinal=Integer.parseInt(numeroAdivinado);
                }
            } 
        }
        if((contador==0 && (numeroFinal)!=(numeroOculto))){
                interfaz.showMessageDialog(null,"Perdiste. El numero era: "+numeroOculto);
            }
    }
}

