package exercicios.secao9.application;

import exercicios.secao9.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account conta;

        System.out.print("Entre com o número da conta: ");
        int numero = scanner.nextInt();
        System.out.print("Entre com o nome titular da conta: ");
        scanner.nextLine();
        String titular = scanner.nextLine();
        System.out.println("Tem deposito inicial (S/N)? ");
        char resposta = scanner.next().charAt(0);
        if (resposta == 'S'){
            System.out.println("Entre com o valor do deposito: ");
            double depositoInicial = scanner.nextDouble();
            conta = new Account(numero, titular, depositoInicial);
        } else {
            conta = new Account(numero, titular);
        }

        System.out.println();
        System.out.println("Conta atualizada");
        System.out.println(conta);

        System.out.println();
        System.out.println("Entre com o valor para deposito:");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Conta atualizada");
        System.out.println(conta);

        System.out.println();
        System.out.println("Entre com o valor para saque:");
        double valorSaque = scanner.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Conta atualizada");
        System.out.println(conta);

        scanner.close();
    }
}
