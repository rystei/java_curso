package secao9.palavraThis;
//Diferenciar atributos de variáveis locais
//Passar o próprio objeto como argumento na chamada um metodo ou construtor

public class This {

    /*
    * Quando o nome de um parâmetro em um metodo ou construtor é o mesmo que o nome de um atributo da classe,
    *  this é usado para referenciar o atributo da instância.*/

    public class Product {
        private String name;

        public Product(String name) {
            this.name = name; // 'this.name' é o atributo, 'name' é o parâmetro
        }
    }

}
