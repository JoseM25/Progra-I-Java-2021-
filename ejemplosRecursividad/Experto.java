public class Experto
{
    private Interfaz interfaz;

    public Experto() {
        interfaz = new Interfaz();
    }

    public int calcularFactorial(int numero) {
        int resultado = 0;
        int resultadoParcial = 0;

        if (numero <= 1) {
            resultado = 1;
        }else{
            resultadoParcial = this.calcularFactorial(numero-1);
            resultado  = numero * resultadoParcial;
        }
        return resultado;
    }

    public int obtenerTerminoFibonacci(int posicion) {
        int termino = 0;
        int terminoAnterior = 0;
        int terminoTrasanterior = 0;

        if (posicion == 0) {
            termino = 0;
        }else{
            if (posicion == 1) {
                termino = 1;
            }else{
                terminoAnterior = this.obtenerTerminoFibonacci(posicion-1);
                terminoTrasanterior = this.obtenerTerminoFibonacci(posicion-2);
                termino = terminoAnterior + terminoTrasanterior;
            }
        }
        return termino;
    }
}