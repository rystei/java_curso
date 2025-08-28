package exercicios.introPOO.exerc3.entities;

public class Students {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double mediaNotasFinal() {
        return nota1 + nota2 + nota3;
    }

    public double quantoFaltouDeNota() {
        if (mediaNotasFinal() < 60) {
            return 60 - mediaNotasFinal();
        } else {
            return 0.0;
        }
    }
}
