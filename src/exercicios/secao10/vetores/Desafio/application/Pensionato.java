package exercicios.secao10.vetores.Desafio.application;

import exercicios.secao10.vetores.Desafio.entities.Estudante;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados? ");
        int quantidadeEstudantes = scanner.nextInt();
        scanner.nextLine();
        Estudante[] quartos = new Estudante[10];

        for (int i = 0; i < quantidadeEstudantes; i++) {

            System.out.println("Alugado #" + (i + 1) + ":");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Quarto: ");
            int quarto = scanner.nextInt();
            scanner.nextLine();

            quartos[quarto] = new Estudante(nome, email, quarto);
        }

        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i].getNome() + ", " + quartos[i].getEmail());            }
        }

        scanner.close();
    }
}
