package cap_05;

import java.util.ArrayList;

public class Collections_ArrayList_tipada {

    public static void main(String[] args) {

        // Instanciando um objeto do tipo ArrayList e informando que ele só receberá dados do tipo String
        ArrayList<String> listaStrings = new ArrayList<String>();

        // O método .isEmpty() verifica se a lista não tem elementos
        System.out.println("A lista está vazia? " + listaStrings.isEmpty()); // Esperado true, não inseri nenhum elemento ainda

        String fruta = "Maçã";

        // Adicionando um elemento do tipo String a listaStrings
        listaStrings.add(fruta);
        System.out.println("E agora? a lista está vazia? " + listaStrings.isEmpty()); // Esperado false, já que inseri um elemento

        int numero = 2;
        // O comando abaixo dará umm erro de incompatibilidade já que instanciamos ua lista apenas de Strings
        //listaStrings.add(numero);

        String fruta2 = "Laranja";

        // Atualmente a lista contem apennas um item, no indice 0 temos "Maçã"
        System.out.println("O índice que contém a primeira ocorrência de \"Maçã\" é o índice " + listaStrings.indexOf(fruta));
        // Porém podemos colocar um item num indice específico utilizando o método .set(), apagando o item que estava naquele indice
        listaStrings.set(0, fruta2);
        System.out.println("Adicionei um novo item ao índice 0 utilizando o método .set(), com isso \"Maçã\" que estavaa no índice 0 foi apagado" +
                "e agora quem está no índice 0 é \"" + listaStrings.get(0) + "\"");

        // Adicionando Maçã a listaStrings de novo
        listaStrings.add(fruta);
        System.out.println("Adicionei novamente \"Maçã\" à lista utilizando o método .add(), o que a colocou no " +
                "final da lista, seu novo índice é " + listaStrings.indexOf(fruta));

        // Pegando o tamanho da lista utilizando o método .size()
        System.out.println("Podemos ver quantos itens tem um array com o método .size(), listaStrings tem " +
                listaStrings.size() + " itens");

        System.out.println("listaTrings = " + listaStrings);

        // O método .contains() verifica se determinado item se encontra na lista
        System.out.println("\"Maçã\" se encontra na listaStrinngs? " + listaStrings.contains(fruta));
        System.out.println("E \"Imbu\" também se encontra na listaStrings? " + listaStrings.contains("Imbu"));
    }
}
