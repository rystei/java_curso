package secao3;

import java.util.Locale;

public class FirstReview {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double x = 10.35784;
        System.out.printf("%.2f%n", x);
        System.out.printf("%.3f%n", x);
        System.out.println("Resultado = " + x + " metros");
        System.out.println("Resultado = " + String.format("%.2f", x) + " metros");
    }
}


