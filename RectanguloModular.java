package programacionModular;

import java.util.Scanner;

public class RectanguloModular {
    public static void main(String[] args) {
        System.out.println("Introduzca la altura:");
        int altura = pedirNumero();
        System.out.println("Introduzca la base:");
        int base = pedirNumero();
        double perimetro = calcularPerimetro(base, altura);
        double area = calcularArea(base, altura);
        verResultado(base, altura, perimetro, area);
    }

    ///////////////////////////////////////////////////////
    public  static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        entrada = new Scanner (System.in);
        int numero = entrada.nextInt();
        return numero;
    }
    ///////////////////////////////////////////////////////
    public static double calcularPerimetro(int base, int altura) {
        return (base * 2) + (altura * 2);
    }
    ///////////////////////////////////////////////////////
    public static double calcularArea(int base, int altura) {
        return base * altura;
    }
    ///////////////////////////////////////////////////////
    public static void verResultado(int base, int altura, double perimetro, double area) {
        System.out.println("Perímetro = " + perimetro);
        System.out.println("Área = " + area);
    }
}
