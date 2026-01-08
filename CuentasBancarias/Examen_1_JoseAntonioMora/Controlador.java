 

//Jose Antonio Mora M C15114
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
    private final String[] OPCIONES = {"Salir", "Distribuir Computadoras en laboratorio", "Creditos"}; 
    private Interfaz interfaz;
    private Aula aula;

    public Controlador(){

        interfaz= new Interfaz("Bienvenido", "Computadora.png");
        aula= new Aula(interfaz); 

    }

    public void iniciar()
    {
        int opcion;
        do {
            opcion = interfaz.pedirOpcion(OPCIONES, MENSAJE);
            switch (opcion) {

                case 1: 
                boolean cupieron=aula.distribuirComputadoras();
                String matriz=aula.toString();
                String cupieronTodas="";
                if (cupieron==true){
                    cupieronTodas="Las computadoras si cupieron en el aula";
                }else{
                     cupieronTodas="Las computadoras NO cupieron en el aula";
                }
                interfaz.showMessageDialog(null,matriz+"\n"+cupieronTodas);
                break;

                case 2:
                aula.mostrarCreditos();
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

