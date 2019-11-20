package programacionModular;

// MODIFIED BY mgi007

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Combinaciones {
    public static void main(String[] args) {
        System.out.println("Introduzca m:");
        int m = pedirNum();
        System.out.println("Introduzca n:");
        int n = pedirNum();
        int mFactorial = calcularFactorial(m);
        int nFactorial = calcularFactorial(n);
        int mMenosNFactorial = calcularFactorial(m - n);
        int combinaciones = calcularCombinaciones(nFactorial, mFactorial, mMenosNFactorial);
        verResultado(m, n, combinaciones);


    }
////////////////////////////////////////////////////
    public static int pedirNum(){
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        return num;
    }
///////////////////////////////////////////////////
    public static int calcularFactorial(int numero){
        int factorial = 1;
        if (numero == 0){
            factorial = 1;
        } else {
            for (int i = numero; i > 0; i--){
                factorial = factorial * i;
            }
        }
        return factorial;
    }
///////////////////////////////////////////////////
    public static int calcularCombinaciones(int nFactorial, int mFactorial, int nMenosmFactorial){
        return mFactorial / (nMenosmFactorial * nFactorial);
    }
///////////////////////////////////////////////////
    public static void verResultado (int m, int n, int probabilidad){
        System.out.println("Hay " + probabilidad + " combinaciones posibles para "+ m + " elementos tomados" +
                " de " + n + " en " + n);
    }

}
