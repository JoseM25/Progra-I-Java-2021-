public class Experto
{
    private Interfaz interfaz;

    public Experto() {
        interfaz = new Interfaz();
    }
   
    public int calcularMayor(int lista[],int posInicial){
        int arrLength=lista.length;
        int mayor=0;
        if(posInicial==arrLength) {
            mayor=lista[posInicial-1];
        }else{
            int primero=lista[posInicial];
            int mayorResto=this.calcularMayor(lista,posInicial+1);
            if(primero>mayorResto){
                mayor=primero;
            }else{
                mayor=mayorResto;
            }
        }
        return mayor;
    }
}