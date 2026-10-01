package secao12.exercicio1.entities;

import secao12.exercicio1.entities.enums.WorkerLevel;

import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private Department department;
    private List<HourContract> contracts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
