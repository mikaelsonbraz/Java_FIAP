package cap_04;

public class ClassePai_Pessoa {

    protected String nome;
    protected int idade;

    /**
     * Construtor padrão
     */
    public ClassePai_Pessoa() {

    }

    /**
     * Construtor personalizado
     * @param nome - nome da pessoa
     * @param idade - idade da pessoa
     */
    public ClassePai_Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * Getters
     */
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    /**
     * Setters
     * @param nome - modifica os atributos nome e idade do objeto
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
