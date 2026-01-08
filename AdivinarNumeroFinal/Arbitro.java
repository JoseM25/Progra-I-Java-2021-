import java.util.Random;

/**
 * Write a description of class Arbitro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arbitro
{
    // instance variables - replace the example below with your own
    private Interfaz interfaz;
    private Random generador;
    /**
     * Constructor for objects of class Arbitro
     */
    public Arbitro(Interfaz laInterfaz)
    {
        // initialise instance variables
        interfaz=laInterfaz;
        generador=new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void iniciarJuego(){
        boolean continuar=true;
        int contador=2;
        int numeroOculto=generador.nextInt(10);
        interfaz.decirMensaje("Adivine el numero escondido(de 0 a 9). Tiene 3 intentos");
        String numeroAdivinado=interfaz.pedirHilera("Adivinador. Intentos restantes: "+(contador));
        int numeroFinal=Integer.parseInt(numeroAdivinado);
        while (continuar==true){
            if ((numeroFinal)==(numeroOculto)){
                interfaz.decirMensaje("Felicidades, ha adivinado");
                continuar=false;
            }else {
                if((contador==0 && (numeroFinal)!=(numeroOculto))){
                    interfaz.decirMensaje("Perdiste. El numero era: "+numeroOculto);
                    continuar=false;
                }
                else if((numeroFinal)<(numeroOculto)){
                    contador=contador-1;
                    interfaz.decirMensaje("Equivocado.El numero es mayor.");
                    numeroAdivinado=interfaz.pedirHilera("Adivinador. Intentos restantes: "+(contador));
                    numeroFinal=Integer.parseInt(numeroAdivinado);
                } else if((numeroFinal)>(numeroOculto)){
                    contador=contador-1;
                    interfaz.decirMensaje("Equivocado.El numero es menor.");
                    numeroAdivinado=interfaz.pedirHilera("Adivinador. Intentos restantes: "+(contador));
                    numeroFinal=Integer.parseInt(numeroAdivinado);

                }
            }
        } 
    }

    public void mostrarCreditos(){
        interfaz.decirMensaje("Jose Antonio Mora \nv1.0 \n21 de setiembre 2021");
    }
}  

