package arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas: ");
        int quantNotas = scan.nextInt();
        double[] notas = new double[quantNotas];
        for (int i = 0; i < quantNotas; i++){
            System.out.println("Digite a nota "+(i+1)+": ");
            double nota = scan.nextDouble();
            notas[i] = nota;
        }

        double soma = 0;
        for (double nota :notas
             ) {
            soma+=nota;
        }

        System.out.printf("Média = %.2f", soma/notas.length);

        scan.close();

    }
}
