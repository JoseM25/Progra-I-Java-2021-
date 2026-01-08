
/**
 * Write a description of class Tarjeta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tarjeta
{
    // instance variables - replace the example below with your own
    private int caracteres[]={9960,9961,9962, 9963, 9964, 9965, 9966, 9967, 9968, 9969, 9970, 9971, 9972, 9973,9974,9960,9961,9962, 9963, 9964, 9965, 9966, 9967, 9968, 9969, 9970, 9971, 9972, 9973,9974};  
    private char tarjeta[];
    String caraVisible;
    /**
     * Constructor for objects of class Tarjeta
     */
    public Tarjeta()
    {
        // initialise instance variables
        tarjeta=new char[30];
        for(int indice=0;indice<caracteres.length;indice++){
            tarjeta[indice]=(char)caracteres[indice];
        }
        
    }
    
    public String getCaraVisible(int indice){
        caraVisible=Character.toString(tarjeta[indice]);
        return caraVisible;
    }
}
