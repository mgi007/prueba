package programacionModular;

import java.util.Scanner;

public class PotenciaModularRecursiva {
    public static void main(String[] args) {
        System.out.println("Introduzca la base:");
        int base = pedirNum();
        System.out.println("Introduzca el exponente:");
        int exponente = pedirNum();
        int potencia = calcularPotencia(base, exponente);
        verResultado(base, exponente, potencia);
    }
    ////////////////////////////////////////////////////////////
    public static int pedirNum(){
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        return num;
    }
    ////////////////////////////////////////////////////////////
    public static int calcularPotencia(int base, int exponente){
        if (exponente == 0){
            return 1;
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }
    ///////////////////////////////////////////////////////////
    public static void verResultado(int base, int exponente, int potencia){
        System.out.println(base + " ^ " + exponente + " = "+ potencia);
    }
}
