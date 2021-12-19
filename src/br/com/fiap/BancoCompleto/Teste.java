package br.com.fiap.BancoCompleto;

public class Teste {

    public static void main(String[] args) {

        Conta testeConta1 = new Conta(123, 1234, 200); //Construtor personalizado
        Conta testeConta2 = new Conta(); //Construtor padrão

        //Usando e testando os setters para inserir os atributos do objeto testeConta2
        testeConta2.setAgencia(123);
        testeConta2.setConta(1235);
        testeConta2.setSaldo(250);

        //Usando e testando os setters da classe Titular
        testeConta1.titular.setNome("Labala da Silva");
        testeConta1.titular.setCPF("12345678900");

        //Testando os getters da classe Titular
        System.out.println("Titular do testeConta1: " + testeConta1.titular.getNome() +
                "\nCPF do titular do testeConta1: " + testeConta1.titular.getCPF());

        //Usando e testando os getters
        System.out.println("Agencia testeConta1: " + testeConta1.getAgencia() +
                "\nConta testeConta1: " + testeConta1.getConta() +
                "\nSaldo testeConta1: R$ " + testeConta1.getSaldo());

        System.out.println("Agencia testeConta2: " + testeConta2.getAgencia() +
                "\nConta testeConta2: " + testeConta2.getConta() +
                "\nConta testeConta2: R$ " + testeConta2.getSaldo());

        //Usando e testando os métodos
        testeConta1.sacar(100);
        testeConta1.sacar(101);
        testeConta1.sacar(-5);

        testeConta2.depositar(50);
        testeConta2.depositar(-5);
    }
}
