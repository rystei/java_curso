package secao10.forEach;

public class ForEach {
    public static void main(String[] args) {

        String[] vetor = new String[] {"Carro", "Moto", "Avião"};

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("--------------------------------");

        for (String obj : vetor) {
            System.out.println(obj);
        }

    }
}
