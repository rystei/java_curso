package secao4.Estrutura_Sequencial;

import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("Insira o numero");
        numero = entrada.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1){
            ehPrimo = false;
        } else {
          for (int i = 2; i <= Math.sqrt(numero); i++)
              if (numero % i == 0) {
                  ehPrimo = false;
                  break;
              }
        }

        if (ehPrimo){
            System.out.println("é secao4.Estrutura_Sequencial.primo");
        }else{
            System.out.println("Não é secao4.Estrutura_Sequencial.primo.");
        }
        entrada.close();
    }
}
