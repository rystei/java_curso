package exercicios.secao10.listas.application;

import exercicios.secao10.listas.entities.Employe;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many employees will be registred? ");
        int quantity = scanner.nextInt();
        List<Employe> employe = new ArrayList<>(quantity);

        for (int i = 0; i < quantity; i++) {
            System.out.println("Employee #"+ (i + 1));

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            employe.add(new Employe(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        int id = scanner.nextInt();

        for (Employe employee : employe) {
            if (employee.getId() == id) {
                System.out.print("Enter the percentage: ");
                double percentage = scanner.nextDouble();
                employee.addPercentage(percentage);
            } else {
                System.out.println("This id does not exist!");
            }

            System.out.println("List of employees");
            for (Employe result : employe) {
                System.out.println(result);
            }
        }


    }
}
