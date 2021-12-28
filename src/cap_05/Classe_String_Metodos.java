package cap_05;

public class Classe_String_Metodos {

    public static void main(String[] args){

        String fruta = new String("maça");
        String fruta2 = new String("Maça");
        String fruta3 = new String("caja");
        String fruta4 = new String("cajarana");

        System.out.println("Comparação de Strings: maça == Maça? " + fruta.equals(fruta2));
        System.out.println("Commparação de Strings ignorando maiusculas e minusculas: maça == Maça? " + fruta.equalsIgnoreCase(fruta2));
        System.out.println("Comparando o tamanho de strings: maça tem o mesmo tamanho de Maça? " + (fruta.length() == fruta2.length()));

        System.out.println("Verificando se há uma determinada string dentro de outra string: caja pertence a cajarana? " + fruta4.contains(fruta3));

        //-----------------------------------------------------------------------------------------------------------------------------------------

        String flamengo = new String("Você pensa que o Flamengo é time? o Flamengo não é time não, time é o Vasco da Gama, o Flamengo é seleção!");
        System.out.println("\n\n" + flamengo);
        System.out.println("Quantos caracteres há no canto? " + flamengo.length());
        System.out.println("O canto começa com as palavras \"Você pensa\"? " + flamengo.startsWith("Você pensa"));
        System.out.println("O canto termina comm a palavra \"é seleção!\"? " + flamengo.endsWith("é seleção!"));
        System.out.println("Qual o índice da primeira ocorrência da palavra \"Flamengo\"? " + flamengo.indexOf("Flamengo"));

        System.out.println("Substituindo todo \"Vasco\" mencionado por \"bosta\":\n" + flamengo.replace("Vasco", "bosta"));
        System.out.println("Quantas palavras há no canto? " + flamengo.split(" ").length);

        System.out.println("Qual a substring presente no canto a partir do indice 20 até o indice 25? " + flamengo.substring(20, 25));
        System.out.println("Qual a substring presente no canto desde a palavra Flamengo até as palavras da Gama? " + flamengo.substring(flamengo.indexOf("Flamengo"), flamengo.indexOf("da Gama")));

    }
}
