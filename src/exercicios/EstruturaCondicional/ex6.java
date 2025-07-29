//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
package exercicios.EstruturaCondicional;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um valor");
        double valor = scanner.nextDouble();

        if (valor >= 0 && valor <= 25.00) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25.00 && valor <= 50.00) {
            System.out.println("Intervalo [25,50]");
        } else if (valor > 50.00 && valor <= 75.00) {
            System.out.println("Intervalo [50,75]");
        } else if (valor > 75.00 && valor <= 100.00) {
            System.out.println("Intervalo [75, 100]");
        } else {
            System.out.println("Fora do intervalo");
        }
        scanner.close();
    }
}
