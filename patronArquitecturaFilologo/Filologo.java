public class Filologo
{
    private String silabaMagica;
    private Interfaz interfaz;

    public Filologo(String laSilaba, Interfaz laInterfaz)
    {
        silabaMagica = laSilaba;
        interfaz = laInterfaz;
    }

    public void encriptar()
    {
        String fraseUsuario;
        String fraseEncriptada;

        fraseUsuario = interfaz.pedirHilera("Escriba la frase que quiere encriptar");
        
        if ((fraseUsuario != null) && (fraseUsuario != "")) {
            fraseUsuario = " "+fraseUsuario;
            fraseEncriptada = fraseUsuario.replaceAll(" ", " "+silabaMagica);
        } else {
            fraseEncriptada = "ERROR: frase incorrecta para encriptar";
        }
        
        interfaz.decirMensaje(fraseEncriptada);
    }

    public void desencriptar()
    {
        String fraseUsuario;
        String fraseDesencriptada;

        fraseUsuario = interfaz.pedirHilera("Escriba la frase que quiere desencriptar");
        
        if ((fraseUsuario != null) && (fraseUsuario != "")) {
            fraseUsuario = " "+fraseUsuario;
            fraseDesencriptada = fraseUsuario.replaceAll(" "+silabaMagica, " ");
        } else {
            fraseDesencriptada = "ERROR: frase incorrecta para desencriptar";
        }
        
        interfaz.decirMensaje(fraseDesencriptada);
    }

}