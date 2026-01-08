import java.util.Random;

/**
 * Write a description of class Instruccion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Instruccion
{
    // instance variables - replace the example below with your own
    private String instruccion[]={"1.No se mueva", "2. Avance 4 lugares","3.Brinque a la proxima fila","4.Retroceda 2 lugares","5.Exploto,fin del juego"};
    private String instruccionFinal;
    private int instruccionVisible;
    Random generador;
    /**
     * Constructor for objects of class Instruccion
     */
    public Instruccion()
    {
        // initialise instance variables
        instruccion=new String[5];
        generador=new Random();
        int numeroRandom=generador.nextInt(5);
        instruccionVisible=numeroRandom+1;
        instruccionFinal=instruccion[numeroRandom];
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getNumeroInstruccion()
    {
        // put your code here
        return instruccionVisible;
    }
}
