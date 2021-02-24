/**
 * Escribir un programa que permita determinar
 * si un número entero es primo o no.
 */

import java.util.Scanner;

public class T1Ej4 {
    public static boolean esPrimo(int entero){
        for (int i=2; i<entero; i++){
            if (entero % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = entrada.nextInt();
        System.out.println(esPrimo(numero));
    }
    
}
