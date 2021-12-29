package cap_05;

import java.util.ArrayList;

public class Collections {

    public static void main(String[] args) {

        // Listas em Java
        // Instanciando umm novo objeto do tipo ArrayList
        ArrayList carrinho = new ArrayList();

        double valor = 100.5;
        int valor2 = 150;
        double valor3;
        Produtos_array brinquedo = new Produtos_array("bola", 5.5);

        // ArrayList aceita valor de qualquer tipo, tudo misturado.
        //O método .add() adiciona o valor a lista
        carrinho.add(valor);
        carrinho.add(valor2);
        carrinho.add("Uva");
        carrinho.add(brinquedo);

        //O método .get() pega o valor contido no indice contido dentro dos parenteses
        System.out.println(carrinho.get(1)); // Esperado variavel valor2 que é = 150
        System.out.println(carrinho.get(2)); // Esperado "Uva"
        System.out.println(carrinho.get(3)); // Esperado o objeto.toString() da classe Produtos_array (lembrando que o metodo toString() foi sobrescrito na classe Produtos_array);
    }
}
