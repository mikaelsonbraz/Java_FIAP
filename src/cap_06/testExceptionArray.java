package cap_06;

import java.util.ArrayList;

public class testExceptionArray {

    public static void main(String[] args) {

        try {
            ArrayList<String> frutas = new ArrayList<String>();
            frutas.add("Imbu");
            frutas.add("Cajá");

            // Forçando um erro, não existe o índice 2 no ArrayList frutas
            System.out.println(frutas.get(2));

        } catch (Exception e) {
            // Mostrando a pilha de erros gerados
            e.printStackTrace();

            /*
            Esperado que o bloco catch diga que o indice 2 está além do tamanho de um Array com duas posições
            Esperado que o bloco catch diga que o erro está na linha 15
             */
        }
    }
}
