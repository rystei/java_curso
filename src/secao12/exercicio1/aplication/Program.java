package secao12.exercicio1.aplication;

import secao12.exercicio1.entities.Department;
import secao12.exercicio1.entities.Worker;
import secao12.exercicio1.entities.enums.WorkerLevel;

import java.util.Locale;
import java.util.Scanner;

/*
Ler os dados de um trabalhador com N contratos (N fonecido pelo usuário). Depois, solicitar do usuário um mês e mostrar qual foi o salário
do funcionário nesse mês.
 */

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println("Level: ");
        String level = scanner.nextLine();
        System.out.println("Base salary: ");
        double baseSalary = scanner.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));

        System.out.println("How many contracts to this worker? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract #" + n +" data: ");
        }

        scanner.close();
    }
}
