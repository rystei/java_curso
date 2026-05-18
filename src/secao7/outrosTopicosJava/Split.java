package secao7.outrosTopicosJava;

public class Split {

    public static void main(String[] args) {

        String frase = "ola mundo java hello world";

        String[] vect = frase.split(" ");

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }


    }
}
