//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

package exercicios.secao4.Estrutura_Sequencial;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor1, valor2, soma;

        valor1 = sc.nextInt();
        valor2 = sc.nextInt();

        soma = valor1 + valor2;
        System.out.printf("secao4.Estrutura_Sequencial.Soma é %d", soma);

        sc.close();
    }
}
