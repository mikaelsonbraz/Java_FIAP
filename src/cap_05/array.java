package cap_05;

public class array {

    public static void main(String[] args) {

        /* Arrays são as listas em python, porém no java só permitem é permitido ter itens do mesmo tipo
        sejam tipos primitivos ou objetos
        se não atribuirmos valor a uma determinada posição do array o valor contido nela será 0
         */

        int[] valores = new int[5];

        for (int i = 0; i < 5; i++) {
            valores[i] = i * 10;
        }

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor de índice [" + i + "] do array valores é " + valores[i]);
        }

        // Substituindo o valor de um indice do array
        valores[4] = 400;
        System.out.println("valores[4] = 400");
        System.out.println("Agora o valor do índice[4] do array valores é " + valores[4]);


        // Arrays de objetos da classe Produtos_array
        // Instanciando os objetos
        Produtos_array produto1 = new Produtos_array("Nintendo Switch", 2000);
        Produtos_array produto2 = new Produtos_array("Playstation 5", 3800);

        // Criando o array e inserindo os dois objetos nela
        Produtos_array[] listaProdutos = new Produtos_array[2];
        listaProdutos[0] = produto1;
        listaProdutos[1] = produto2;

        // Utilizando o for iterável para pegar cada elemento da lista
        System.out.println("\nUtilizando for para pegar cada item do array de objetos");
        for (int i = 0; i < listaProdutos.length; i++) {
            System.out.println(listaProdutos[i].toString());
        }

        // Utilizado o for each para pegar cada elemento da lista
        System.out.println("\nUtilizando for each para pegar cada item do array de objetos, fica mais bonito");
        for (Produtos_array produto : listaProdutos) {
            System.out.println(produto.toString());
        }
    }


}
