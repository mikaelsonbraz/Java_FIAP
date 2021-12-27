package cap_04;

public class ClasseFilha_Torcedor extends ClassePai_Pessoa { // Note a palavra reservada extends, mostrando que há umma herança

    protected String time;
    protected String esporte;
    protected String pais;
    protected int titulos;
    protected boolean elite;
    String pessoa = new ClassePai_Pessoa().getNome();

    /**
     * Construtor padrão
     */
    public ClasseFilha_Torcedor() {

    }

    /**
     * Construtor personalizado
     *
     * @param time    - nome do time do coração
     * @param esporte - esporte praticado pelo time
     * @param pais    - país que o time é pertencente
     * @param titulos - quantidade ded titulos ganhos na historia pelo time
     * @param elite   - booleano para verificar se o timme se encontra na divisão de elite do esporte no país
     */
    public ClasseFilha_Torcedor(String time, String esporte, String pais, int titulos, boolean elite, ClassePai_Pessoa
            pessoa) {
        this.time = time;
        this.esporte = esporte;
        this.pais = pais;
        this.titulos = titulos;
        this.elite = elite;
        this.pessoa = pessoa.getNome();
    }

    /**
     * Getters
     * Esse getter sozinho retorna todas as informações da pessoa torcedora
     */
    public String getInfoTorcedor() {
        String estaNaElite;
        if (elite) {
            estaNaElite = "está na elite do esporte no seu país";
        } else {
            estaNaElite = "não está na divisão de elite do esporte no país";
        }
        return "O time que " + this.pessoa + " torce é o " + this.time + ", time de " + this.esporte + ", esse time é do " + this.pais + ", tem " + this.titulos
                + " títulos e " + estaNaElite;
    }

}