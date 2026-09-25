package secao6.review.reviewMetodo;

public class Ex3 {

    static int somar(int a, int b) {
        return a + b;
    }

    static int subtrair(int a, int b) {
        return a - b;
    }

    static int multiplicar(int a, int b) {
        return a * b;
    }

    static String dividir(int a, int b) {

        if (b == 0) {
            return "Não é possível dividir por zero";
        }
        return String.valueOf(a / b);
    }

}
