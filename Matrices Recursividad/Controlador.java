
/**
 * Write a description of class Controlador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controlador
{
    // instance variables - replace the example below with your own
    private Experto experto;
    private Interfaz interfaz;

    /**
     * Constructor for objects of class Controlador
     */
    public Controlador()
    {
        experto=new Experto();
        interfaz=new Interfaz();
    }

    public void iniciar(){
        int lista[]={1,3,101,5,100};
        int posInicial=0;

        int mayor=experto.calcularMayor(lista,posInicial);
        interfaz.showMessageDialog(null,mayor);
    }

    public static void main(String[] parametros){
        Controlador controlador;
        controlador = new Controlador();
        controlador.iniciar();
    }
}

