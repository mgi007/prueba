package programacionModular;

import java.util.Scanner;

public class FactorialModularRecursivo {
    public static void main(String[] args) {
        int num = introducirNum();
        int factorial = calcularFactorial(num);
        verResultado(num, factorial);
    }
    //////////////////////////////////////////////////////
    public static int introducirNum(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int num = entrada.nextInt();
        return num;
    }
    /////////////////////////////////////////////////////////////////////////
    public static int calcularFactorial(int num){
        int factorial = 1;
        if (num != 0){
            return num * calcularFactorial(num-1);
            } else {
            return 1;
        }
    }
    ////////////////////////////////////////////////////////////////////////
    public static void verResultado(int num, int factorial){
        System.out.println(num + "! = " + factorial);
    }
}

