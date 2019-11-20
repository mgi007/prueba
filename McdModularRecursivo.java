package programacionModular;

import java.util.Scanner;

public class McdModularRecursivo {
    public static void main(String[] args) {
        int num1 = introducirNum();
        int num2 = introducirNum();
        int mcd = calcularMcd(num1, num2);
        verResultado(num1, num2, mcd);
    }
//////////////////////////////////////////////////////
    public static int introducirNum(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int num = entrada.nextInt();
        return  num;
    }
/////////////////////////////////////////////////////
    public static int calcularMcd(int num1, int num2){
        if (num1 == num2){
            return num1;
        } else if (num1 > num2){
            return calcularMcd(num1 - num2, num2);
        } else {
            return calcularMcd(num1, num2 - num1);
        }
    }
/////////////////////////////////////////////////////
    public static void verResultado(int num1, int num2, int mcd){
        System.out.println("El mcd de " + num1 + " y " + num2 + " es " + mcd + ".");
    }
}
