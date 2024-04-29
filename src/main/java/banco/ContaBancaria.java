package banco;

public class ContaBancaria {
    int nConta;
    double saldo;

    public ContaBancaria(int nConta, double saldo) {
        this.nConta = nConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getnConta() {
        return nConta;
    }
}
