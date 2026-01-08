/**
 * Funcionalidad general de la aplicación
 * 
 * @author Vladimir Lara y Maureen Murillo 
 * @version II ciclo 2015
 */
public class Controlador
{
    private final String TITULO_VENTANAS = "Lara-Murillo";
    private final String NOMBRE_ARCHIVO_IMAGEN = "mono.png";
    private final String MENSAJE = "Escoja una opción";
    private final String[] OPCIONES = {"Terminar", "Encriptar con método A", "Encriptar con método B", "Desencriptar según método A", "Desencriptar según método B"}; 
    private Interfaz interfaz;
    private Filologo filologoA;
    private Filologo filologoB;

    public Controlador()
    {
        interfaz = new Interfaz(TITULO_VENTANAS, NOMBRE_ARCHIVO_IMAGEN);

        String silabaMagica;
        silabaMagica = interfaz.pedirHilera("¿Cuál es la primera opción de sílaba mágica para encriptar?");
        filologoA = new Filologo(silabaMagica, interfaz);
        silabaMagica = interfaz.pedirHilera("¿Cuál es la segunda opción de sílaba mágica para encriptar?");
        filologoB = new Filologo(silabaMagica, interfaz);

    }

    public void iniciar()
    {
        int opcion;
        do {
            opcion = interfaz.pedirOpcion(OPCIONES, MENSAJE);
            switch (opcion) {
                case 1: 
                    filologoA.encriptar();
                    break;
                case 2: 
                    filologoB.encriptar();
                    break;
                case 3:
                    filologoA.desencriptar();
                    break;
                case 4:
                    filologoB.desencriptar();
                    break;
            }
        }while(opcion > 0);
    }

    public static void main(String[] parametros)
    {
        Controlador controlador;
        controlador = new Controlador();
        controlador.iniciar();
    }
}