package cap_03;

public class TesteConta {

    public static void main(String[] args) {

        Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.numConta = 11;
        contaCorrente.saldo = 200.50;
        contaCorrente.cliente.nome = "Mikaelson Braz";
        contaCorrente.cliente.cpf = "08331289498";


        contaPoupanca.numConta = 22;
        contaPoupanca.saldo = 110.25;
        contaPoupanca.cliente.nome = "Mikaelson Braz";
        contaPoupanca.cliente.cpf = "08331289498";

        contaInvestimento.numConta = 33;
        contaInvestimento.saldo = 2000.00;
        contaInvestimento.cliente.nome = "Mikaelson Braz";
        contaInvestimento.cliente.cpf = "08331289498";

        System.out.println(contaCorrente.numConta);
        System.out.println(contaCorrente.cliente.nome);

        System.out.println(contaPoupanca.numConta);
        System.out.println(contaPoupanca.cliente.cpf);

        System.out.println("Cliente de nome " + contaInvestimento.cliente.nome + " com a conta de número " +
                contaInvestimento.numConta + String.format(" tem em saldo para investimentos o valor de R$ %.2f", contaInvestimento.saldo));

        System.out.println(contaPoupanca.exibirSaldo());
        contaPoupanca.depositar(50); //Adicionando 50 reais ao saldo de contaPoupanca
        System.out.println(contaPoupanca.exibirSaldo());
        contaPoupanca.depositar(-50); //Verificando se a logica de não permmitir valores abaixo de 0 funciona
        System.out.println(contaPoupanca.exibirSaldo());

        // TESTANDO A SOBRECARGA DE MÉTODOS E ATRIBUTOS

        // SOBRECARGA DE METODOS
        contaPoupanca.sacar(10); // Assinatura 1
        System.out.println(contaPoupanca.exibirSaldo()); // Passou
        contaPoupanca.sacar(151); // Testando um valor maior que o que há no saldo
        System.out.println(contaPoupanca.exibirSaldo()); // Passou

        contaPoupanca.sacar(100, 5); //Assinatura 2
        System.out.println(contaPoupanca.exibirSaldo()); // Passou
        contaPoupanca.sacar(100, 1); // Testando um valor maior que o que há no saldo
        System.out.println(contaPoupanca.exibirSaldo()); // Passou

        // SOBRECARGA DE ATRIBUTOS
        System.out.println(contaCorrente.numConta); // Esperado 11
        contaCorrente.setNumConta(555); // Setando outro numero da conta
        System.out.println(contaCorrente.numConta); // Esperado 555 - Passou


    }
}
