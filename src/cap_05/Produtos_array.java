package cap_05;

public class Produtos_array {

    protected String nome;
    protected double preco;

    /**
     * Construtor padrão
     */
    public Produtos_array(){

    }

    /**
     * Construtor personalizado
     * @param nome - nome do produto
     * @param preco - preço do produto
     */
    public Produtos_array(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * Getters
     */
    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    // Override do metodo toString()
    @Override
    public String toString() {
        return "Produto [nome=" + getNome() + ", preço=" + getPreco() + "]";
    }

}
