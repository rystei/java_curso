package exercicios.secao9.application;

import exercicios.secao9.entities.Account;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter account holder: ");
        String nome = scanner.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        String initialDeposit = scanner.nextLine();

        Account x = new Account(number, nome);

        if (Objects.equals(initialDeposit, "y")) {
            System.out.print("Enter initial deposit value: ");
            double deposito = scanner.nextDouble();
            x.addDeposito(deposito);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(x);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositoAdicionar = scanner.nextDouble();
        x.addDeposito(depositoAdicionar);
        System.out.println("Updated account data:");
        System.out.println(x);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double depositoRetirar = scanner.nextDouble();
        x.removeDeposito(depositoRetirar);
        System.out.println("Updated account data:");
        System.out.println(x);

    }
}
