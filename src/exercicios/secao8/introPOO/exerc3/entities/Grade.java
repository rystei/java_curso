package exercicios.secao8.introPOO.exerc3.entities;

public class Grade {

    public String name;
    public double firstQuarter;
    public double secondQuarter;
    public double thirdQuarter;

    public double finalGrade() {
        return firstQuarter + secondQuarter + thirdQuarter;
    }

    public double passOrNot() {
        if (finalGrade() < 60) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }
}
