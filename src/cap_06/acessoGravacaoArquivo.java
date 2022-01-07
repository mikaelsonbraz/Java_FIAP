package cap_06;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class acessoGravacaoArquivo {

    public static void main(String[] args) {

        String nomeDoArquivo = "estoque.csv";
        String diretorio = System.getProperty("user.home");
        String caminho = diretorio + "\\" + nomeDoArquivo;

        List<String> conteudo = new ArrayList<>();
        conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da Unidade em R$");
        conteudo.add("Imbu; 100; pct; 5,00");
        conteudo.add("Siriguela; 100; pct; 4,00");
        conteudo.add("Morango; 25; cx; 10,00");

        //gravarEstoque(nomeDoArquivo, caminho, conteudo);
        lerEstoque(caminho);

    }

    private static void gravarEstoque(String nomeDoArquivo, String caminho, List<String> conteudo){

        FileWriter stream;
        PrintWriter print;

        try {
            // stream é uma conexão de escrita para o arquivo
            stream = new FileWriter(caminho);
            // a classe PrintWriter escreverá nno arquivo
            print = new PrintWriter(stream);

            for(String linha : conteudo){
                //O método println escreve uma linha no arquivo
                print.println(linha);
            }
            // close() fecha o arquivo
            print.close();
            stream.close();

            System.out.println("O arquivo " + nomeDoArquivo + " foi salvo em " + caminho);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void lerEstoque(String caminho){

        try{
            // Abre o caminho
            FileReader stream = new FileReader(caminho);

            // BufferedReader posssui o método readLine()
            // Ele lê uma linha do arquivo e retorna uma String com o valor lido ou null
            BufferedReader reader = new BufferedReader(stream);

            // Lê uma linha do arquivo
            String linha = reader.readLine();

            // Enquanto linha != null
            while (linha != null) {
                System.out.println(linha);
                // Lê a próxima linha do arquivo
                linha = reader.readLine();
            }

            // Fecha o arquivo
            reader.close();
            stream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
