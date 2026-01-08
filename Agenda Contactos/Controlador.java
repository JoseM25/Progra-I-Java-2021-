
/**
 * Write a description of class Controlador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controlador
{
    // instance variables - replace the example below with your own
    private Agenda miAgenda;
    private Interfaz interfaz;
    private String[] OPCIONES={"Salir","Insertar Contacto","Buscar Contacto", "Mostrar Agenda", "Intercambiar 2 contactos", "Desordenar Agenda", "Ordenar Seleccion"};
    private String MENSAJE="Su agenda";
    /**
     * Constructor for objects of class Controlador
     */
    public Controlador()
    {
        miAgenda= new Agenda();
        interfaz=new Interfaz("Agenda", "Agenda.png");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void iniciar()
    {
          int opcion;
        do {
            opcion = interfaz.pedirOpcion(OPCIONES, MENSAJE);
            switch (opcion) {

                case 1: 
                miAgenda.insertarContacto();
                break;

                case 2:
                miAgenda.buscarContacto();
                break;

                case 3:
                miAgenda.toString();
                break;
                
                case 4:
                miAgenda.intercambiarDosContactos();
                break;
                
                case 5:
                miAgenda.desordenarAgenda();
                break;
                
                case 6:
                miAgenda.ordenarSeleccion();
                break;
                
                case 7:
                miAgenda.ordenarBurbuja();
                break;

            }
        }while(opcion > 0);
    }
    
    public static void main(String[] parametros){
        Controlador controlador;
        controlador=new Controlador();
        controlador.iniciar();
    }
}
