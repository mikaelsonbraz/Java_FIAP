package cap_03;

public class TesteConstrutores {

    public static void main(String[] args) {

        Construtores cc1 = new Construtores(); // Construtor padrão, os atributos devem ser inseridos "na mão".
        cc1.setNumConta(123);
        cc1.depositar(200);
        System.out.println("Construtor Padrão: ");
        System.out.println(cc1.getNumConta());
        System.out.println(cc1.recuperarSaldo());

        Construtores cc2 = new Construtores(1234, 250); // Construtor personalizado, já passando os atributos no ato de criação
        System.out.println("Construtor personalizado: ");
        System.out.println(cc2.getNumConta());
        System.out.println(cc2.recuperarSaldo());
    }
}
