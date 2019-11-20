package programacionModular;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

/*
public class Salario {
    public static void main(String[] args) {
        int tarifaOrdinaria = pedirTarifa();
        int numHoras = pedirNumHoras();
        int salarioBruto = calcularSalarioBruto(tarifaOrdinaria, numHoras);
        int salarioNeto = calcularSalarioNeto(salarioBruto);
        verResultado();
    }
//////////////////////////////////////////////////////////////////////////////////////
    public static int pedirTarifa(){
        Scanner entrada = new Scanner(System.in);
        int tarifaOrdinaria;
        do {
            tarifaOrdinaria = entrada.nextInt();
        } while (tarifaOrdinaria < 0);
        return tarifaOrdinaria;
    }
//////////////////////////////////////////////////////////////////////////////////////
    public static int pedirNumHoras(){
        Scanner entrada = new Scanner(System.in);
        int numHoras;
        do {
            numHoras = entrada.nextInt();
        } while (numHoras < 0);
        return numHoras;
    }
////////////////////////////////////////////////////////////////////////////////////
    public static int calcularSalarioBruto(int tarifaOrdinaria, int numHoras){
        int salarioBruto;
        if (numHoras <= 38){
            salarioBruto = numHoras * tarifaOrdinaria;
        } else {
            salarioBruto = (38 * tarifaOrdinaria) + ((3/2)  * (numHoras - 38));
        }
        return salarioBruto;
    }
/////////////////////////////////////////////////////////////////////////////////////
    public static int calcularSalarioNeto(int salarioBruto){
        int salarioNeto;
        if (salarioBruto <= 600){
            salarioNeto = salarioBruto;
        }
        else if (salarioBruto <= 1200){

        }
        else {

        }
        return salarioNeto;
    }
////////////////////////////////////////////////////////////////////////////////////
        public static void verResultado
}
*/