package cap_02;
import java.util.Scanner;

public class operadores_logicos {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();
        boolean votoObrigatorio = idade >= 18 && idade <= 65; // && = operador lógico 'e', and

        System.out.println("Voto obrigatório para pessoas entre 18 e 65 anos, idade da pessoa: " + idade +
                ". Voto obrigatório? " + votoObrigatorio);


        int numAmarelos = 1, numVermelhos = 0;
        boolean expulso = numAmarelos > 1 || numVermelhos > 0; // || = operador lógico 'ou', or

        System.out.println("Jogador expulso caso tenha tomado dois amarelos ou um vermelho. O jogador foi expulso? " +
                expulso);


        String Flamengo = "seleção";
        boolean flamengoTime = Flamengo.equals("time") ^ Flamengo.equals("seleção"); // ^ = operador lógico 'ou exclusivo', xor retornando true quando apenas uma for verdadeira

        System.out.println("Você pensa que o Flamengo é time? Flamengo não é time não, time é o Vasco da Gama" +
                " o Flamengo é seleção. " + flamengoTime);


        int idade2 = 21;
        boolean maiorIdade = !(idade2 <= 18); // ! = operador lógico 'não' (negação), not

        System.out.println("A maior idade no Brasil é determinada quando o indivíduo completa 18 anos. O indivíduo é maior de idade? " +
                maiorIdade);

    }
}

