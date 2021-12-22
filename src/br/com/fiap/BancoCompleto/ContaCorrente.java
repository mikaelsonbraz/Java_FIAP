package br.com.fiap.BancoCompleto;

public class ContaCorrente extends Conta {

    /**
     * Atributos
     * fisicaOuJuridica = Se o detentor da conta é uma pessoa física (CPF) ou jurídica (CNPJ)
     * chequeEspecial = Valor do cheque especial da conta, padrão 0
     */
    private String fisicaOuJuridica;
    private double chequeEspecial = 0;

    /**
     * Construtor padrão
     */
    public ContaCorrente() {
    }

    /**
     * Construtor personalizado
     */
    public ContaCorrente(String fisicaOuJuridica, double chequeEspecial) {
        this.fisicaOuJuridica = fisicaOuJuridica;
        this.chequeEspecial = chequeEspecial;
    }

    /**
     * Getter Pessoa Física ou Jurídica
     *
     * @return se a pessoa é física ou jurídica
     */
    public String getFisicaOuJuridica() {
        return fisicaOuJuridica;
    }

    /**
     * Getter Cheque Especial
     *
     * @return o valor do cheque especial que a conta detém
     */
    public double getChequeEspecial() {
        return chequeEspecial;
    }

    /**
     * Setter fisicaOuJuridica
     *
     * @param fisicaOuJuridica - Introduz se a conta pertence a uma pessoa física ou jurídica
     */
    public void setFisicaOuJuridica(String fisicaOuJuridica) {
        this.fisicaOuJuridica = fisicaOuJuridica;
    }

    /**
     * Setter chequeEspecial
     *
     * @param chequeEspecial - Determina o valor do cheque especial da conta
     */
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    /**
     * Método sobrescrito getSaldo da classe pai Conta
     * Na classe Conta Corrente o método exibirá o saldo herdado da classe pai (através do super) e o cheque especial da classe filha
     */
    public String getSaldo() {
        return "Valor do saldo: " + super.getSaldo() +
                "\nValor do Cheque Especial: " + this.chequeEspecial;
    }

    //@Override para indicar que o método a seguir sobrescreve (polimorfismo) um método da classe Pai

    /**
     * Método sobrescrito da classe Pai (polimorfismo) que verifica e retira o valor caso haja saldo suficiente na conta,
     * caso não, o método verificará se há saldo suficiente no saldo + cheque especial e retirará caso for true,
     * caso não, o método informa que o valor é maior que o saldo + cheque especial da conta
     * @param valor valor que será sacado do saldo da conta ou do saldo + cheque especial
     */
    @Override
    public void sacar(double valor) {
        String valorFormatado = super.getSaldo().replaceAll(",", ".");
        double valorDouble = Double.parseDouble(valorFormatado);
        if (valorDouble >= valor && valor > 0) {
            super.sacar(valor);
        } else if (valorDouble + this.chequeEspecial >= valor) {
            double valorRestante = valor - valorDouble;
            super.sacar(valorDouble);
            this.chequeEspecial -= valorRestante;
            System.out.println("Valor de saldo insuficiente para sacar R$ " + valor +
                    "\nRetirando o restante do Cheque Especial" +
                    "\nNovo valor do Cheque Especial: R$ " + this.chequeEspecial);
        } else {
            System.out.println("O valor do saldo e do cheque especial somados não são suficientes para retirar" +
                    "o valor especificado" +
                    "\nValor do saldo em conta: R$ " + super.getSaldo() +
                    "\nValor do Cheque Especial: R$ " + this.chequeEspecial);
        }
    }
}



