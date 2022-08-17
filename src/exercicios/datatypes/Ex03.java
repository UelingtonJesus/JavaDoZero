package exercicios.datatypes;

import java.util.Scanner;

//3. Escreva um programa Java que leia um inteiro entre 0
// e 1000 e some todos os dígitos do inteiro
public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inteiro: ");
        int num = scan.nextInt();
        int soma= 0;
        do{
            soma += (num%10);
            num = num/10;
        }while(num != 0);
        System.out.println(soma);
        scan.close();
    }
}
