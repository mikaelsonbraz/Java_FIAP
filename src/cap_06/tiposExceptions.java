package cap_06;

public class tiposExceptions {

    public static void main(String[] args) {

        // Temos quatro erros diferentes:
        try {
             int numero = 10 / 0;

            int[] numeros = new int[3];
            System.out.println(numeros[4]);

            String nome = null;
            System.out.println(nome.length());

            int zero = Integer.parseInt("zero");

        } catch (ArithmeticException e) {
            System.out.println("Lançando ArithmeticalException \nNão é possível dividir um número por zero");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nLançando ArrayIndexOutOfBoundsExcecption \nÍndice fora do intervalo do array");
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("\nLançando NullPointerException \nO método length() não podee ser aplicado a variáaveis null");
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("\nLançando NumberFormatException \nA string presente no .parseInt() não é um número válido");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\nBloco finally \nO código continuará aqui, sempre, independete das tratativas das exceções");
        }
    }
}
