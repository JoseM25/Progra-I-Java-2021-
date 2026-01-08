 


/**
 * Primer Tarea programada, representación del juego de mesa Boggle
 * 
 * @author José Antonio Mora, C15114 y Yasmyn Chacón, B41761
 * @version final
 */
public class Controlador{
    private final String TITULO_VENTANAS = " ";
    private final String NOMBRE_ARCHIVO_IMAGEN = " ";
    private final String MENSAJE = "Escoja una opción";
    private final String[] OPCIONES = {"Salir", "Jugar", "Ver créditos", "Ayuda"}; 
    private Interfaz interfaz;
    private Arbitro arbitro;
    private Tablero tablero;

    public Controlador(){

        interfaz= new Interfaz("Bienvenido", "Kanye.JPG");
        tablero= new Tablero();
        arbitro= new Arbitro(interfaz,tablero); 

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

