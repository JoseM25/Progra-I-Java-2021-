
/**
 * Write a description of class Arbitro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arbitro
{
    // instance variables - replace the example below with your own
    private String palabraSeleccionada;
    private Interfaz interfaz;
    private Tablero tablero;

    public Arbitro(String laPalabra, Interfaz laInterfaz)
    {
        palabraSeleccionada = laPalabra;
        interfaz = laInterfaz; 
    }

    public void iniciarJuego(){
        //llama tablero (metodo mezclar - mostrar) 
        interfaz.decirMensaje("Escogió la opción Jugar");
    }

    public boolean verificarPalabra(String laPalabra){
        boolean miPalabra=false;
        //verifica que este en orden y que la letra no se haya usado antes
        //indica al usuaria si no es válida
        return miPalabra; 
    }

    public int controlarPuntaje(String laPalabra){
        int puntaje=0;
        //si es válida calcula puntaje
        return puntaje; 
    }

    public void mostrarLista(){
        //muestra las palabras acertadas y su puntaje
    }

    public void mostrarCreditos(){
        interfaz.decirMensaje("Escogió la opción Mostrar Créditos");
    }

    public void ayudar(){
        interfaz.decirMensaje("Escogió la opción Ayuda");
    }

    public void Terminar(){
        //muestra mensaje de despedida y puntos ganados
    }

}
