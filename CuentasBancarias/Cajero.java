
/**
 * Write a description of class Cajero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cajero
{
    // instance variables - replace the example below with your own
    private Cuenta miCuenta;
    private Interfaz interfaz;

    /**
     * Constructor for objects of class Cajero
     */
    public Cajero(Interfaz miInterfaz)
    {
        // initialise instance variables
        interfaz=miInterfaz;
        miCuenta=new Cuenta("115", "Pepe", 5000);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void realizarDeposito()
    {
        double monto = interfaz.pedirNumero("Digite el monto a depositar");
        
        boolean exito=miCuenta.depositar(monto);
        if (exito == true) {
            interfaz.decirMensaje("Depósito exitoso");
        }else{
            interfaz.decirMensaje("Depósito fallido");
        }
    }
    
    public void realizarRetiro()
    {
        double monto=interfaz.pedirNumero("Digite el monto a retirar");
        
        boolean exito=miCuenta.retirar(monto);
        if (exito == true) {
            interfaz.decirMensaje("Retiro exitoso");
        }else{
            interfaz.decirMensaje("Retiro fallido");
        }    
        
    }
}
