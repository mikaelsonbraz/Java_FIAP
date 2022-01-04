package cap_06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class usandoThrows {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("c://notas.txt");

        PrintWriter print = new PrintWriter(fw);
        print.println("Maçã = R$ 6,00");
        print.println("Imbu = R$ 2,00");
        print.close();
        fw.close();
    }
}
