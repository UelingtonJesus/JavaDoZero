package exercicios.datatypes;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
2. Escreva um programa Java que leia um número em polegadas e o converta em metros
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Polegadas: ");
        double pol = scan.nextDouble();
        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(3);
        double metros = ((pol * 2.54)/100);
        System.out.println("Metros: "+frmt.format(metros)+"mt");
        scan.close();
    }
}
