import java.util.Random;

/**
 * Write a description of class Agenda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Agenda
{
    // instance variables - replace the example below with your own
    private Contacto nuevoContacto;
    private Interfaz interfaz;
    private Contacto[] agenda;
    private Random generador;

    /**
     * Constructor for objects of class Agenda
     */
    public Agenda()
    {
        agenda=new Contacto[5];
        generador=new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void insertarContacto()
    {
        int indice=0;
        boolean continuar=true;
        while(continuar==true){ 
            if (agenda[indice]==null){
                nuevoContacto=new Contacto();
                agenda[indice]=nuevoContacto; 
                continuar=false;
            }else{
                indice++;
            }
        }
    }

    public void buscarContacto()
    {
        String nombre=interfaz.showInputDialog(null,"Digite el nombbre del contacto que busca");
        boolean continuar=true;
        int indice=0;
        while(continuar==true && indice<agenda.length){
            String contacto=agenda[indice].getNombre();
            if (nombre.equalsIgnoreCase(contacto)){
                interfaz.showMessageDialog(null,agenda[indice].getNombre()+"\n"+agenda[indice].getTelefono());
                continuar=false;
            }else if((nombre)!=(contacto)){
                indice++;
            }
        }

        if(indice>=agenda.length){
            interfaz.showMessageDialog(null,nombre+" no se encuentra en la agenda");
        }
    }

    public String toString()
    {
        String listaAgenda="";
        boolean continuar=true;
        int indice=0;
        while (indice<agenda.length){
            listaAgenda=listaAgenda+agenda[indice].getNombre()+" "+agenda[indice].getTelefono()+"\n";
            indice++;
        }
        interfaz.showMessageDialog(null,listaAgenda);
        return listaAgenda;
    }

    public void intercambiarDosContactos()
    {
        String contacto1=interfaz.showInputDialog(null,"digite la posicion del contacto que desea cambiar de posicion");
        String contacto2=interfaz.showInputDialog(null,"digite la posicion del contacto que desea cambiar de posicion");
        int contacto1Final=Integer.parseInt(contacto1);
        int contacto2Final=Integer.parseInt(contacto2);
        Contacto intercambio=agenda[contacto1Final];
        agenda[contacto1Final]=agenda[contacto2Final];
        agenda[contacto2Final]=intercambio;
    }

    public void desordenarAgenda()
    {
        int random1=generador.nextInt(10);
        int random2=generador.nextInt(10);
        int indice=0;
        while (indice<agenda.length){
            random1=generador.nextInt(3);
            random2=generador.nextInt(3);
            Contacto intercambio=agenda[random1];
            agenda[random1]=agenda[random2];
            agenda[random2]=intercambio;
            indice++;
        }
    }

    public void ordenarSeleccion()
    {
        int indice=0;
        int indice2=1;
        int indiceAgenda=0;
        int indiceAgenda2=0;
        Contacto numeroMenor=agenda[indice];
        Contacto numeroMenorInicial=numeroMenor;
        String menor=numeroMenor.getTelefono();
        int menorFinal=Integer.parseInt(menor);
        boolean continuar=true;
        while (indice<(agenda.length)-1){

            while (indice2<agenda.length){
                Contacto numeroSiguiente=agenda[indice2];
                String numeroTel=numeroSiguiente.getTelefono();
                int telFinal=Integer.parseInt(numeroTel);
                if(menorFinal<telFinal){
                    indice2++;
                }else if(menorFinal>telFinal){
                    numeroMenor=numeroSiguiente;
                    menorFinal=telFinal;
                    indiceAgenda2=indice2;
                    indice2++;
                }else if(menorFinal==telFinal){
                    indice2++;
                }
            }

            agenda[indiceAgenda]=numeroMenor;
            agenda[indiceAgenda2]=numeroMenorInicial;

            indice++;
            if (indice<agenda.length){
                numeroMenor=agenda[indice];
                numeroMenorInicial=numeroMenor;
                menor=numeroMenor.getTelefono();
                menorFinal=Integer.parseInt(menor);
                indice2=indice+1;
                indiceAgenda++;
            } 
        }
    }

    public void ordenarBurbuja()
    {

    }
}