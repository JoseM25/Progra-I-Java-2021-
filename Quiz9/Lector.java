import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 * Ejemplo de lectura y escritura de archivos de texto
 * @author Prof.Maureen Murillo
 * @version 2021
 */
public class Lector {
    private JOptionPane interfaz;
    private File archivo;
    private final String NOMBRE_ARCHIVO = "datos.txt";

    public Lector() {
        interfaz = new JOptionPane();
        archivo = null;
    }

    public void iniciar() {
        archivo = new File(NOMBRE_ARCHIVO);
        if (archivo.exists()) {
            String[] opciones = {"Ver contenido de archivo", "Ver palabras y números de archivo", "Escribir nuevo contenido en archivo", "Salir"};
            String opcion;
            do {
                opcion = (String) interfaz.showInputDialog(null,"¿Qué desea hacer?", "Prueba de archivos", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                if (opcion.equals(opciones[0])) {
                    this.leerFrases();
                }else {
                    if (opcion.equals(opciones[1])) {
                        this.leerPedazos();
                    }else{
                        if (opcion.equals(opciones[2])) {
                            this.escribirFrases();
                        }
                    }
                }
            }while (!opcion.equals(opciones[3]));
        }else{
            interfaz.showMessageDialog(null, "El archivo NO existe");
        }
    }

    public void escribirFrases() {
        // Guarda información en el archivo
        FileWriter escritor = null;
        try{
            escritor = new FileWriter(archivo);

            String linea = JOptionPane.showInputDialog(null,"Escriba una frase (deje vacío para terminar)");
            while ((linea != null) && (!linea.equals(""))) {
                escritor.write(linea+"\n");
                linea = JOptionPane.showInputDialog(null,"Escriba una frase (deje vacío para terminar)");
            }

            escritor.close();
        }catch(IOException error) {
            System.out.println("Error en la escritura del archivo");
        }
    }

    public String leerFrases() {
        // Lee información del archivo
        BufferedReader lector;
        String textoCompleto = "";
        try {
            lector = new BufferedReader(new FileReader(archivo));
            String linea = lector.readLine();
            while(linea != null) {
                textoCompleto += linea+"\n";
                linea = lector.readLine();
            }
            lector.close();
        }catch(IOException error) {
            System.out.println("Error en la lectura del archivo");
        }  
        return textoCompleto;
    }
    
    /**
     * Lee cada palabra del archivo, identificando si es un entero o en caso
     * contrario lo asume como texto.
     */
    public void leerPedazos() {
        Scanner lector;
        try {
            lector = new Scanner(archivo);
            
            String textoCompleto = "";
            int entero;
            String texto;
            while ((lector.hasNextInt()) || (lector.hasNext())) {
                if (lector.hasNextInt()) {
                    entero = lector.nextInt();
                    textoCompleto += entero + ", entero.\n";
                }else{
                    texto = lector.next();
                    textoCompleto += texto + ", texto.\n";
                }
            }

            lector.close();
            interfaz.showMessageDialog(null, "El archivo contiene por palabras:\n\n"+textoCompleto);
        }catch(IOException error) {
            System.out.println("Error en la lectura del archivo");
        }
    }

    public static void main(String[] args) {
        Lector lector = new Lector();
        lector.iniciar();
    }
}
