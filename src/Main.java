import java.util.Locale;

import static java.util.Locale.*;

public class Main {

    public static void main(String[] args) {


        double x = 10.12313;
        String nome = "Gustavo";
        int idade = 21;
        double renda = 1400.0;

        System.out.println(x);
        System.out.printf("%.3f%n", x);
        setDefault(US);
        System.out.printf("%.2f%n", x);
        System.out.println("Resultado = "+ x + " Metros");
        System.out.printf("Resultados = %.1f Metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
