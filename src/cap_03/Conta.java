package cap_03;

public class Conta {

    int numConta;
    double saldo;

    Cliente cliente = new Cliente();

    public String exibirSaldo(){

        return "O cliente " + cliente.nome + " tem em saldo o valor de R$ " + saldo;
    }

    public void depositar(double valor) {
        if (valor > 0){
            saldo += valor;
        }
    }

    // SOBRECARGA DE MÉTODOS!

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        }
    }

    public void sacar(double valor, double taxaJuros) {
        taxaJuros = valor * (taxaJuros/100);
        if (saldo >= (valor + taxaJuros)) {
            saldo -= valor + taxaJuros;
        }
    }

    // SOBRECARGA DE ATRIBUTOS!

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
}

