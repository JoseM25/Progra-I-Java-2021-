import javax.swing.JOptionPane;
/**
 * QUIZ
 * Esta clase mantiene el control de todo el programa del cajero automático
 * @author Maureen Murillo
 * @version 06/09/2021
 */

public class Controlador
{
    private Cuenta cuenta1;
    private Cuenta cuenta2;
    private JOptionPane interfaz;
    private String menu;

    /**
     * Método constructor que inicializa todos los atributos del objeto.
     */
    public Controlador() 
    {
        interfaz = new JOptionPane();
        interfaz.showMessageDialog(null, "¡BIENVENID@ AL BANCO DE  PROGRA1!");

        String nombre;
        nombre = interfaz.showInputDialog(null, "Escriba el nombre del dueño de la cuenta 1");
        String valorSaldo;
        valorSaldo = interfaz.showInputDialog(null, "¿Con cuál monto desea abrir la cuenta 1?");
        double saldoInicial;
        saldoInicial = Double.parseDouble(valorSaldo);

        cuenta1 = new Cuenta("C319", nombre, saldoInicial);

        nombre = interfaz.showInputDialog(null, "Escriba el nombre del dueño de la cuenta 2");
        valorSaldo = interfaz.showInputDialog(null, "¿Con cuál monto desea abrir la cuenta 2?");
        saldoInicial = Double.parseDouble(valorSaldo);

        cuenta2 = new Cuenta("C545", nombre, saldoInicial);

        menu = "Escoja una opción:\n1. Depositar\n2. Retirar\n3. Consultar saldo\n4. Mostrar créditos\n5. Salir";
    }

    /**
     * Método que despliega un menú y permite al usuario escoger y ejecutar la opción de su
     * preferencia.
     */
    public void iniciar()
    {
        String opcion="";

        opcion=interfaz.showInputDialog(null,menu);
        while(!opcion.equals("5")) {
            if (opcion.equals("1")){
                this.realizarDeposito();
            } else{
                if (opcion.equals("2")){
                    this.realizarRetiro();
                } else{
                    if(opcion.equals("3")){
                        this.realizarConsulta();
                    } else{
                        if (opcion.equals("4")){
                            this.mostrarCreditos();
                        } else{
                            if (opcion.equals("5")){
                                interfaz.showMessageDialog(null,"Gracias por usar nuestro banco"); 
                            } else{
                                interfaz.showMessageDialog(null,"Opcion Invalida");
                            }
                        }
                    }  
                }
            }
            opcion=interfaz.showInputDialog(null,menu);
        }
    }

    /**
     * Método que solicita información al usuario para consultar alguna cuenta bancaria.
     */
    private void realizarConsulta()
    {
        String laCuenta = interfaz.showInputDialog(null, "Escoja la cuenta a consultar (1 ó 2)");
        double saldoActual;

        if (laCuenta.equals("1")) {             // Note cómo se comparan dos hileras de texto
            saldoActual = cuenta1.getSaldo();
        }else{
            saldoActual = cuenta2.getSaldo();
        }

        interfaz.showMessageDialog(null, "El saldo de la cuenta es "+saldoActual);
    }

    /**
     * Método que solicita información al usuario para hacer un depósito en una cuenta.
     */
    private void realizarDeposito()
    {
        String valorMonto = interfaz.showInputDialog(null,"Digite el monto a depositar:");
        while ((valorMonto==null)||(valorMonto.equals(""))){
            interfaz.showMessageDialog(null,"Entrada Invalida.Vuela a intentarlo.");
            valorMonto=interfaz.showInputDialog(null,"Digite el monto a depositar:");
        }
        double monto = Double.parseDouble(valorMonto);
        String laCuenta = interfaz.showInputDialog(null,"¿En cuál cuenta desea realizar el depósito, la 1 ó la 2?");

        boolean exito;
        if (laCuenta.equalsIgnoreCase("1")) {
            exito = cuenta1.depositar(monto);
        }else{
            exito = cuenta2.depositar(monto);
        }

        if (exito == true) {
            interfaz.showMessageDialog(null, "Depósito exitoso");
        }else{
            interfaz.showMessageDialog(null, "Depósito fallido");
        }
    }

    /**
     * Método que solicita información al usuario para hacer un retiro de una cuenta.
     */
    private void realizarRetiro() 
    {
        String valorMonto=interfaz.showInputDialog(null,"Digite el monto que desea retirar: ");
        double monto=Double.parseDouble(valorMonto);
        String laCuenta=interfaz.showInputDialog(null,"¿En cuál cuenta desea realizar el retiro, 1 o 2?");
        boolean exito;

        if(laCuenta.equals("1")){
            exito=cuenta1.retirar(monto);
        } else{
            exito=cuenta2.retirar(monto);
        }

        if (exito==true) {
            interfaz.showMessageDialog(null,"Retiro exitoso");
        }else{
            interfaz.showMessageDialog(null,"Retiro fallido");
        }
    }

    /**
     * Método que muestra los créditos del programa.
     */
    private void mostrarCreditos()
    {
        interfaz.showMessageDialog(null,"Jose Antonio Mora \nC15114 \nMartes 7 de septiembre 2021");
    }

    // MÉTODOS GET Y SET PARA LOS ATRIBUTOS DE LAS CUENTAS
    public Cuenta getCuenta1() 
    {
        return cuenta1;
    }

    public Cuenta getCuenta2() 
    {
        return cuenta2;
    }

    public void setCuenta1(Cuenta unaCuenta)
    {
        cuenta1 = unaCuenta;
    }

    public void setCuenta2(Cuenta unaCuenta)
    {
        cuenta2 = unaCuenta;
    }

    /**
     * Método que permite iniciar el programa del cajero bancario.
     */
    public static void main(String[] parametros) {
        Controlador miControlador = new Controlador();
        miControlador.iniciar();
    }
}
