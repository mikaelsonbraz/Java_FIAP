package br.com.fiap.BancoCompleto;

public class Telefone {

    /**
     * DDD do telefone solicitado
     */
    private String ddd;

    /**
     * Telefone solicitado
     */
    private String telefone;

    // SETTERS ------------------------

    /**
     * Set ddd
     */
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    /**
     * Set telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // MÉTODOS ------------------------

    /**
     * Método público para retornar o telefone formatado
     * @return String com o numero formatado comm o ddd entre parênteses
     */
    public String getTelFormatado() {
        return telFormatado(this.ddd, this.telefone);
    }

    /**
     * Método privado para retornar o número de telefone formatado com o DDD
     * @param ddd DDD que será incorporado junto com o telefone
     * @param telefone Telefone que junto com o DDD formarão o numero completo
     */
    private String telFormatado(String ddd, String telefone) {
        return "(" + ddd + ") " + telefone;
    }

}
