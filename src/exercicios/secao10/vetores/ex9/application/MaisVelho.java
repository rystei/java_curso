package exercicios.secao10.vetores.ex9.application;

import exercicios.secao10.vetores.ex9.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Pessoa[] pessoas = new Pessoa[quantidade];

        for (int i = 0; i < pessoas.length; i++) {

            System.out.println("Dados da " + (i + 1) + "a pessoa");

            System.out.print("Nome: ");
            String name = scanner.nextLine();

            System.out.print("Idade: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            pessoas[i] = new Pessoa(name, age);
        }

        int maiorIdade = pessoas[0].getAge();
        int posicaoMaior = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getAge() > maiorIdade) {
                maiorIdade = pessoas[i].getAge();
                posicaoMaior = i;
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s\n", pessoas[posicaoMaior].getName());
    }
}
