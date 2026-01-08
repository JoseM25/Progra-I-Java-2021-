
public class Controlador{
    private final String TITULO_VENTANAS = " ";
    private final String NOMBRE_ARCHIVO_IMAGEN = " ";
    private final String MENSAJE = "Escoja una opción";
    private final String[] OPCIONES = {"Salir", "Verificar vacia", "Agregar Arbol","Buscar Menor","Buscar Mayor","Eliminar","String Preoden", "String Inorden", "String PostOrden"}; 
    private Interfaz interfaz;
    private Arbol arbol;
    public Controlador(){
        interfaz= new Interfaz("Bienvenido", "Arbol.PNG");
        arbol=new Arbol();
    }

    public void iniciar()
    {
        int opcion;
        do {
            opcion = interfaz.pedirOpcion(OPCIONES, MENSAJE);
            switch (opcion) {

                case 1: 
                    boolean verdad=arbol.estarVacia();
                    String vacia=Boolean.toString(verdad);
                    interfaz.decirMensaje(vacia);
                    break;

                case 2: 
                    int val=interfaz.pedirNumero("Digite el valor");
                    String id=interfaz.pedirHilera("Digite el identificador");
                    Elemento unElemento=new Elemento(val,id);  
                    arbol.agregarArbol(unElemento);
                    break;

                case 3:
                    Elemento menor=arbol.buscarMenor();
                    if(menor.getIdentificador().equals("0") && menor.getValor()==0){
                        interfaz.decirMensaje("La lista esta vacia");
                    }else{
                        String Id=menor.getIdentificador();
                        int value=menor.getValor();
                        interfaz.decirMensaje("El elemento menor es: "+Id+" "+value);
                    }
                    break;
                case 4:
                    Elemento mayor=arbol.buscarMayor();
                     if(mayor.getIdentificador().equals("0") && mayor.getValor()==0){
                        interfaz.decirMensaje("La lista esta vacia");
                    }else{
                        String IdMa=mayor.getIdentificador();
                        int valueMa=mayor.getValor();
                        interfaz.decirMensaje("El elemento mayor es: "+IdMa+" "+valueMa);
                    }
                    break;
                case 5:
                    String eliminar=interfaz.pedirHilera("Digite el identificador que desea borrar");
                    boolean verdadero=arbol.eliminarArbol(eliminar);
                    String eliminado=Boolean.toString(verdadero);
                    interfaz.decirMensaje(eliminado);
                    break;
                case 6:
                    String preOrden=arbol.toStringPreOrden();
                    interfaz.decirMensaje(preOrden);
                    break;
                case 7:
                    String inOrden=arbol.toStringInOrden();
                    interfaz.decirMensaje(inOrden);
                    break;
                    
                case 8:
                    String postOrden=arbol.toStringPostOrden();
                    interfaz.decirMensaje(postOrden);
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

