import javax.swing.JOptionPane;
import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class Edad here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Practica
{
    // instance variables - replace the example below with your own
    private JOptionPane interfaz;
    private Random generador;
    private ArrayList<String> notas;

    /**
     * Constructor for objects of class Edad
     */
    public Practica()
    {
        // initialise instance variables
        interfaz=new JOptionPane();
        generador=new Random();
        notas=new ArrayList<String>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void conseguirEdad()
    {
        // put your code here
        String edad=interfaz.showInputDialog(null,"Introduzca su edad");
        int edadNumeral=Integer.parseInt(edad);

        int adulto=18;
        int adultoMayor=65;
        if ((edadNumeral)<(adulto)){
            interfaz.showMessageDialog(null,"Es menor de edad");
        } else if((edadNumeral)>=(adulto) && (edadNumeral)<(adultoMayor)){
            interfaz.showMessageDialog(null,"Es adulto");
        } else{
            interfaz.showMessageDialog(null,"Es adulto mayor");
        }
    }

    public int conseguirEntrada(int valor,int edad, String dia)
    {
        int nino=12;
        int adultoMayor=65;
        String diaDescuento="Miercoles";
        if ((edad)<=(nino) || (edad)>=(adultoMayor)){
            valor=(valor/2);
        } else if ((dia).equalsIgnoreCase(diaDescuento)){ 
            valor=(valor/2);
        }
        return valor;
    }

    public boolean averiguarBisiesto(int anoRecibido)
    {
        boolean Bisiesto=false;
        if ((anoRecibido)%4==0 && (anoRecibido)%100!=0){
            Bisiesto=true;
        } else if((anoRecibido)%400==0){
            Bisiesto=true;
        } else{
            Bisiesto=false;
        }
        return Bisiesto;
    }

    public void averiguarCuota(double salario, int edad, String empleado)
    {
        int salario1=10000;
        int salario2=20000;
        if ((empleado).equalsIgnoreCase("Si") && (salario)<(salario1)){
            interfaz.showMessageDialog(null, "Su cuota es de 500");
        } else if ((empleado).equalsIgnoreCase("Si") && ((salario)>(salario1))&&(salario)<(salario2)){
            double salarioFinal=salario*0.01;
            interfaz.showMessageDialog(null, "Su cuota es de: "+salarioFinal);
        } else if ((empleado).equalsIgnoreCase("Si") && ((salario)>(salario2))){
            double salarioDefinitivo=(salario-salario2)*0.02;
            interfaz.showMessageDialog(null,"Su cuota es de 200 + " + salarioDefinitivo);   
        } else if ((empleado).equalsIgnoreCase("No") && (edad<=18)){
            interfaz.showMessageDialog(null,"No debe cuota");
        } else if ((empleado).equalsIgnoreCase("No") && (edad>=18)){
            interfaz.showMessageDialog(null,"Su cuota es de 200");
        }
    }

    public void adivinarNumero(){
        boolean continuar=true;
        int contador=2;
        int numeroOculto=generador.nextInt(10)+1;
        interfaz.showMessageDialog(null,"Adivine el numero escondido de 1 a 10");
        String numeroAdivinado=interfaz.showInputDialog(null,"Adivinador. Intentos restantes: "+contador);
        int numeroFinal=Integer.parseInt(numeroAdivinado);
        while (continuar==true){
            if ((numeroFinal)==(numeroOculto)){
                interfaz.showMessageDialog(null,"Felicidades, ha adivinado");
                continuar=false;
            }else if ((contador==0 && (numeroFinal)!=(numeroOculto))){
                continuar=false;
            }else if (((numeroFinal)!=(numeroOculto))){
                contador=contador-1;
                interfaz.showMessageDialog(null,"Equivocado");
                numeroAdivinado=interfaz.showInputDialog("Adivinador. Intentos Restantes: "+contador);
                numeroFinal=Integer.parseInt(numeroAdivinado);
            }
        }

        if ((contador==0 && (numeroFinal)!=(numeroOculto))){
            interfaz.showMessageDialog(null,"Perdiste. El numero era: "+numeroOculto);
        }
    }

    public void recomendarActividad(){
        int respuestaUsuario;
        boolean esSemanaUniversitaria;

        respuestaUsuario=interfaz.showConfirmDialog(null,"Estamos en semana U?", "",0);
        if(respuestaUsuario==0){
            esSemanaUniversitaria=true;
        }else{
            esSemanaUniversitaria=false; 
        }

        if (esSemanaUniversitaria==true){
            interfaz.showMessageDialog(null,"Dese una vuelta por el concierto!");
        } else{
            interfaz.showMessageDialog(null,"Le recomendamos hacer las tareas");
        }
    }

    public void averiguarApellidoGanador(){
        String apellidoGanador="COTO";
        String apellido=interfaz.showInputDialog(null,"Escriba su apellido");
        apellido=apellido.toUpperCase();

        if((apellido).equals(apellidoGanador)){
            interfaz.showMessageDialog(null,"Felicidades!");
        }else{
            interfaz.showMessageDialog(null,"Tal vez la proxima semana!");
        }
    }

    public void averiguarFactorial(){
        String numeroUsuario=interfaz.showInputDialog(null,"Digite el numero positivo que desea saber su sumatoria y factorial");
        while((numeroUsuario==null)||(numeroUsuario.equals(""))){
            interfaz.showMessageDialog(null,"Entrada Invalida. Vuelva a intentarlo");
            numeroUsuario=interfaz.showInputDialog(null,"Digite el numero positivo que desea saber su sumatoria y factorial");
        }
        int numeroFinalSumatoria=Integer.parseInt(numeroUsuario);
        int numeroFinalFactorizacion=numeroFinalSumatoria;
        int numeroContador=numeroFinalSumatoria;
        int numeroMenor=numeroFinalSumatoria;
        int numeroMenor2=numeroFinalSumatoria;
        for(int contador=1;contador<numeroContador;contador++){
            numeroFinalSumatoria=numeroFinalSumatoria+(numeroMenor-1);
            numeroMenor=numeroMenor-1;
        }

        for(int contador2=1;contador2<numeroContador;contador2++){
            numeroFinalFactorizacion=numeroFinalFactorizacion*((numeroMenor2)-1);
            numeroMenor2=(numeroMenor2)-1;
        }
        interfaz.showMessageDialog(null,"La sumatoria de 1 hasta el numero es: "+(numeroFinalSumatoria));
        interfaz.showMessageDialog(null,"La factorizacion del numero es: "+numeroFinalFactorizacion);
    }

    public void mostrarFigura(){
        String respuestaFigura=interfaz.showInputDialog(null,"Seleccione la figura que desea dibujar: 1.cuadrado 2.rectangulo 3.triangulo isosceles");
        String respuestaRelleno=interfaz.showInputDialog(null,"Seleccione si la desea rellena o no: 1.Rellena 2.Vacia");
        String asterisco="*";
        if ((respuestaFigura).equals("1") && (respuestaRelleno).equals("1")){
            String usuarioLargo=interfaz.showInputDialog(null,"indique el largo y ancho de la figura: ");
            int numeroLargo=Integer.parseInt(usuarioLargo);
            String cuadrado=" ";
            String espacio="\n";
            for(int contador=1;contador<=numeroLargo;contador++) {
                cuadrado=cuadrado+espacio;
                for(int contador2=1;contador2<=numeroLargo;contador2++){
                    cuadrado=cuadrado+asterisco+" ";
                }
            }
            interfaz.showMessageDialog(null, cuadrado);
        } else if (((respuestaFigura).equals("1"))&& (respuestaRelleno).equals("2")){
            String usuarioLargo=interfaz.showInputDialog(null,"indique el largo y ancho de la figura: ");
            int numeroLargo=Integer.parseInt(usuarioLargo);
            String cuadrado="";
            String espacio=" ";
            for(int contador=1;contador<=numeroLargo;contador++) {
                cuadrado=cuadrado+espacio;
                for(int contador2=1;contador2<=numeroLargo;contador2++){
                    cuadrado=cuadrado+asterisco+" ";
                }
            }

            for(int contador=0;contador<numeroLargo-2;contador++) {
                cuadrado=cuadrado+asterisco;
                for(int contador2=0;contador2<=numeroLargo-2;contador2++){
                    cuadrado=cuadrado+espacio;
                }
                cuadrado=cuadrado+asterisco;
                cuadrado=cuadrado+"\n";
            }

            for(int contador=1;contador<=numeroLargo;contador++) {
                cuadrado=cuadrado+espacio;
                for(int contador2=1;contador2<=numeroLargo;contador2++){
                    cuadrado=cuadrado+asterisco+" ";
                }
            }
            interfaz.showMessageDialog(null, cuadrado);
        } else if(((respuestaFigura).equals("2"))&& (respuestaRelleno).equals("1")){
            String usuarioLargo=interfaz.showInputDialog(null,"indique el largo de la figura: ");
            int numeroLargo=Integer.parseInt(usuarioLargo);
            String usuarioAncho=interfaz.showInputDialog(null,"indique el ancho de la figura: ");
            int numeroAncho=Integer.parseInt(usuarioAncho);
            String rectangulo=" ";
            String espacio="\n";
            for(int contador=1;contador<=numeroLargo;contador++){
                rectangulo=rectangulo+espacio;
                for (int contador2=1;contador2<=numeroAncho;contador2++){
                    rectangulo=rectangulo+asterisco+" ";
                }
            }
            interfaz.showMessageDialog(null,rectangulo);
        } else if(((respuestaFigura).equals("2"))&& (respuestaRelleno).equals("2")){ 

        } else if(((respuestaFigura).equals("3"))&& (respuestaRelleno).equals("1")){
            String usuarioLargo=interfaz.showInputDialog(null,"indique la altura de la figura: ");
            int numeroAltura=Integer.parseInt(usuarioLargo);
            String triangulo=" ";
            String espacio="\n";

            for (int contador=1;contador<=numeroAltura;contador++){
                triangulo=triangulo+espacio;
                for (int contador2=1;contador2<=((contador*2)/2);contador2++){
                    triangulo=triangulo+asterisco+" ";
                }
            }
            interfaz.showMessageDialog(null,triangulo);
        } else if(((respuestaFigura).equals("3"))&& (respuestaRelleno).equals("2")){

        }
    }

    public void averiguarPalindromo(String palabra1, String palabra2, String palabra3){
        String palabraUsuario=interfaz.showInputDialog(null, "digite la frase que desea saber si es palindromo");
        palabraUsuario=palabraUsuario.toLowerCase();
        boolean continuar=true;
        int contador=0;
        int limite=palabraUsuario.length();
        limite=limite-1;
        String espacioS=" ";
        char espacio=espacioS.charAt(0);

        while (continuar==true && contador<limite){
            if(palabraUsuario.charAt(limite)==(espacio)){
                continuar=true;
                limite--;
            }else if(palabraUsuario.charAt(contador)==(espacio)){
                continuar=true;
                contador++;                
            }else if((palabraUsuario.charAt(contador))==(palabraUsuario.charAt(limite))){
                continuar=true;
                contador++;
                limite--;
            }else if ((palabraUsuario.charAt(contador))!=(palabraUsuario.charAt(limite))){
                continuar=false;
            }
        }

        if(continuar==true){
            interfaz.showMessageDialog(null,"Es palindromo");
        }else{
            interfaz.showMessageDialog(null,"NO es palindromo");
        }
    }

    public boolean esMultiplo(int factor1, int factor2){
        boolean factores=true;
        if((factor2)%(factor1)==0){
            factores=true;
        } else{
            factores=false;
        }
        return factores;
    }

    public void esPrimo(){
        String numeroUsuario=interfaz.showInputDialog(null,"Digite el numero que desea saber si es primo o no");
        int numeroFinal=Integer.parseInt(numeroUsuario);
        boolean continuar=true;
        int contador=2;
        while((continuar==true) && contador<numeroFinal){
            if (numeroFinal%contador==0){
                interfaz.showMessageDialog(null,"No es primo");
                continuar=false;

            }else{
                continuar=true;
                contador++;
            }
        }

        if ((continuar)==true){
            interfaz.showMessageDialog(null,"Es primo"); 
        }
    }

    public void averiguarPesoIdeal(){
        String alturaUsuario=interfaz.showInputDialog(null,"Digite su estatura en centimetros");
        double alturaFinal=Double.parseDouble(alturaUsuario);
        while(alturaFinal<140 || alturaFinal>230){
            interfaz.showMessageDialog(null,"Error. Este programa solo funciona con alturas entre 140cm y 230cm");
            alturaUsuario=interfaz.showInputDialog(null,"Digite su estatura en centimetros");
            alturaFinal=Integer.parseInt(alturaUsuario);
        }
        String pesoUsuario=interfaz.showInputDialog(null,"Digite su peso en kilogramos");
        double pesoFinal=Double.parseDouble(pesoUsuario);
        String edadUsuario=interfaz.showInputDialog(null,"Digite su edad");
        int edadFinal=Integer.parseInt(edadUsuario);
        double pesoRecomendado=(alturaFinal-100+edadFinal%10)*0.90;

        if((pesoRecomendado<(pesoFinal)) && (pesoFinal-pesoRecomendado)>10){
            interfaz.showMessageDialog(null,"Podria tener sobrepeso importante. Pongase en contacto con su medico");
        }else if((pesoRecomendado>(pesoFinal)) &&(pesoRecomendado-pesoFinal)>10){
            interfaz.showMessageDialog(null,"Se enceuntra en un peso bajo, pongase en contacto con su medico");
        }else{
            interfaz.showMessageDialog(null,"Se encuentra en un peso saludable");
        }
    }

    public void averiguarCantidadMayusculas(){
        String palabraUsuario=interfaz.showInputDialog(null,"Digite la frase que desea contar sus mayusculas");
        int largo=palabraUsuario.length();
        largo=largo-1;
        int contadorMayusculas=0;
        int contadorMinusculas=0;
        for(int contador=0;contador<=largo;contador++){
            char caracter=palabraUsuario.charAt(contador);
            boolean respuesta=Character.isUpperCase(caracter);
            if(respuesta==true){
                contadorMayusculas++;
            }
            else{
                contadorMinusculas++;
            }
        }
        interfaz.showMessageDialog(null,"Hay en total "+contadorMayusculas+" maysuculas en la frase");
    }

    public void averiguarNumeroPerfecto(){
        String numeroUsuario=interfaz.showInputDialog(null,"Digite el numero que desea saber si es perfecto(mayor a 1)");
        int numeroFinal=Integer.parseInt(numeroUsuario);
        int contador=1;
        boolean perfecto=false;
        String multiplos="";
        int multiplosNumero=0;
        while (contador<numeroFinal){
            if (numeroFinal%contador==0){
                multiplosNumero=multiplosNumero+contador;
                multiplos=multiplos+Integer.toString(contador)+", ";
                contador++;
            }else{
                contador++;
            }
        }

        if(multiplosNumero==numeroFinal){
            perfecto=true;
        }else{
            perfecto=false;
        }

        if (perfecto==false){
            interfaz.showMessageDialog(null,"No es un numero perfecto. Sus multiplos son: "+multiplos);
        }else{
            interfaz.showMessageDialog(null,"Es perfecto, ya que sus multiplos son: "+multiplos);
        }
    }

    public void averiguarCantidadPerfectos(){
        String numeroUsuario=interfaz.showInputDialog(null, "Digite el limite superior para la lista de numeros perfectos desde 6 hasta el numero dado");
        int numeroFinal=Integer.parseInt(numeroUsuario);
        String multiplos="";
        int contadorNumeros=6;
        String numerosPerfectos="";
        while(contadorNumeros<=numeroFinal){
            int contador=1;
            int multiplosNumero=0;
            while(contador<contadorNumeros){
                if(contadorNumeros%contador==0){
                    multiplosNumero=multiplosNumero+contador;
                    contador++;
                }else{
                    contador++;
                }
            }

            if(multiplosNumero==contadorNumeros){
                numerosPerfectos=numerosPerfectos+Integer.toString(contadorNumeros)+", ";
            } 
            contadorNumeros++;
        }
        interfaz.showMessageDialog(null,"Los numeros perfectos desde 6 hasta "+numeroFinal+" son: "+numerosPerfectos);
    }

    public void calcularNotas(){
        notas.clear();
        boolean continuar=true; 
        while(continuar==true){
            String notasUsuario=interfaz.showInputDialog(null,"Digite una nota");
            notas.add(notasUsuario);
            String respuesta=interfaz.showInputDialog(null,"Desea incluir otra nota? Si o No");
            if(respuesta.equalsIgnoreCase("Si")){
                continuar=true;
            }else{
                continuar=false;
            }
        }
        int contador=0;
        int tamano=notas.size();
        String nota1=notas.get(contador);
        double notaMenor=Double.parseDouble(nota1);
        while(contador<tamano){
            String nota2=notas.get(contador);
            double numero2=Double.parseDouble(nota2);
            if (notaMenor<numero2){
                contador++;

            }else{
                notaMenor=numero2;
                contador++;
            }
        }
        
        int contadorMayor=0;
        int tamanoMayor=notas.size();
        String nota1Mayor=notas.get(contadorMayor);
        double notaMayor=Double.parseDouble(nota1);
        while(contadorMayor<tamanoMayor){
            String nota2=notas.get(contadorMayor);
            double numero2=Double.parseDouble(nota2);
            if (notaMayor>numero2){
                contadorMayor++;

            }else{
                notaMayor=numero2;
                contadorMayor++;
            }
        }
        double promedio=0;
        int tamanoPromedio=notas.size();
        int contadorPromedio=0;
        while(contadorPromedio<tamanoPromedio){
            String notaPromedio=notas.get(contadorPromedio);
            double notaPromedio2=Double.parseDouble(notaPromedio);
            promedio=promedio+notaPromedio2;
            contadorPromedio++;
        }
        promedio=promedio/tamanoPromedio;
        
        interfaz.showMessageDialog(null,"La nota menor es: "+notaMenor+"\n"+"La nota mayor es: "+notaMayor+"\n"+"El promedio es de: "+promedio);
        
    }
}

