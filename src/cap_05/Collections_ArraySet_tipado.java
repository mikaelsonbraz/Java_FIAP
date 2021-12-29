package cap_05;

// No caso da collection set precisamos importa-la
import java.util.HashSet;
import java.util.Set;

public class Collections_ArraySet_tipado {

    public static void main(String[] args){

        // Instanciando um objeto do tipo HashSet (Conjuntos) contendo apenas Strings
        Set<String> conjuntoStrings = new HashSet<String>();

        System.out.println("O conjuntoStrings está vazio? " + conjuntoStrings.isEmpty());

        String fruta1 = "Maçã";
        String fruta2 = "Laranja";
        String fruta3 = "Maçã";

        conjuntoStrings.add(fruta1);
        conjuntoStrings.add(fruta2);
        conjuntoStrings.add(fruta3);

        System.out.println("E agora o conjuntoStrings ta vazio? " + conjuntoStrings.isEmpty() +
                "\nNúmeros de itens no conjutoStrings: " + conjuntoStrings.size());

        System.out.println("Adicionei \"Maçã\", \"Laranja\" e \"Maçã\" de novo no conjuntoStrings porém vejamos os itens " +
                "dentro do conjunto: " + conjuntoStrings + "\nNão vemos \"Maçã\" duas vezes porquê se trata de um conjunto " +
                "e conjuntos não permitem itens repetidos.");
    }
}
