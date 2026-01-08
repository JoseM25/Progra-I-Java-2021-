
/**
 * Write a description of class Tablero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tablero
{
    // instance variables - replace the example below with your own
    private Instruccion tablero[][];
    private int filas,columnas;
    private Interfaz interfaz;

    /**
     * Constructor for objects of class Tablero
     */
    public Tablero()
    {
        // initialise instance variables
        interfaz=new Interfaz("Bienvenido","Kanye.JPG");
        filas=interfaz.pedirNumero("Digite el numero de filas en su juego");
        columnas=interfaz.pedirNumero("Digite el numero de columnas en su juego");
        tablero=new Instruccion[filas][columnas];
        for (int fila=0; fila<tablero.length; fila++){
            for (int columna=0; columna<tablero[0].length; columna++){
                Instruccion miInstruccion=new Instruccion();
                tablero[fila][columna]= miInstruccion; 
            }
        }
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        // put your code here
        String muestraTablero="";
        for (int fila=0; fila<tablero.length; fila++){
            for (int columna=0; columna<tablero[0].length; columna++){
                muestraTablero += " " + tablero[fila][columna].getNumeroInstruccion();
            }
            muestraTablero= muestraTablero+ " " + "\n";
        }
        System.out.println(muestraTablero);
        return muestraTablero;
    }
}
