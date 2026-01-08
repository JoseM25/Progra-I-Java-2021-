
public class Controlador{
    private final String TITULO_VENTANAS = " ";
    private final String NOMBRE_ARCHIVO_IMAGEN = " ";
    private final String MENSAJE = "Escoja una opción";
    private final String[] OPCIONES = {"Salir", "Verificar vacia", "Agregar final","Agregar Inicio", "Contar", "Eliminar","Buscar","Imprimir"}; 
    private Interfaz interfaz;
    private Lista lista;
    public Controlador(){
        interfaz= new Interfaz("Bienvenido", "Kanye.JPG");
        lista=new Lista();
    }

    public void iniciar()
    {
        int opcion;
        do {
            opcion = interfaz.pedirOpcion(OPCIONES, MENSAJE);
            switch (opcion) {

                case 1: 
                    boolean verdad=lista.estarVacia();
                    String vacia=Boolean.toString(verdad);
                    interfaz.decirMensaje(vacia);
                    break;

                case 2: 
                    int val=interfaz.pedirNumero("Digite el valor");
                    String id=interfaz.pedirHilera("Digite el identificador");
                    Elemento unElemento=new Elemento(val,id);  
                    lista.agregarFinal(unElemento);
                    break;

                case 3:   
                    int valInicial=interfaz.pedirNumero("Digite el valor");
                    String idInicial=interfaz.pedirHilera("Digite el identificador");
                    Elemento unElementoInicial=new Elemento(valInicial,idInicial);  
                    lista.agregarInicio(unElementoInicial);
                    break;
                
                case 4:
                    int contador=lista.contar();
                    String contadorString=Integer.toString(contador);
                    interfaz.decirMensaje(contadorString);
                    break;

                case 5:
                    String identif=interfaz.pedirHilera("Digite el identificador");
                    boolean confirmador=lista.eliminar(identif);
                    String eliminar=Boolean.toString(confirmador);
                    interfaz.decirMensaje(eliminar);
                    break;

                case 6:
                    String iden=interfaz.pedirHilera("Digite el identificador que desea buscar");
                    Elemento elemento=lista.buscarElemento(iden);
                    if(elemento.getIdentificador().equals("cero") && elemento.getValor()==0){
                        interfaz.decirMensaje("El elemento no esta en la lista");
                    }else{
                        String buscar=elemento.toString();
                        interfaz.decirMensaje(buscar);
                    }
                    break;

                case 7:
                    String imprimir=lista.toString();
                    interfaz.decirMensaje(imprimir);
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

