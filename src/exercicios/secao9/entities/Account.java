package exercicios.secao9.entities;

public class Account {
   private int numeroConta;
   private String titular;
   private double deposito;

    public Account(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public Account(int numeroConta, String titular, double deposito) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.deposito = deposito;
    }

    public void depositar(double valor){
        deposito += valor;
    }

    public void saque(double valor){
        deposito -= valor + 5.0;
    }

    @Override
    public String toString() {
        return "Conta = " +
                "número da conta: " + numeroConta +
                ", titular: " + titular +
                ", deposito $" + String.format("%.2f", deposito);
    }
}
