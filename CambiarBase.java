package programacionModular;

// EDITADO BY MIGGUEL MAKUTOK

import com.sun.xml.internal.stream.Entity;

import java.util.Scanner;

public class CambiarBase {
    public static void main(String[] args) {
        int num = introducirNum();
        int base = introducirBase(num);
        calcularCambio(num, base);
    }
////////////////////////////////////////////////////////
    public static int introducirNum(){
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        return num;
    }
////////////////////////////////////////////////////////
    public static int introducirBase(int num){
        Scanner entrada = new Scanner(System.in);
        int base;
        do {
            System.out.println("Introducir la base a la que queremos pasar:");
            base = entrada.nextInt();
        } while(num < base);
        return base;
    }
/////////////////////////////////////////////////////////
        public static void calcularCambio(int num, int base){
            if(num < base)
                System.out.print(num + " ");
            else
            {
                calcularCambio(num / base,base);
                System.out.print(num % base + " ");
            }
        }
}
