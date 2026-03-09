package exercicios.secao4.Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        double numeroHoras = sc.nextInt();
        double salario = sc.nextDouble();

        double salarioTotal = numeroHoras * salario;

        System.out.println("NUMBER = "  + numero);
        System.out.printf("Salary = U$ " + String.format("%.2f",salarioTotal));
    }

}
