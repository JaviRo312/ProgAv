import java.util.*;

/*  Calcula cuántos primos hay hasta 10.000.000 y muestra el tiempo
    que tarda en calcularlo.
*/

public class cuantosPrimos0 {
    public static void main(String[] args) {
        long t0 = (new Date()).getTime(); //t0=instante de inicio de los cálculos
        Primos p = new Primos(1,10000000);
        p.calcular();
        int n = p.cuantos();
        long t1 = (new Date()).getTime(); //t1=instante de final de los cálculos
        System.out.println("Número de primos menores que 10.000.000: "+ n +" calculado en "+ (t1-t0) +" miliseg.");
    }
}
