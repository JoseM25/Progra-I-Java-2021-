import java.util.ArrayList;

/**
 * Esta clase representa una cuenta bancaria.
 * @author Maureen Murillo
 * @version 06 de setiembre del 2021
 */

public class Cuenta {
    // ATRIBUTOS (CAMPOS)
    private String id;
    private String dueno;
    private double saldo;
    private int cantidadTransacciones;
    
    // CONSTRUCTORES
    /**
     * Este constructor crea una cuenta sin datos.
     * @param Ninguno.
     */
    public Cuenta()
    {
        id = "";
        dueno = "";
        saldo = 0;
        cantidadTransacciones = 0;
    }
    
    /**
     * Este constructor crea una cuenta con los datos iniciales proporcionados.
     * @param unaId Código o identificación única de la cuenta.
     * @param unDueno Nombre del dueño de la cuenta.
     * @param unSaldo Monto con el que se abrirá la cuenta. Puede tener decimales.
     */
    public Cuenta(String unaId, String unDueno, double unSaldo) 
    {
        id = unaId;
        dueno = unDueno;
        saldo = unSaldo;
    }
    
    /**
     * Método que permite depositar un monto en la cuenta.
     * @param monto Monto a depositar en la cuenta. Debe ser positivo o cero.
     * @return true si el depósito se realizó exitosamente o false en caso contrario.
     */
    public boolean depositar(double monto)
    {
        boolean resultado;
        if (monto >= 0) {
            saldo = saldo + monto;
            cantidadTransacciones = cantidadTransacciones+1;
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
    
    /**
     * Método que permite retirar un monto de la cuenta.
     * @param monto Monto a retirar de la cuenta. Debe ser positivo o cero, y menor o igual que el saldo de la cuenta.
     * @return true si el retiro se realizó exitosamente o false en caso contrario.
     */
    public boolean retirar(double monto)
    {
        boolean resultado;
        if ((monto >= 0) && (monto <= saldo)){
            saldo = saldo - monto;
            cantidadTransacciones++;
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
    
    /**
     * Método que devuelve una hilera de texto con la información de la cuenta bancaria.
     * @param Ninguno
     * @return Hilera de texto con la información de la cuenta.
     */
    public String toString()
    {
        String resultado = "";
        resultado = "Identificación de la cuenta: " + id + "\n";
        resultado = resultado + "Dueño de la cuenta: " + dueno + "\n";
        resultado += "Saldo de la cuenta: " + saldo + "\n";
        resultado += "Cantidad de transacciones: " + cantidadTransacciones;
        return resultado;
    }
    
    // GETTERS, SETTERS
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
    public void setId(String laId)
    {
        id = laId;
    }
    public void setDueno(String elDueno) 
    {
        dueno = elDueno;
    }
    public void setSaldo(double elSaldo)
    {
        saldo = elSaldo;
    }
    public void setCantidadTransacciones(int laCantidadTransacciones)
    {
        cantidadTransacciones = laCantidadTransacciones;
    }
}