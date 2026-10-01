package secao6.reviewMetodoBoolean;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        boolean resultado = Ex4.ehPar(numero);

        Ex4 ex4 = new Ex4();
        ex4.ehPar();

        System.out.println(resultado);

        scanner.close();
    }
}