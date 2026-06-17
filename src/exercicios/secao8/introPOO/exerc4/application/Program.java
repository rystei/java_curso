package exercicios.secao8.introPOO.exerc4.application;

import exercicios.secao8.introPOO.exerc4.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("what is the dollar price? ");
        double dollar = scanner.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double bought = scanner.nextDouble();
        System.out.print("Amount to be paid in reais = " + CurrencyConverter.total(dollar, bought));

        scanner.close();
    }
}
