package exercicios.introPOO.exerc3.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.introPOO.exerc3.entities.Students;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Students students = new Students();

        System.out.printf("Insira seu nome: ");
        students.nome = sc.nextLine();
        System.out.print("Insira a nota 1: ");
        students.nota1 = sc.nextDouble();
        System.out.print("Insira a nota 2: ");
        students.nota2 = sc.nextDouble();
        System.out.print("Insira a nota 3: ");
        students.nota3 = sc.nextDouble();

        System.out.printf("Nota final: %.2f%n", students.mediaNotasFinal());

        if (students.mediaNotasFinal() < 60.0) {
            System.out.println("Não passou");
            System.out.printf("Faltou: %.2f%n de nota", students.quantoFaltouDeNota());
        } else {
            System.out.println("Passou");
        }

        sc.close(); 
    }

}
