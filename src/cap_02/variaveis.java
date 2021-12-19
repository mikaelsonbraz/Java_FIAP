package cap_02;

public class variaveis {

    public static void main(String[] args){

        String nome = "Mikaelson";
        byte idade = 32; //melhor usar byte do que int pra declarar uma idade, já que ocupa menos espaço na memória e armazena até 3 dígitos
        boolean filhos = true;

        System.out.println("Olá, me chamo " + nome + ", tenho " + idade + " anos.");

        /*
        Conversão de tipos em Java pode gerar erros por causa da incompatibilidade entre as variáveis
        Conversões automáticas que não geram problemas: byte -> short -> int -> long -> default
        Quando a conversão não é automática podemos forçá-la, isso é chamado de 'casting'
         */

        double preco = 3.99;
        int precoInt = (int) preco; //fiz o casting e transformei um ponto flutuante num número inteiro

        System.out.println("Preço: " + preco + "\n" + "Preço Int: " + precoInt);


    }
}
