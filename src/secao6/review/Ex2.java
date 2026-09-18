package secao6.review;

public class Ex2 {
    public static void main(String[] args) {

        int numero = 1;
        int numeroPar = 0;

        while (numero <=20) {


            if (numero % 2 == 0) {
                System.out.println(numero);
                numeroPar++;
            }

            numero++;
        }
        System.out.println("Quantidade de pares: " + numeroPar);

    }
}
