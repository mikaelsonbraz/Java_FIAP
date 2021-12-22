package cap_04;

public class Teste {

    public static void main(String[] args) {

        ClassePai_Pessoa mika = new ClassePai_Pessoa("Mikaelson", 32);
        ClassePai_Pessoa davi = new ClassePai_Pessoa("Davi", 24);
        // TESTE 1 ------------------------------------------------------

        ClasseFilha_Torcedor testeTorcedor1 = new ClasseFilha_Torcedor("Flamengo", "futebol", "Brasil", 200, true, mika);

        System.out.println(testeTorcedor1.getInfoTorcedor());


        // TESTE 2 ------------------------------------------------------

        ClasseFilha_Torcedor testeTorcedor2 = new ClasseFilha_Torcedor();
        testeTorcedor2.pessoa = "Mika";
        testeTorcedor2.time = "Bulls";
        testeTorcedor2.esporte = "basquete";
        testeTorcedor2.pais = "USA";
        testeTorcedor2.titulos = 6;
        testeTorcedor2.elite = true;

        System.out.println(testeTorcedor2.getInfoTorcedor());


        // TESTE 3 -----------------------------------------------------

        ClasseFilha_Torcedor testeTorcedor3 = new ClasseFilha_Torcedor("Vasco", "futebol", "Brasil", 2, false, davi);
        // Podemos tambémm declarar um novo objeto chamando a classe pai

        System.out.println(testeTorcedor3.getInfoTorcedor());
    }
}
