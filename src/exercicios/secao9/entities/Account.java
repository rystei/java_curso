package exercicios.secao9.entities;

public class Account {

    private int numeroConta;
    private String titularConta;
    private double deposito;

    public Account(int numeroConta, String titularConta) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.deposito = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public void addDeposito (double x) {
        deposito += x;
    }

    private static final double TAXA_SAQUE = 5.0;

    public void removeDeposito (double x) {
        deposito -= x + TAXA_SAQUE;
    }

    public String toString() {
        return "Account " +
                numeroConta +
                ", Holder: " +
                titularConta +
                ", Balance: $ " +
                deposito;
    }

}
