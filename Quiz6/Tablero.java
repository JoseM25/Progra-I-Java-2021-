
/**
 * Write a description of class Tablero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tablero
{
    // instance variables - replace the example below with your own
    private Dado tablero[][];
    private int filas, columnas;
    private Interfaz interfaz; 

    //String prueba;
    /**
     * Constructor for objects of class Tablero
     */
    public Tablero(){
        //losDados []= new Dado();
        filas=4;
        columnas=4; 
        tablero = new Dado [filas][columnas];

        int contador=0; 
        for (int fila=0; fila<tablero.length; fila++){
            for (int columna=0; columna<tablero[0].length; columna++){
                Dado miDado= new Dado();
                tablero[fila][columna]= miDado; 
            }
        }
    }

    public void mezclarTablero(){
        String agitarTablero="";
        int random1=(int)(Math.random() * (4));
        int random2=(int)(Math.random() * (4));
        for (int fila=0; fila<tablero.length; fila++){
            for (int columna=0; columna<tablero[0].length; columna++){
                Dado elDado=tablero[fila][columna];
                tablero[random1][random2]=elDado;
            }
            agitarTablero+="\n";
        }
        String mezclarTablero="";
        for (int fila=0; fila<tablero.length; fila++){
            for (int columna=0; columna<tablero[0].length; columna++){
                Dado elDado=tablero[fila][columna];
                elDado.lanzarDado();
                tablero[fila][columna]=elDado;
                mezclarTablero+=" "+tablero[fila][columna].getCaraVisible();
            }
            mezclarTablero+="\n";
        }
        interfaz.showMessageDialog(null,"Tablero Mezclado");

    }

    public void mostrarTablero(){
        String mostrarTablero=this.toString();
        interfaz.showMessageDialog(null,mostrarTablero);
    }

    public void terminar(){
        //muestra la cara visible del dado
    }

    public String toString(){
        String muestraTablero="";
        for (int fila=0; fila<tablero.length; fila++){
            for (int columna=0; columna<tablero[0].length; columna++){
                muestraTablero += " " + tablero[fila][columna].getCaraVisible();
            }
            muestraTablero= muestraTablero+ " " + "\n";
        }
        return muestraTablero;
    }

    public Dado [][] getTablero(){
        return tablero; 
    }

    public void setTablero (Dado [][] miTablero){
        tablero=miTablero;
    }

}
