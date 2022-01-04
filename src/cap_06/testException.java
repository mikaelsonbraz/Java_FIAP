package cap_06;

public class testException {

    public static void main(String[] args) {

        // Dando início ao bloco try
        try {
            int valor = 10 / 0;
            System.out.println(valor);

        // Início do bloco catch (tratamento do erro)
        } catch (Exception e) {

            // Tratamento do erro (esse método imprimirá a pilha de erro que ocorreu)
            e.printStackTrace();

            /* Esperado java.lang.ArithmeticException: / by zero   # Esse foi o erro - divisão por zero
            at cap_06.testException.main(testException.java:9)     # Essa foi a linha que ocorreu - linha 9
             */
        }

        /*
        Em Java uma exceção é um objeto do tipo Exception, podemos classificar esses objetos em três tipos:

        1.Checked - Quando o programador É obrigado a tratar determinada linha de codigo com um try/catch/finally

        2.Unchecked - Quando o programador NÃO É obrigado a tratar determinada linha de codigo
        Geralmente uma exception unchecked herda da classe runtime exception

        Error - Fudeu, não existe tratativa no código
         */
    }
}
