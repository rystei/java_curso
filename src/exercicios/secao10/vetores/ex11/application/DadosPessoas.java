package exercicios.secao10.vetores.ex11.application;

import exercicios.secao10.vetores.ex11.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner =new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int quantidade = scanner.nextInt();
        Pessoa[] pessoas = new Pessoa[quantidade];

        for (int i = 0; i < pessoas.length; i++) {

            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            double altura = scanner.nextDouble();

            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            char genero = Character.toUpperCase(scanner.next().charAt(0));

            pessoas[i] = new Pessoa(altura, genero);
        }

        double menorAltura = pessoas[0].getAltura();

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getAltura() < menorAltura) {
                menorAltura = pessoas[i].getAltura();
            }
        }

        double maiorAltura = pessoas[0].getAltura();
        
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getAltura() > maiorAltura) {
                maiorAltura = pessoas[i].getAltura();
            }
        }

        int numeroMulheres = 0;
        int numeroHomens = 0;

        double somaAlturaMulheres = 0.0;

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getGenero() == 'F') {
                somaAlturaMulheres += pessoas[i].getAltura();
                numeroMulheres++;
            } else {
                numeroHomens++;
            }
        }

        double mediaMulheres = 0;

        if (numeroMulheres > 0) {
            mediaMulheres = somaAlturaMulheres / numeroMulheres;
        }
        System.out.printf("Menor altura = %.2f%n", menorAltura );
        System.out.printf("Maior altura = %.2f%n", maiorAltura );
        System.out.printf("Média altura mulheres = %.2f%n", mediaMulheres);
        System.out.println("Numero de homens = " + numeroHomens);


        scanner.close();
    }
}
