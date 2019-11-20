package programacionModular;

//////////////////////////////////////
// BLUGNESBLUG MANIGGGAAAAAAAAAAAAAA!
//////////////////////////////////////

import java.util.Scanner;

public class Fecha {
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        arrancarAplicacion();
    }
////////////////////////////////////////////////////////
    public static void arrancarAplicacion(){
        int anno = introducirAno();
        int mes = introducirMes();
        int dia = introducirDia(anno, mes);
        verFecha(dia, mes, anno);
    }
/////////////////////////////////////////////////////////
    public static int introducirAno() {
        Scanner entrada = new Scanner(System.in);
        boolean anoValido = false;
        int anno;
        do {
            System.out.println("Introduce un año:");
            anno = entrada.nextInt();
            if (anno >= 1582) {
                anoValido = true;
            } else {
                    System.out.println("ERROR, introduzca un año de 1582 en adelante.");
                    anoValido = false;
                }
        } while (anoValido == false);
        return anno;
    }
////////////////////////////////////////////////////////////////////////////
    public static int introducirMes(){
        System.out.println("Introduzca un mes:");
        Scanner entrada = new Scanner(System.in);
        int mes;
        boolean mesValido;
        do {
            mes = entrada.nextInt();
            if (mes > 0 && mes < 13){
                mesValido = true;
            } else {
                System.out.println("ERROR, introduzca un mes entre 1 y 12");
                mesValido = false;
                }
        } while (mesValido == false);
        return mes;
    }
//////////////////////////////////////////////////////////////////////////////
    public static int introducirDia(int ano, int mes){
        System.out.println("Introduzca un dia:");
        Scanner entrada = new Scanner(System.in);
        int dia = entrada.nextInt();
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                while (dia < 1 || dia > 30) {
                    System.out.println("ERROR,introduzca un dia entre 1 y 30:");
                    dia = entrada.nextInt();
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                while (dia < 1 || dia > 31) {
                    System.out.println("ERROR,introduzca un dia entre 1 y 31:");
                    dia = entrada.nextInt();
                }
                break;
            case 2:
                if (esBisiesto(ano) == true) {
                    do {
                        System.out.println("Introduzca un dia entre 1 y 29:");
                        dia = entrada.nextInt();
                    } while (dia < 1 || dia > 29);
                } else {
                    do {
                        System.out.println("Introduzca un dia entre 1 y 28:");
                        dia = entrada.nextInt();
                    } while (dia < 1 || dia > 28);
                }
        }
        return dia;
    }
///////////////////////////////////////////////////////////////////////////////////////////
    public static boolean esBisiesto(int anno){
        boolean bisiesto;
        if ((anno %4 ==0)&&(anno %100!=0)||(anno %400==0)){
            bisiesto = true;
        } else {
            bisiesto = false;
        }
        return bisiesto;
    }
//////////////////////////////////////////////////////////////////////////////////////////
    public static void verFecha(int dia, int mes, int anno){
        System.out.println("Ha introducido la fecha:\t" + dia + "/" + mes + "/" + anno);
    }
}
