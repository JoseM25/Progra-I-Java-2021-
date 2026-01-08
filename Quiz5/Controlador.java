
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

    public Controlador(){

        interfaz= new Interfaz("Bienvenido al juego Boggle", "Icono.PNG");
        arbitro= new Arbitro("", interfaz); 

    }

    public void iniciar()
    {
        int opcion;
        do {
            opcion = interfaz.pedirOpcion(OPCIONES, MENSAJE);
            switch (opcion) {

                case 1: 
                arbitro.iniciarJuego();
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

