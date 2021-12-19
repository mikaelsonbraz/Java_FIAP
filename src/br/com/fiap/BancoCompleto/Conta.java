package br.com.fiap.BancoCompleto;
import java.text.DecimalFormat;
import java.io.Serializable; // Quando gerar um objeto dessa classe ele será serializado em pacotes de bits para tráfego em rede

/**
 * Classe que abstrai uma conta bancária
 * @author Mikaelson Braz
 * @version 1.0
 */

public class Conta implements Serializable {

    private static final long serialVersionUID = 1L;
    private int agencia;
    private int conta;
    private double saldo;

    Titular titular = new Titular();

    //Formato de dois digitos após a vírgula nos tipo double
    DecimalFormat deci = new DecimalFormat(".00");

    //Construtor padrão
    public Conta() {

    }


    //Construtor personalizado
    public Conta(int agencia, int conta, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    //Getters e Setters
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    /**
     * Verificar saldo da conta
     * @return uma string com o valor já formatado do saldo presente na conta
     */
    public String getSaldo() {
        return deci.format(saldo);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos de sacar e depositar

    /**
     * Método sacar do saldo da conta
     * @param valor valor que será sacado do saldo da conta
     * @see depositar
     */
    public void sacar(double valor) {
        if (saldo >= valor && valor > 0) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + deci.format(valor) + " realizado com sucesso, seu novo saldo é de R$ " + deci.format(saldo));
        } else {
            System.out.println("Valor em saldo insuficiente ou valor incorreto. Saldo: R$ " + deci.format(saldo));
        }
    }

    /**
     * Método depositar valores no saldo da conta
     * @param valor valor que será depositado no saldo da conta
     * @see sacar
     */
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + deci.format(valor) + " realizado com sucesso, seu novo saldo é de R$ " + deci.format(saldo));
        } else {
            System.out.println("Valor incorreto.");
        }
    }



}
