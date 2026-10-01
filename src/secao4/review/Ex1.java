package secao4.review;

/*
Exercício 1
Crie um programa que tenha:
nome de uma pessoa
idade
salário
se ela está empregada
 */

public class Ex1 {
    public static void main(String[] args) {

        String nome = "João";
        int idade = 22;
        double salario = 3300.50;
        boolean empregado = true;

        System.out.printf("Nome: %s\n" , nome);
        System.out.printf("Idade: %s\n" , idade);
        System.out.printf("Salário: $%.2f\n" , salario);
        System.out.printf("Empregado: %s\n" , empregado);

    }
}
