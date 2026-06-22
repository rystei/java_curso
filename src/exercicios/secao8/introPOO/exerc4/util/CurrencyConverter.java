package exercicios.secao8.introPOO.exerc4.util;

public class CurrencyConverter {
    // usar final para não mudar pois a taxa é 6%
    public static final double IOF = 0.06;

    public static double total(double dollar, double bought) {
        return (dollar * bought) * (1.0 + IOF); // multiplicando por 1.06 para pegar o valor final
    }

}
