package exercicios.secao10.listas.entities;

public class Employe {

    private int id;
    private String name;
    private double salary;

    public Employe(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void addPercentage(double valor) {
        this.salary += salary * valor / 100;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + salary;
    }
}
