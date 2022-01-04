package cap_06;

public class criandoExceptions {

    public static void main(String[] args) {

        /* Para criar uma excecption em Java devemos criar uma classe que herde de Exception (exceção Checked)
        ou herde de RunTimeException (exceção Unckecked)

        Criei uma Exception chamada DivisaoPorZeroException
         */

        try {

            int numero = 10 / 0;
            System.out.println(numero);

        } catch (Exception e) {

            throw new DivisaoPorZeroException();

        }
    }
}
