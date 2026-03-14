package exercicios.secao5.EstruturaCondicional;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O jogo durou " + duracao + " HORA(S)");

        scanner.close();
    }

}
