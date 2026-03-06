package secao3;

import java.util.Scanner;

public class EntradaQuebraLinha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        String a1, a2, a3;

        x = sc.nextInt();
        sc.nextLine(); //extra para consumir o buffer de entrada
        a1 = sc.nextLine();
        a2 = sc.nextLine();
        a3 = sc.nextLine();

        System.out.println("Dados digitados");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }

}
