
/**
 * Write a description of class AlgoritmoOrdenamiento here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AlgoritmoOrdenamiento
{
    // instance variables - replace the example below with your own
    private int[] lista;
    private Interfaz interfaz;

    /**
     * Constructor for objects of class AlgoritmoOrdenamiento
     */
    public AlgoritmoOrdenamiento()
    {
        // initialise instance variables
        lista=new int[100];
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void llenar()
    {
        boolean continuar=true;
        int indice=0;
        String numeroUsuario="";
        while (continuar==true){
            numeroUsuario=interfaz.showInputDialog(null,"Digite un numero");
            int numeroFinal=Integer.parseInt(numeroUsuario);
            lista[indice]=numeroFinal;
            indice++;
            String respuestaUsuario=interfaz.showInputDialog("Desea agrergar otro numero? Si o No");
            if(respuestaUsuario.equalsIgnoreCase("Si")){
                continuar=true;
            }else{
                continuar=false;
            }
        }
    }

    public int mostrarMenor(int numeroUsuario)
    {
        int numeroMenor=(lista[numeroUsuario]);
        int indice=numeroUsuario;
        boolean continuar=true;
        numeroUsuario=numeroUsuario+1;
        while (continuar==true){
            if (lista[numeroUsuario]==0){
                continuar=false;
            }else if(numeroMenor<lista[numeroUsuario]){
                continuar=true;
                numeroUsuario=numeroUsuario+1;
            }else if(numeroMenor>lista[numeroUsuario]){
                continuar=true;
                numeroMenor=lista[numeroUsuario];
                indice=numeroUsuario;
                numeroUsuario=numeroUsuario+1;
            }
        }
        return indice;
    }

    public void mostrar()
    {
        String listaNumeros="";
        for(int indice=0;indice<lista.length;indice++){
            listaNumeros=listaNumeros+(Integer.toString(lista[indice])+ "\n");
        }
        interfaz.showMessageDialog(null,listaNumeros);
    }
}
