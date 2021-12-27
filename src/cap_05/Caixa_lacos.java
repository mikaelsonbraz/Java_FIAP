package cap_05;

public class Caixa_lacos {

    public static void main(String[]  args) {

        int registros = 0;

        System.out.println("-----LAÇO WHILE-----");
        // Sem segredo aqui, muito parecido com o laço whilee do python
        while (registros < 5) {
            registros++;
            System.out.println("Produto " + registros + "/5");

        }

        System.out.println("\n-----LAÇO DO WHILE-----");
        registros = 0;
        // Laço Do-While - primeiro  algo é feito e depois verifica-se a condição permite que o código seja executado de novo
        do {
            registros++;
            System.out.println("Produto " + registros + "/5");
        } while (registros < 5);

        System.out.println("\n-----LAÇO FOR-----");
        // Laço For - mais indicado quando sabemos exatamente quantas vezes o código deverá ser executado
        for (int i = 1; i < 6; i++) {
            System.out.println("Produto " + i + "/5");
        }
    }
}
