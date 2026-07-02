package exercicios.secao9.application;

import exercicios.secao9.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Account x;

        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter account holder: ");
        String holder = scanner.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char response = scanner.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scanner.nextDouble();
            x = new Account(number, holder, initialDeposit);
        } else {
            x = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(x);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = scanner.nextDouble();
        x.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(x);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = scanner.nextDouble();
        x.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(x);

        scanner.close();
    }
}
