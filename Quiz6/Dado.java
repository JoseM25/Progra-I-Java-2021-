import java.util.ArrayList;

/**
 * Write a description of class Dados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dado
{
    // instance variables - replace the example below with your own
    private char abecedario[]= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N','O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private String dado[];
    private int valor;
    private String caraVisible;
    private Interfaz interfaz;


    /**
     * Constructor for objects of class Dados
     */
    public Dado(){
        dado = new String [6]; 
        String unDado="";
        String nuevoDado="";
        char letra;
                
        for(int indice=0; indice<dado.length; indice++){
            unDado+=abecedario[(char)(Math.random() * (26))];
            letra= unDado.charAt(indice);
            nuevoDado=Character.toString(letra);
            dado[indice]=nuevoDado;
        }
        //Cara visible
        caraVisible= dado[(char)(Math.random() * (5))]; 
    }        

    public void lanzarDado(){
        caraVisible= dado[(char)(Math.random() * (5))]; 
    }

    public void asignarValor(){
        // asignar valores fijos según dificultad        
    }

    public int getValor(){
        return valor; 
    }

    public void setValor(int unValor){
        valor=unValor;
    }

    public String getCaraVisible(){
        return caraVisible;
    }

    public void setCaraVisible(String unaCaraVisible){
        caraVisible=unaCaraVisible;    
    }

    public String [] getDado(){
        return dado;
    }

    public void setDado(String []unDado){
        dado=unDado;    
    }

}
