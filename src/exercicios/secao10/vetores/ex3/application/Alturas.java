package exercicios.secao10.vetores.ex3.application;

import exercicios.secao10.vetores.ex3.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    public static void main(String[] args) {

        /*
        Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver.
         */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int quantidade = scanner.nextInt();
        Pessoa[] vetor = new Pessoa[quantidade];

        double alturaMedia = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            scanner.nextLine();
            System.out.print("Dados da " + (i + 1) + "a pessoa");
            System.out.println();

            System.out.print("Nome: " );
            String name = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            vetor[i] = new Pessoa(name, idade, altura);

            alturaMedia += vetor[i].getHeight() / vetor.length;

        }

        System.out.println("Altura média: " + alturaMedia);

        scanner.close();
    }
}
