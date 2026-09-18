package secao6.review;

public class Ex1 {
    public static void main(String[] args) {

        int numerosPar = 0;
        int numerosImpar = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - Par");
                numerosPar++;
            } else {
                System.out.println(i + " - ÍMPAR");
                numerosImpar++;
            }
        }
        System.out.println("Quantidade de pares: " + numerosPar);
        System.out.println("Quantidade de ímpares: " + numerosImpar);
    }
}
