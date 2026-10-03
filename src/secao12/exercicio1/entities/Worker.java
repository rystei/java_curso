package secao12.exercicio1.entities;

import secao12.exercicio1.entities.enums.WorkerLevel;

import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){
    }

    public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

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

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(Integer year, Integer month){
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for (HourContract contract : contracts){
            calendar.setTime(contract.getDate());
            Integer contract_year = calendar.get(Calendar.YEAR);
            Integer contract_month = 1 + calendar.get(Calendar.MONTH);
            if (year == contract_year && month == contract_month) {
                sum += contract.totalValue();
            }
        }
        return sum;
    }

}
