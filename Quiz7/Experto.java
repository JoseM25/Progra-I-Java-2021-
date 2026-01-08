
/**
 * Write a description of class Experto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Experto
{
    private Interfaz interfaz;
    /**
     * Constructor for objects of class Experto
     */
    public Experto()
    {
        interfaz=new Interfaz();
    }
    
    public String volverFrase(String frase)
    {
        String resultado="";
        if(frase.length()==1){
            resultado=frase;
        }else{
            resultado=frase.charAt(frase.length()-1)+this.volverFrase(frase.substring(0,frase.length()-1));
        }
        return resultado;
    }
    
    public double devolverSaldoCuenta(int saldoInicial,int cantidadMeses,int porcentajeMensual)
    {
        double resultado;
        double interes=porcentajeMensual/100;
        if(cantidadMeses==0){
            resultado=saldoInicial;
        }else{
            resultado=saldoInicial*interes+this.devolverSaldoCuenta(saldoInicial,cantidadMeses-1,porcentajeMensual);
        }
        return resultado;
    }
}
