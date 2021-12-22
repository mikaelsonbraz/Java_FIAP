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
    public ContaCorrente(){}

    /** Construtor personalizado
     */
    public ContaCorrente(String fisicaOuJuridica, double chequeEspecial) {
        this.fisicaOuJuridica = fisicaOuJuridica;
        this.chequeEspecial = chequeEspecial;
    }

    /**
     * Getter Pessoa Física ou Jurídica
     * @return se a pessoa é física ou jurídica
     */
    public String getFisicaOuJuridica() {
        return fisicaOuJuridica;
    }

    /**
     * Getter Cheque Especial
     * @return o valor do cheque especial que a conta detém
     */
    public double getChequeEspecial() {
        return chequeEspecial;
    }

    /**
     * Setter fisicaOuJuridica
     * @param fisicaOuJuridica - Introduz se a conta pertence a uma pessoa física ou jurídica
     */
    public void setFisicaOuJuridica(String fisicaOuJuridica) {
        this.fisicaOuJuridica = fisicaOuJuridica;
    }

    /**
     * Setter chequeEspecial
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
}



