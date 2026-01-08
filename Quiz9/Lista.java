
/**
 * Write a description of class Lista here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lista
{
    // instance variables - replace the example below with your own
    private Nodo primero;

    /**
     * Constructor for objects of class Lista
     */
    public Lista()
    {
        primero=null;
    }

    public Nodo getPrimero()
    {
        return primero;
    }

    public void setPrimero(Nodo primeroRecibido)
    {
        primero=primeroRecibido;
    }

    public boolean estarVacia(){
        boolean verdadero=false;
        if (primero==null)
        {
            verdadero=true;  
        }else
        {
            verdadero=false;
        }

        return verdadero;
    }

    public void agregarFinal(Palabra unaPalabra){
        Nodo nodoNuevo=new Nodo(unaPalabra);
        if(this.estarVacia()==true){
            primero=nodoNuevo;
        }else{
            Nodo nodoAuxiliar=primero;
            while(nodoAuxiliar.getSiguiente()!=null){
                nodoAuxiliar=nodoAuxiliar.getSiguiente();
            }
            nodoAuxiliar.setSiguiente(nodoNuevo);
        }
    }

    public int contar(){
        int contador=0;
        if(primero!=null){
            Nodo nodoAuxiliar=primero;
            contador=contador+1;
            while(nodoAuxiliar.getSiguiente()!=null){
                contador++;
                nodoAuxiliar=nodoAuxiliar.getSiguiente();
            }
        }else{
            contador=0;
        }
        return contador;
    }

    public Palabra buscarElemento(String palabraBuscada){
        Nodo auxiliar=primero;
        boolean encontrado=false;
        Palabra palabra;
        if(this.estarVacia()==true){
            encontrado=false;
        }else{
            while(auxiliar.getSiguiente()!=null && encontrado==false)
            {
                if(auxiliar.getPalabra().getPalabra().equals(palabraBuscada)){
                    encontrado=true;
                }else{
                    auxiliar=auxiliar.getSiguiente();
                }  
            }

            if(auxiliar.getPalabra().getPalabra().equals(palabraBuscada)){
                encontrado=true;
            }else{
                encontrado=false;
            }
        }

        if(encontrado==false){
            palabra=new Palabra("cero","cero");
        }else{
            palabra=auxiliar.getPalabra();
        }
        return palabra;
    }

    public boolean eliminar(String identificadorBorrar)
    {
        boolean confirmador=false;
        Nodo auxiliar=primero;
        if(this.estarVacia()==true){
            confirmador=false;
        }else if(auxiliar.getPalabra().getPalabra().equals(identificadorBorrar)){
            primero=auxiliar.getSiguiente();
            confirmador=true;
        }else{
            while(auxiliar.getSiguiente()!=null && confirmador==false)
            {
                if(auxiliar.getSiguiente().getPalabra().getPalabra().equals(identificadorBorrar)){
                    confirmador=true;
                }else{
                    auxiliar=auxiliar.getSiguiente();
                }
            }

            if(confirmador==true){
                auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());
                confirmador=true;
            }else{
                confirmador=false;
            }
        }
        return confirmador;
    }

    public String toString(){
        String stringFinal="";
        Nodo auxiliar=primero;
        if(this.estarVacia()==true){
            stringFinal="No hay nada en la lista";
        }else{
            while(auxiliar.getSiguiente()!=null){
                stringFinal=stringFinal+"\n"+auxiliar.getPalabra().getPalabra();
                stringFinal=stringFinal+" "+auxiliar.getPalabra();
                auxiliar=auxiliar.getSiguiente();
            }
            stringFinal=stringFinal+"\n"+auxiliar.getPalabra().getPalabra();
            stringFinal=stringFinal+" "+auxiliar.getPalabra();
        }
        return stringFinal;
    }
}
