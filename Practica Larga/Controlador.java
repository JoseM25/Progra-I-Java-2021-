import javax.swing.JOptionPane;
/**
 * Write a description of class Controlador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controlador
{
    // instance variables - replace the example below with your own
    private Practica practica1;
    private JOptionPane interfaz;

    /**
     * Constructor for objects of class Controlador
     */
    public Controlador()
    {
        // initialise instance variables
        practica1=new Practica();
        interfaz=new JOptionPane();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void iniciar()
    {
        boolean continuar=true;
        while (continuar==true){
            practica1.conseguirEdad();
            String seguir=interfaz.showInputDialog(null,"Desea seguir? Digite Si o No");
            if ((seguir).equalsIgnoreCase("Si")){
                continuar=true;  
            }else {
                continuar=false;
                interfaz.showMessageDialog(null,"Hasta Pronto");
            }
        }
    }

    public void iniciar2()
    {
        boolean continuar=true;
        while (continuar==true){
            int valorF=5000;
            String edad=interfaz.showInputDialog(null,"Edad: ");
            int edadFinal=Integer.parseInt(edad);
            String diaFinal=interfaz.showInputDialog(null,"dia: ");
            practica1.conseguirEntrada(valorF,edadFinal,diaFinal);
            String seguir=interfaz.showInputDialog(null,"Desea seguir? Digite Si o No");
            if ((seguir).equalsIgnoreCase("Si")){
                continuar=true;                
            } else {
                continuar=false;
                interfaz.showMessageDialog(null,"Hasta Pronto");
            }
        }
    }

    public void iniciar3()
    {
        boolean continuar=true;
        while (continuar==true){
            String salario=interfaz.showInputDialog(null,"Salario: ");
            double salarioFinal=Double.parseDouble(salario);
            String edad=interfaz.showInputDialog(null,"Edad: ");
            int edadFinal=Integer.parseInt(edad);
            String empleado=interfaz.showInputDialog(null,"Empleado?: ");
            practica1.averiguarCuota(salarioFinal,edadFinal,empleado);
            String seguir=interfaz.showInputDialog(null,"Desea seguir? Digite Si o No");
            if ((seguir).equalsIgnoreCase("Si")){
                continuar=true;                
            } else {
                continuar=false;
                interfaz.showMessageDialog(null,"Hasta Pronto");
            }
        }
    }

    public void iniciar4()
    {
        boolean continuar=true;
        while (continuar==true){
            String seguir=interfaz.showInputDialog(null,"1.Jugar 2.Salir");
            int numeroFinal=Integer.parseInt(seguir);
            if ((numeroFinal)==1){
                continuar=true;
                practica1.adivinarNumero(); 
            }else{
                continuar=false;
                interfaz.showMessageDialog(null,"Hasta Pronto");
            }
        }
    }
    
    public void iniciar5()
    {
        boolean continuar=true;
        String numeroUsuario=interfaz.showInputDialog(null,"Digite el numero base");
        String numeroUsuario2=interfaz.showInputDialog(null,"Digite el multiplo");
        int numeroFinal=Integer.parseInt(numeroUsuario);
        int numeroFinal2=Integer.parseInt(numeroUsuario2);
        while(continuar==true){
            boolean verdad=practica1.esMultiplo(numeroFinal,numeroFinal2);
            if(verdad==true){
                continuar=true;
                numeroUsuario2=interfaz.showInputDialog(null,"Correcto.Digite otro multiplo");
                numeroFinal2=Integer.parseInt(numeroUsuario2);
            }else{
                continuar=false;
                interfaz.showMessageDialog(null,"Perdiste,el numero digitado no es multiplo del base");
            }
        }
    }
    
    public void iniciar6()
    {
        String anoUsuario=interfaz.showInputDialog(null,"Digite el ano que desea saber si es bisiesto");
        int anoFinal=Integer.parseInt(anoUsuario);
        boolean respuesta=practica1.averiguarBisiesto(anoFinal);
        if(respuesta==true){
            interfaz.showMessageDialog(null,"Es bisiesto,y el dia del programador es el 12 de setiembre");
        }else{
            interfaz.showMessageDialog(null,"No es bisiesto,y el dia del programador es el 13 de setiembre");
        }
        
    }
    
    public static void main(String[] parametros){
        Controlador miControlador=new Controlador();
        miControlador.iniciar6();
    }
}   