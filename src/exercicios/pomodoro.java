package exercicios;

import java.util.Scanner;

public class pomodoro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos pomodoros fez hoje? ");
        int quantidade = sc.nextInt();
        sc.close();

        double pomodoro = 25.0;
        double pausa_pequena = 5.0;
        double pausa_grande = 15.0;

        int pausas_longas = quantidade / 4;
        int pausas_curtas = Math.max(quantidade - pausas_longas, 0);

        double tempo_pomodoro = quantidade * pomodoro;
        double tempo_pausas_curtas = pausas_curtas * pausa_pequena;
        double tempo_pausas_longas = pausas_longas * pausa_grande;

        double tempo_total = tempo_pomodoro + tempo_pausas_curtas + tempo_pausas_longas;

        System.out.printf("Tempo de pomodoros: %.2f min%n", tempo_pomodoro);
        System.out.printf("Tempo de pausas curtas: %.2f min%n", tempo_pausas_curtas);
        System.out.printf("Tempo de pausas longas: %.2f min%n", tempo_pausas_longas);
        System.out.printf("Tempo total (trabalho + pausas): %.2f min%n", tempo_total);
    }
}
