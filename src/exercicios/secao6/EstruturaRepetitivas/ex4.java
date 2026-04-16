package exercicios.secao6.EstruturaRepetitivas;

import java.util.Scanner;

/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */
public class ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i=0; i<n; i++){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if (num2 == 0){
                System.out.println("Divisão impossivel");
            } else {
                double divisao = (double) num1 / num2;
                System.out.printf("%.1f%n", divisao);
            }
        }

    }

}
