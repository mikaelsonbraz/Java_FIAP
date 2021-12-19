package cap_02;

public class if_else {

    public static void main(String[] args){

        int idade = 101;

        if(idade < 18){
            System.out.println("Sua idade é de " + idade + " anos, você é de menor");
        } else {
            System.out.println("Sua idade é de " + idade + " anos, você é de maior");
            if(idade >= 60) {
                if(idade < 100) {
                    System.out.println("Você já atingiu a terceira idade.");
                } else {
                    System.out.println("Parabéns, você é centenário!");
                }
            }
        }
    }
}
