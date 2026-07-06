package secao10.vetores;

// =========================== VETORES (ARRAYS)
// ===========================
//
// Um vetor (array) é uma estrutura de dados que permite armazenar
// vários valores do MESMO TIPO em uma única variável.
//
// Sem vetor, se eu quisesse guardar as notas de 5 alunos, faria:
//
// double nota1;
// double nota2;
// double nota3;
// double nota4;
// double nota5;
//
// Isso rapidamente fica inviável quando a quantidade de dados aumenta.
//
// Com vetor:
//
// double[] notas = new double[5];
//
// Agora existe apenas UMA variável (notas), que possui 5 posições.
//
// Cada posição é identificada por um índice.
//
// Exemplo:
//
// Índice:   0    1    2    3    4
// Valor : 8.5  7.0  9.2  6.5  10
//
// Para acessar cada posição:
//
// notas[0] -> 8.5
// notas[1] -> 7.0
// notas[2] -> 9.2
//
// IMPORTANTE:
//
// Todo vetor começa SEMPRE na posição 0.
//
// Um vetor com tamanho 5 possui as posições:
//
// 0
// 1
// 2
// 3
// 4
//
// Nunca:
// 1
// 2
// 3
// 4
// 5
//
// O tamanho do vetor é fixo.
// Depois de criado, ele não aumenta nem diminui.
//

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // O usuário informa quantos números deseja armazenar.
        // Exemplo:
        // Entrada: 4
        //
        // Isso significa que o vetor terá espaço para 4 posições.
        int numero = scanner.nextInt();

        // Criando o vetor.
        //
        // "double[]" significa:
        // "quero um vetor que armazene valores do tipo double".
        //
        // Se numero = 4, teremos:
        //
        // Índice: 0   1   2   3
        // Valor : 0   0   0   0
        //
        // Os valores ainda não foram preenchidos.
        double[] vetor = new double[numero];

        // Percorrendo todas as posições do vetor para preenchê-las.
        //
        // O contador i representa o índice atual.
        //
        // Primeira volta:
        // i = 0
        //
        // Segunda volta:
        // i = 1
        //
        // Terceira volta:
        // i = 2
        //
        // ...
        //
        // O laço termina quando i chegar ao tamanho do vetor.
        for (int i = 0; i < numero; i++) {

            // Lê um número digitado pelo usuário
            // e armazena exatamente na posição i.
            //
            // Exemplo:
            //
            // usuário digita:
            // 5.0
            //
            // primeira volta:
            // vetor[0] = 5.0
            //
            // segunda volta:
            // vetor[1] = próximo número
            vetor[i] = scanner.nextDouble();
        }

        double soma = 0;

        // Agora vamos percorrer o vetor novamente.
        //
        // Desta vez não estamos inserindo valores.
        // Estamos apenas lendo cada posição para calcular a soma.
        for (int i = 0; i < numero; i++) {

            // soma = soma + vetor[i];
            //
            // Exemplo:
            //
            // Vetor:
            // 5  8  10
            //
            // Primeira volta:
            // soma = 0 + 5 = 5
            //
            // Segunda volta:
            // soma = 5 + 8 = 13
            //
            // Terceira volta:
            // soma = 13 + 10 = 23
            soma += vetor[i];
        }

        // Depois de somar todos os elementos,
        // basta dividir pela quantidade de números.
        double media = soma / numero;

        System.out.printf("A média é: %.2f%n", media);

        scanner.close();
    }
}