package cap_05;

public class Classe_String {

    public static void main(String[] args){

        // STRINGS
        System.out.println("STRINGS");
        // Instanciando umm novo objeto da classe String
        String nome = new String("Mika");
        System.out.println(nome);

        // Sem instanciar um objeto da classe String, fazemos um pull
        String nome2 = "Mika";
        System.out.println(nome2);


        // ESCAPES /
        System.out.println("\nESCAPES!");

        // \n Faz uma quebra de linha
        System.out.println("Flamengo\nMelhor time do mundo!");

        // \t Insere uma tabulação
        System.out.println("Flamengo\tMelhor ttime do mundo!");

        // \" Permite inserir aspas duplas dentro da string
        System.out.println("O vasco é \"time\"");


        //CONCATENAÇÃO DE STRINGS!
        System.out.println("\nCONCATENAÇÃO DE STRINGS");

        System.out.println("Variável nome do tipo String antes da concatenação: " + nome);
        nome += "elson";
        System.out.println("Variável nome do tipo String depois da concatenação usando += : " + nome);
        System.out.println("Variável nome2 do tipo String antes da concatenação: " + nome2);
        nome2 = nome2.concat("elson");
        System.out.println("Variável nome2 do tipo String depois da concatenação usando o método .concat(): " + nome2);
    }

}
