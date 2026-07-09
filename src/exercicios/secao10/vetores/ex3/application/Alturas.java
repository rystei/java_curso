package exercicios.secao10.vetores.ex3.application;

import exercicios.secao10.vetores.ex3.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    private static final int IDADE_LIMITE = 16;
    public static void main(String[] args) {

        /*
        Fazer um programa para ler nome, idade e altura de N pessoas. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver.
         */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        String name;
        int quantidade, idade, menores;
        double alturaMedia, altura, somaAlturas ,percentualMenores;


        System.out.print("Quantas pessoas serao digitadas? ");
        quantidade = scanner.nextInt();
        Pessoa[] vetor = new Pessoa[quantidade];

        somaAlturas = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            scanner.nextLine();
            System.out.print("Dados da " + (i + 1) + "a pessoa");
            System.out.println();
            System.out.print("Nome: " );
            name = scanner.nextLine();
            System.out.print("Idade: ");
            idade = scanner.nextInt();
            System.out.print("Altura: ");
            altura = scanner.nextDouble();
            vetor[i] = new Pessoa(name, idade, altura);
            somaAlturas += altura;
        }

        alturaMedia = somaAlturas / vetor.length;

        menores = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getAge() < IDADE_LIMITE) {
                menores++;
            }
        }

        percentualMenores = ((double) menores / vetor.length) * 100.0;

        System.out.printf("\nAltura media = %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getAge() < IDADE_LIMITE) {
                System.out.println(vetor[i].getName());
            }
        }


        scanner.close();
    }
}
