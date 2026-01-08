
/**
 * Write a description of class Controlador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controlador{
    private final String TITULO_VENTANAS = " ";
    private final String NOMBRE_ARCHIVO_IMAGEN = " ";
    private final String MENSAJE = "Escoja una opción";
    private final String[] OPCIONES = {"Salir", "Jugar", "Ver créditos", "Ayuda"}; 
    private Interfaz interfaz;
    private Arbitro arbitro;
    private Tablero tablero;
    private Dado []dados;

    public Controlador(){

        interfaz= new Interfaz("Bienvenido al juego Boggle", "BOGGLE.JPG");
        tablero= new Tablero();
        arbitro= new Arbitro("", interfaz, tablero); 

    }

    public void iniciar()
    {
        int opcion;
        do {
            opcion = interfaz.pedirOpcion(OPCIONES, MENSAJE);
            switch (opcion) {

                case 1: 
                arbitro.jugar();
                break;

                case 2:
                arbitro.mostrarCreditos();
                break;

                case 3:
                arbitro.ayudar();
                break;

            }
        }while(opcion > 0);
    }

    public static void main(String[] parametros){
        Controlador controlador;
        controlador = new Controlador();
        controlador.iniciar();
    }

}

