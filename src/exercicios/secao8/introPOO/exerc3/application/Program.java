package exercicios.secao8.introPOO.exerc3.application;

import exercicios.secao8.introPOO.exerc3.entities.Grade;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Grade grade = new Grade();

        grade.name = scanner.nextLine();
        grade.firstQuarter = scanner.nextDouble();
        grade.secondQuarter = scanner.nextDouble();
        grade.thirdQuarter = scanner.nextDouble();

        System.out.println("FINAL GRADE = " + grade.finalGrade());
        if (grade.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.println("MISSING " + grade.passOrNot() + " POINTS");
        } else {
            System.out.println("PASS");
        }

    }

}
