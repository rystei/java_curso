package secao10.application;

import secao10.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class VetorObjetoClasse {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // O usuário informa quantos produtos serão cadastrados.
        //
        // Exemplo:
        // 3
        //
        // Isso significa que teremos um vetor com espaço
        // para armazenar 3 objetos Product.
        int numero = scanner.nextInt();

        // ==========================================
        // VETOR DE OBJETOS
        // ==========================================
        //
        // Diferente do exemplo anterior, onde o vetor
        // armazenava números (double),
        // agora ele armazenará OBJETOS do tipo Product.
        //
        // Product[] significa:
        //
        // "Quero um vetor que armazene objetos Product."
        //
        // Exemplo:
        //
        // Índice
        //   0
        //   1
        //   2
        //
        // Cada posição poderá guardar UM objeto Product.
        //
        Product[] vetor = new Product[numero];

        // Quando o vetor é criado, nenhum objeto existe ainda.
        //
        // Se numero = 3
        //
        // Índice
        // 0 -> null
        // 1 -> null
        // 2 -> null
        //
        // null significa:
        // "não existe nenhum objeto nessa posição ainda."

        // Vamos percorrer todas as posições do vetor
        // para criar um Product em cada uma delas.
        for (int i = 0; i < vetor.length; i++) {

            // Consome a quebra de linha deixada pelo nextInt()
            scanner.nextLine();

            // Lê o nome do produto.
            String name = scanner.nextLine();

            // Lê o preço.
            double price = scanner.nextDouble();

            // ==========================================
            // CRIAÇÃO DO OBJETO
            // ==========================================
            //
            // new Product(name, price)
            //
            // cria um novo objeto Product.
            //
            // Exemplo:
            //
            // Nome:
            // Notebook
            //
            // Preço:
            // 3500
            //
            // O objeto criado será algo parecido com:
            //
            // Product
            //  name = Notebook
            //  price = 3500
            //
            // Depois esse objeto é colocado dentro
            // da posição atual do vetor.
            vetor[i] = new Product(name, price);

            // Exemplo depois da primeira volta:
            //
            // vetor[0] -> Product
            //
            // Segunda volta:
            //
            // vetor[1] -> Product
            //
            // Terceira volta:
            //
            // vetor[2] -> Product
        }

        double soma = 0.0;

        // Agora vamos percorrer novamente o vetor.
        //
        // Desta vez queremos acessar cada objeto
        // para pegar apenas o preço.
        for (int i = 0; i < vetor.length; i++) {

            // vetor[i]
            //
            // devolve um objeto Product.
            //
            // Como é um Product,
            // podemos acessar seus métodos.
            //
            // vetor[i].getPrice()
            //
            // significa:
            //
            // "Pegue o objeto da posição i
            // e devolva seu preço."
            soma += vetor[i].getPrice();
        }

        // Calcula a média dos preços.
        double media = soma / vetor.length;

        System.out.printf("Média de preço : %.2f%n", media);

        scanner.close();
    }

}