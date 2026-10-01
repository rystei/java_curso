package secao4.review;

public class Ex2 {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 3;

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;
        int restoDaDivisao = numero1 % numero2;

        boolean maior = numero1 > numero2;

        System.out.printf("Soma: %d%n", soma);
        System.out.printf("Subtração: %d%n", subtracao);
        System.out.printf("Multiplicação: %d%n", multiplicacao);
        System.out.printf("Divisão: %d%n", divisao);
        System.out.printf("Resto: %d%n", restoDaDivisao);
        System.out.printf("Numero 1 é maior que numero 2: %b%n", maior);
        }
}
