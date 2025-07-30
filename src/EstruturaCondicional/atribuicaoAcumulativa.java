package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class atribuicaoAcumulativa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos minutos usados?");
        int minutos = scanner.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        scanner.close();
    }
}
