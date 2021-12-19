package cap_02;

import java.util.Scanner; //importando a classe Scanner para escanear dados de entrada do usuário

public class entrada_saida_dados {

    public static void main(String[] args){

        int idade;
        String nome;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = entrada.nextLine();
        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();
        entrada.close();

        if(idade >= 18){
            if(idade >= 100){
                System.out.println("Parabéns " + nome + "! Você tem " + idade + " anos, atingiu o centenário");
            } else if(idade >= 60) {
                System.out.println(nome + ", você tem " + idade + " anos, chegou a terceira idade");
            } else {
                System.out.println(nome + ", você tem " + idade + " anos, atingiu a maioridade");
            }
        } else {
            System.out.println(nome +", você tem " + idade + " anos, ainda não atingiu a maioridade");
        }
    }
}
