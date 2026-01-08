
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
    private Interfaz interfaz;

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

    public void agregarInicio(Elemento unElemento){
        Nodo nodoNuevo=new Nodo(unElemento);
        if(this.estarVacia()==true){
            primero=nodoNuevo;
        }else{
            Nodo auxiliar=primero;
            primero=nodoNuevo;
            nodoNuevo.setSiguiente(auxiliar);
        }
    }
    
    public boolean push(){
        boolean confirmador=false;
        if(this.estarVacia()==true){
            interfaz.decirMensaje("No hay nada por desencolar");
            confirmador=false;
        }else{
            Nodo auxiliar=primero;
            primero=auxiliar.getSiguiente();
            confirmador=true;
        }
        return confirmador;
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

    public Elemento buscarElemento(String idBuscado){
        Nodo auxiliar=primero;
        boolean encontrado=false;
        Elemento elemento;
        if(this.estarVacia()==true){
            encontrado=false;
        }else{
            while(auxiliar.getSiguiente()!=null && encontrado==false)
            {
                if(auxiliar.getElemento().getIdentificador().equals(idBuscado)){
                    encontrado=true;
                }else{
                    auxiliar=auxiliar.getSiguiente();
                }  
            }

            if(auxiliar.getElemento().getIdentificador().equals(idBuscado)){
                encontrado=true;
            }else{
                encontrado=false;
            }
        }

        if(encontrado==false){
            elemento=new Elemento(0,"cero");
        }else{
            elemento=auxiliar.getElemento();
        }
        return elemento;
    }

    public boolean eliminar(String nombreBorrar)    {       
        boolean confirmador=false;  
        Nodo auxiliar=primero;  
        if(this.estarVacia()==true){           
            confirmador=false;        
        }else if(auxiliar.getElemento().getIdentificador().equals(nombreBorrar)){
            primero=primero.getSiguiente();
            confirmador=true;
        }else{
            while((auxiliar.getSiguiente()!=null)&&(confirmador==false)){
                if((auxiliar.getSiguiente().getSiguiente()!=null)&&(auxiliar.getSiguiente().getElemento().getIdentificador().equals(nombreBorrar))){            
                    auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());
                    confirmador=true;        
                }else{  
                    auxiliar=auxiliar.getSiguiente();
                }   
            }
        }
        
        if(confirmador==false){
            Nodo auxiliarFinal=primero;
            while(auxiliarFinal.getSiguiente().getSiguiente()!=null){
                auxiliarFinal=auxiliarFinal.getSiguiente();
            }
            if(auxiliarFinal.getSiguiente().getElemento().getIdentificador().equals(nombreBorrar)){
                auxiliarFinal.setSiguiente(null);
                confirmador=true;
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
                stringFinal=stringFinal+"\n"+auxiliar.getElemento().getIdentificador();
                stringFinal=stringFinal+" "+auxiliar.getElemento().getValor();
                auxiliar=auxiliar.getSiguiente();
            }
            stringFinal=stringFinal+"\n"+auxiliar.getElemento().getIdentificador();
            stringFinal=stringFinal+" "+auxiliar.getElemento().getValor();
        }
        return stringFinal;
    }
}
