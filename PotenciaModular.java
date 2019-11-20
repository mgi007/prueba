package programacionModular;

// MODIFIED BY mgi007

import java.util.Scanner;

public class PotenciaModular {
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
        int potencia = base;
        if (exponente == 0){
            exponente = 1;
        } else {
            for (int i = 1; i < exponente; i++) {
                potencia = potencia * base;
            }
        }
        return potencia;
    }
///////////////////////////////////////////////////////////
    public static void verResultado(int base, int exponente, int potencia){
        System.out.println(base + " ^ " + exponente + " = "+ potencia);
    }
}
