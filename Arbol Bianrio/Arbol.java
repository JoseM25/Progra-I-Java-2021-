
/**
 * Write a description of class Lista here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arbol
{

    private Nodo raiz;

    /**
     * Constructor for objects of class Lista
     */
    public Arbol()
    {
        raiz=null;
    }

    public Nodo getRaiz()
    {
        return raiz;
    }

    public void setPrimero(Nodo raizRecibida)
    {
        raiz=raizRecibida;
    }

    public boolean estarVacia(){
        boolean verdadero=false;
        if (raiz==null)
        {
            verdadero=true;  
        }else
        {
            verdadero=false;
        }

        return verdadero;
    }

    public boolean serHoja(){
        boolean verdadero=false;
        if((raiz.getDerecho().getRaiz()==null) && (raiz.getIzquierdo().getRaiz()==null)){
            verdadero=true;
        }else{
            verdadero=false;
        }
        return verdadero;
    }

    public void agregarArbol(Elemento unElemento){
        Nodo nuevo=new Nodo(unElemento);
        if(this.estarVacia()==true){
            raiz=nuevo;
        }else{
            if(nuevo.getElemento().getIdentificador().compareToIgnoreCase(raiz.getElemento().getIdentificador())>0){
                raiz.getDerecho().agregarArbol(nuevo.getElemento());
            }else{
                raiz.getIzquierdo().agregarArbol(nuevo.getElemento());
            }
        }
    }

    public Elemento buscarMenor(){
        Elemento menor;
        Nodo auxiliar=raiz;
        if((auxiliar.getIzquierdo().getRaiz()==null)){
            menor=auxiliar.getElemento();
        }else{
            menor=auxiliar.getIzquierdo().buscarMenor();
        }
        return menor;
    }

    public Elemento buscarMayor(){
        Elemento mayor;
        Nodo auxiliar=raiz;

        if((auxiliar.getDerecho().getRaiz()==null)){
            mayor=auxiliar.getElemento();
        }else{
            mayor=auxiliar.getDerecho().buscarMayor();
        }
        return mayor;
    }

    public boolean eliminarArbol(String unId){
        boolean verdad=false;
        if(this.estarVacia()==true){
            verdad=false;
        }else if((raiz.getElemento().getIdentificador().equals(unId)) && (this.serHoja()==true)){
            raiz=null;
            verdad=true;
        }else if((raiz.getElemento().getIdentificador().equals(unId)) && (this.serHoja()==false)){
            if(raiz.getDerecho().estarVacia()==false){
                Elemento sustituto=raiz.getDerecho().buscarMenor();
                raiz.setElemento(sustituto);
                raiz.getDerecho().eliminarArbol(sustituto.getIdentificador());
            }else{
                Elemento sustituto=raiz.getIzquierdo().buscarMayor();
                raiz.setElemento(sustituto);
                raiz.getIzquierdo().eliminarArbol(sustituto.getIdentificador());
            }
        }else{
            if(unId.compareToIgnoreCase(raiz.getElemento().getIdentificador())<=0){
                verdad=raiz.getIzquierdo().eliminarArbol(unId);
            }else{
                verdad=raiz.getDerecho().eliminarArbol(unId);
            }
        }
        return verdad;
    }

    public String toStringPreOrden(){
        String preOrden="";
        preOrden+=raiz.getElemento().getIdentificador()+" ";
        if(raiz.getIzquierdo().getRaiz()!=null){
            preOrden+=raiz.getIzquierdo().toStringPreOrden();
        }

        if(raiz.getDerecho().getRaiz()!=null){
            preOrden+=raiz.getDerecho().toStringPreOrden();
        }
        return preOrden;
    }

    public String toStringInOrden(){
        String inOrden="";
        inOrden+=raiz.getElemento().getIdentificador()+" ";
        if(raiz.getIzquierdo().getRaiz()!=null){
            inOrden+=raiz.getIzquierdo().toStringInOrden();
        }
        
        inOrden+=raiz.getElemento().getIdentificador()+" ";
        
        if(raiz.getDerecho().getRaiz()!=null){
            inOrden+=raiz.getDerecho().toStringPreOrden();
        }
        return inOrden;
    }

    public String toStringPostOrden(){
        String postOrden="";
        if(raiz.getIzquierdo().getRaiz()!=null){
            postOrden+=raiz.getIzquierdo().toStringPostOrden();
        }

        if(raiz.getDerecho().getRaiz()!=null){
            postOrden+=raiz.getDerecho().toStringPostOrden();
        }
        postOrden+=raiz.getElemento().getIdentificador()+" ";

        return postOrden;
    }
}