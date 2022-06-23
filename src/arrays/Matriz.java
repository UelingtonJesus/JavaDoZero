package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos alunos: ");
        int quantAlunos = scan.nextInt();
        System.out.println("Quantidade de  notas por aluno: ");
        int quantNotas = scan.nextInt();

        double [] [] notasDaTurma = new double[quantAlunos][quantNotas];

        double total = 0;
        for(int i = 0; i < notasDaTurma.length;i++){
            for (int j=0;j<notasDaTurma[i].length;j++){
                System.out.printf("Informe a nota %d do aluno %d: ", j+1,i+1);
                notasDaTurma[i][j]= scan.nextDouble();
                total += notasDaTurma[i][j];
            }
        }

        double media = total / (quantAlunos*quantNotas);
        System.out.println("A média da turma é "+media);

        for (double[] notasDoAluno:notasDaTurma
             ) {
            System.out.println(Arrays.toString(notasDoAluno));
        }


        scan.close();
    }
}
