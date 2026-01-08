 

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
    private int puntaje; 
    private final String MENSAJE = "Escoja una opción";
    private final String[] OPCIONES = {"Salir", "Jugar","Mostrar tablero"}; 

    public Arbitro(Interfaz laInterfaz, Tablero elTablero)
    {
        interfaz = laInterfaz; 
        tablero = elTablero; 
    }

    public void jugar(){ //menú interno del juego
        int opcion;
        do {
            opcion = interfaz.pedirOpcion(OPCIONES, MENSAJE);
            switch (opcion) {

                case 1: 
                    
                    break;

                case 2:
                    String tableroFinal=tablero.toString();
                    interfaz.decirMensaje(tableroFinal);
                    break;

            }
        }while(opcion > 0);
    }

        public void mostrarCreditos(){
            interfaz.showMessageDialog(null,"Primer tarea Programada del curso de programación I, 2021." + "\n" + "Realizado por José Antonio Mora, C15114 y Yasmyn Chacón, B41761");
        }

        public void ayudar(){
            interfaz.showMessageDialog(null,"Este juego recibe las coordenadas de la letras de la palabra a evaluar, favor ingresar número de fila y número de columna de forma continua");
        }

    }
