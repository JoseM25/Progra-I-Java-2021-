import java.util.Random;

/**
 * Write a description of class TableroMemoria here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tablero
{
    // instance variables - replace the example below with your own
    private Tarjeta imagenes[][];
    private String tabla[][];
    /**
     * Constructor for objects of class TableroMemoria
     */
    public Tablero()
    {
        // initialise instance variables
        imagenes=new Tarjeta[5][6];
        Tarjeta miTarjeta=new Tarjeta();
        int indice=0;
        for (int fila=0;fila<5;fila++){
            for (int columna=0;columna<6;columna++){
                imagenes[fila][columna]=miTarjeta;
        
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
        tabla=new String[5][6];
        int indice=0;
        for (int fila=0;fila<5;fila++){
            for(int columna=0;columna<6;columna++){
                tabla[fila][columna]=imagenes[fila][columna].getCaraVisible(indice);
                indice++;
            }
        }
        Random generador;       
        generador=new Random(); 
        
         for (int fila=0;fila<5;fila++){
            for(int columna=0;columna<6;columna++){
                int random1=generador.nextInt(5);
                int random2=generador.nextInt(6);
                String imagen=tabla[fila][columna];
                tabla[fila][columna]=tabla[random1][random2];
                tabla[random1][random2]=imagen;
                
            }
        }
        
        String mostrarTablero="";
        for (int fila=0; fila<5 ;fila++){
            for (int columna=0; columna<6; columna++){
                mostrarTablero += " " + tabla[fila][columna];
            }
            mostrarTablero=mostrarTablero+ " " + "\n";
        }
        System.out.println(mostrarTablero);
        return mostrarTablero;
    }
}
