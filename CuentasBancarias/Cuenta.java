import java.util.ArrayList;


/**
 * Esta clase representa una cuenta bancaria.
 * @author Jose Mora
 * @version 1.0
 */

public class Cuenta {
    //ATRIBUTOS
    private String id;
    private String dueno;
    private double saldo;
    private int cantidadTransacciones;
    
    //CONSTRUCTORES
    /**
     * Este constructor crea una cuenta vacia
     * @param ninguno
     * @return ninguno
     */
    public Cuenta()
    {
        id="";
        dueno="";
        saldo=0;
        cantidadTransacciones=0;
    }   
    
    /**
     * Este constructor crea una cuenta con datos iniciales
     */
    public Cuenta(String unID,String unDueno, double unSaldo) 
    {
        id=unID;
        dueno=unDueno;
        saldo=unSaldo;
    }
    
    //GETTERS Y SETTERS
    public String getId()
    {
        return id;
    }
    
    public String getDueno()
    {
        return dueno; 
    }
    
    public double getSaldo()
    {
        return saldo;
    }
    
    public int getCantidadTransacciones()
    {
        return cantidadTransacciones;   
    }   
    
    public void setId(String nuevoId)
    {
        id=nuevoId;  
    }
    
    public void setDueno(String nuevoDueno)
    {
        dueno=nuevoDueno;    
    }
    
    public void setSaldo(double nuevoSaldo)
    {
        saldo=nuevoSaldo;
    }
    
    public void setCantidadTransacciones(int nuevaCantidadTransacciones)
    {
        cantidadTransacciones=nuevaCantidadTransacciones;   
    }
    
    //OTROS METODOS
    public boolean depositar(double monto)
    {
     boolean resultado;
      if (monto>=0) {  
          saldo = saldo + monto;  
          cantidadTransacciones++; 
          resultado=true;
     } else {
         resultado=false;       
     }
     return resultado;
    }
    
    public boolean retirar(double monto)
    {
        boolean resultado;
        if ((monto>=0) && (monto<=saldo)){
            saldo=saldo-monto;
            cantidadTransacciones++;
            resultado=true;
        }else {
            resultado=false;
            
        }
     return resultado;
    }
    
    public String toString()
    {
        String resultado="";
        resultado="Indentificacion: "+ id + "\n";
        resultado=resultado+"Dueno de la cuenta: "+ dueno + "\n";
        resultado+="Saldo de la cuenta: "+ saldo + "\n";
        resultado+="Cantidad de transacciones: "+ cantidadTransacciones;
        return resultado;
    }
}
 