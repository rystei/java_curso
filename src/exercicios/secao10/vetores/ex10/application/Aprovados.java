package exercicios.secao10.vetores.ex10.application;

import exercicios.secao10.vetores.ex10.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Aluno[] alunos = new Aluno[quantidade];

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
            String nome = scanner.nextLine();
            double primeiraNota = scanner.nextDouble();
            double segundaNota = scanner.nextDouble();
            scanner.nextLine();

            alunos[i] = new Aluno(nome, primeiraNota, segundaNota);
        }
        
        double media;

        System.out.println("Alunos aprovados");

        for (int i = 0; i < alunos.length; i++) {
            media = (alunos[i].getPrimeiraNota() + alunos[i].getSegundaNota()) / 2;

            if (media >= 6.0) {
                System.out.printf("%s\n", alunos[i].getNome());
            }
        }

        scanner.close();
    }
}
