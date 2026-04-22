package secao6.EstruturaRepetitivas;

import java.util.Scanner;

/*
do-while serve para executar pelo menos 1 vez faz a verificação no final
 */

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int i = scanner.nextInt();
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

    }
}
