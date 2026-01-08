import java.util.ArrayList;

/**
 *
 *
 * @Jose Antonio Mora
 * @C15114
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

    public void agregarFinal(Maquina unaMaquina){
        Nodo nodoNuevo=new Nodo(unaMaquina);
        Nodo nodoAuxiliar=primero;
        if(this.estarVacia()==true){
            primero=nodoNuevo;
        }else{
            int indice=0;
            while(nodoAuxiliar.getSiguiente().size()!=indice-1){
                nodoAuxiliar.setSiguiente(nodoNuevo);
                nodoAuxiliar=nodoAuxiliar.getSiguiente().get(indice);
                indice++;
            }
        }
    }

    public String buscarMaquina(String idBuscado){
        Nodo auxiliar=primero;
        boolean encontrado=false;
        String maquinasSiguientes="";
        if(this.estarVacia()==true){
            encontrado=false;
            maquinasSiguientes="No se encuentra en la lista";
        }else{
            int indice=0;
            while(auxiliar.getSiguiente().get(indice)!=null && encontrado==false)
            {
                if(auxiliar.getMaquina().getIdentificador().equals(idBuscado)){
                    encontrado=true;
                }else{
                    auxiliar=auxiliar.getSiguiente().get(indice);
                }  
            }

            if(auxiliar.getMaquina().getIdentificador().equals(idBuscado)){
                encontrado=true;
            }else{
                encontrado=false;
            }
        }

        if(encontrado==false){
            maquinasSiguientes="No existe la maquina en la lista";
        }else{
            int indice=0;
            while(auxiliar.getSiguiente().get(indice)!=null){
                maquinasSiguientes=auxiliar.getSiguiente().get(indice).getMaquina().getIdentificador();
                maquinasSiguientes=maquinasSiguientes+" "+auxiliar.getSiguiente().get(indice).getMaquina().getValor();
                auxiliar=auxiliar.getSiguiente().get(indice);
            }
        }
        return maquinasSiguientes;
    }

    public int costosRecursivos(){
        Nodo auxiliar=primero;
        int indice=0;
        int valorTotal=0;
        if(auxiliar.getSiguiente().get(indice)==null){
            
        }else{
            if(auxiliar.getSiguiente().get(indice).getMaquina().getValor()>200){
                valorTotal=this.costosRecursivos();
            }else{
                auxiliar=auxiliar.getSiguiente().get(indice);
            }
        }
        return valorTotal;
    }

    public String toString(){
        String stringFinal="";
        Nodo auxiliar=primero;
        int indice=0;
        if(this.estarVacia()==true){
            stringFinal="No hay nada en la lista";
        }else{
            while(auxiliar.getSiguiente().size()!=indice-1){
                stringFinal=stringFinal+"\n"+auxiliar.getMaquina().getIdentificador();
                stringFinal=stringFinal+" "+auxiliar.getMaquina().getValor();
                auxiliar=auxiliar.getSiguiente().get(indice);
                indice++;
            }
            stringFinal=stringFinal+"\n"+auxiliar.getMaquina().getIdentificador();
            stringFinal=stringFinal+" "+auxiliar.getMaquina().getValor();
        }
        return stringFinal;
    }
}
