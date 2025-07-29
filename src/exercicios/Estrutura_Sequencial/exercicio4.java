// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

package exercicios.Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double valor_horas, salario;

        System.out.print("Insira o numero: ");
        numero = sc.nextInt();

        System.out.print("Insira horas trabalhadas: ");
        horas = sc.nextInt();

        System.out.print("Insira o valor das horas trabalhadas: ");
        valor_horas = sc.nextDouble();

        salario = valor_horas * horas;

        System.out.println("Numero = " + numero);
        System.out.printf("Salário = R$ %.2f", salario);

        sc.close();
    }
}
