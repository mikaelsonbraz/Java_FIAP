package cap_04;

public class Teste {

    public static void main(String[] args) {

        ClassePai_Pessoa mika = new ClassePai_Pessoa("Mikaelson", 32);

        ClasseFilha_Torcedor testeTorcedor1 = new ClasseFilha_Torcedor("Flamengo", "futebol", "Brasil", 200, true, mika);

        System.out.println(testeTorcedor1.getInfoTorcedor());
    }
}
