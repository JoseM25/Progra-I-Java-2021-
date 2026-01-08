
/**
 * Write a description of class Aula here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aula
{
    // instance variables - replace the example below with your own
    private Computadora aula[][];
    private Interfaz interfaz;
    /**
     * Constructor for objects of class Aula
     */
    public Aula(Interfaz laInterfaz)
    {
        interfaz=laInterfaz;
        int fila=interfaz.pedirNumero("Digite las filas del aula");
        int columna=interfaz.pedirNumero("Digite las columnas del aula");
        aula=new Computadora[fila][columna];
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean distribuirComputadoras()
    {
        int cantidadComputadoras=interfaz.pedirNumero("Digite el numero de computadoras que desea colocar");
        int contador=1;
        boolean continuar=true;

        for (int fila=0; fila<aula.length; fila++){
            for (int columna=0; columna<aula[0].length; columna+=2){
                Computadora miComputadora=new Computadora();
                int ancho=miComputadora.getAncho();
                if(ancho==1 && contador<=cantidadComputadoras){
                    miComputadora.setPosicion(contador);
                    aula[fila][columna]=miComputadora;
                    contador++;
                }else if(ancho==2 && contador<=cantidadComputadoras && columna<=aula.length-2){
                    miComputadora.setPosicion(contador);
                    aula[fila][columna]=miComputadora;
                    aula[fila][columna+1]=miComputadora;
                    columna+=1;
                    contador++;
                }else if(ancho==2 && contador<=cantidadComputadoras && columna>=aula.length-2){
                    columna+=1;
                }else{
                    aula[fila][columna]=null;
                }
            }
        }

        if(contador<=cantidadComputadoras){
            continuar=false;
        }else{
            continuar=true;
        }
        return continuar;
    }

    public String toString(){
        String muestraAula="";
        for (int fila=0; fila<aula.length; fila++){
            for (int columna=0; columna<aula[0].length; columna++){
                if(aula[fila][columna]==null){
                    muestraAula+=" "+"0"; 
                }else{
                    muestraAula += " " + aula[fila][columna].getPosicion();   
                }
            }
            muestraAula= muestraAula+ " " + "\n";
        }
        return muestraAula;
    }

    public void mostrarCreditos()
    {
        interfaz.decirMensaje("Jose Antonio Mora M"+"\n"+"C15114");
    }
}
