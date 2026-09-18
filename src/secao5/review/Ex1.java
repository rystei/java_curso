package secao5.review;

public class Ex1 {
    public static void main(String[] args) {
        double nota = 11;

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida");
        } else if (nota > 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
