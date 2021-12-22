package br.com.fiap.BancoCompleto;

public class Teste {

    public static void main(String[] args) {

        Conta testeConta1 = new Conta(123, 1234, 200); //Construtor personalizado
        Conta testeConta2 = new Conta(); //Construtor padrão
        Conta testeContaNull = new Conta();

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

        //Usando e testando os setters da classe Telefone
        testeConta1.telefone.setTelefone("988005538");
        testeConta1.telefone.setDdd("83");

        //Testando o método getter que retorna (ddd) numero do objeto
        System.out.println("Telefone formatado testeConta1: " +testeConta1.telefone.getTelFormatado());

        //Usando e testando os getters da classe Conta
        System.out.println("Agencia testeConta1: " + testeConta1.getAgencia() +
                "\nConta testeConta1: " + testeConta1.getConta() +
                "\nSaldo testeConta1: R$ " + testeConta1.getSaldo());

        System.out.println("Agencia testeConta2: " + testeConta2.getAgencia() +
                "\nConta testeConta2: " + testeConta2.getConta() +
                "\nConta testeConta2: R$ " + testeConta2.getSaldo());

        //Usando e testando os métodos da classe Conta
        testeConta1.sacar(100);
        testeConta1.sacar(101);
        testeConta1.sacar(-5);

        testeConta2.depositar(50);
        testeConta2.depositar(-5);

        // Testando a lógica pra verificar se uma instância aponta pra null
        if (testeContaNull != null) {
            System.out.println("A instância não aponta pra null!");
            System.out.println(testeContaNull);
        }

        // Instanciando e testando um objeto da classe ContaCorrente
        ContaCorrente testeContaCorrente = new ContaCorrente("Física", 1000);
        testeContaCorrente.setAgencia(123);
        testeContaCorrente.setConta(1234);
        testeContaCorrente.setSaldo(2000);

        System.out.println(testeContaCorrente.getSaldo());
        testeContaCorrente.sacar(100);
        testeContaCorrente.depositar(600);
        System.out.println(testeContaCorrente.getSaldo());
        System.out.println(testeContaCorrente.getAgencia());

        // Fazendo o casting de uma instância da classe Pai para a classe Filha
        ContaCorrente testeConta3 = (ContaCorrente) testeConta1;
        System.out.println(testeConta3.getAgencia());
    }
}
