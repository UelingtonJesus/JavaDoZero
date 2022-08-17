package exercicios.datatypes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {
    /*

   1. Escreva um programa Java para converter a temperatura de Fahrenheit para graus Celsius

            */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Fahrenheit: ");
        double fahr = scan.nextDouble();
        double celcius = ((fahr - 32)/1.8);
        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(1);
        System.out.println("Celsius: "+frmt.format(celcius)+"º");
        scan.close();
    }
}
