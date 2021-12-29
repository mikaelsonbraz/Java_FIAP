package cap_05;

import java.util.HashMap;
import java.util.Map;

public class Collections_ArrayMap_tipado {

    public static void main(String[] args) {

        // Instanciando um novo objeto do tipo HashMap (Dicionários em python), que contém pares chave: valor
        Map<String, String> mapStrings = new HashMap<String, String>();

        System.out.println("O mapa mapStrings está vazio? " + mapStrings.isEmpty());

        // Adicionando pares ao mapa, diferente das lists e sets que usamos .add(), pra maps utilizamos o método .put()
        mapStrings.put("fruta1", "Maçã");
        mapStrings.put("fruta2", "Laranja");
        mapStrings.put("fruta3", "Imbu");

        System.out.println("E agora? o mapStrings ta vazio? " + mapStrings.isEmpty() +
                "\nQuantos pares temos dentro do mapStrings? " + mapStrings.size() +
                "\nQuais são eles? " + mapStrings);

        // Podemos buscar uma determinada chave ou um determinado valor dentro de um map utilizando os métodos .containsKey() e .containsValue()
        System.out.println("Temos a chave \"fruta2\" dentro de mapStrings? " + mapStrings.containsKey("fruta2") +
                "\nE a chave \"fruta4\"? " + mapStrings.containsKey("fruta4") +
                "\n\nTemos o valor \"Maçã\", temos dentro de mapStrings? " + mapStrings.containsValue("Maçã") +
                "\nE o valor \"Limão\"? " + mapStrings.containsValue("Limão"));
    }



}
