import java.util.Locale;

import static java.util.Locale.US;
import static java.util.Locale.setDefault;

public class exercicio1 {

    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        System.out.printf("%n");
        System.out.printf("Record: %d years old, code %d and gender %c%n", age, code, gender);
        System.out.printf("%n");
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (threee decimal places): %.3f%n", measure );
        setDefault(US);
        System.out.printf("US decimal point: %.3f", measure );

    }

}
