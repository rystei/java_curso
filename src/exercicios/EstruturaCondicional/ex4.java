//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
package exercicios.EstruturaCondicional;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que horas o jogo começou? ");
        int horaInicial = scanner.nextInt();
        System.out.println("Que horas o jogo terminou? ");
        int horaFinal = scanner.nextInt();

        int duracao;
        if (horaInicial < horaInicial) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        scanner.close();
    }
}
