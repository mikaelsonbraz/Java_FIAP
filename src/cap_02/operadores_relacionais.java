package cap_02;

public class operadores_relacionais {

    public static void main(String[] args){

        int x = 10, y = 12, z = 5;

        System.out.println("Valor de x: " + x +
                "\nValor de y: " + y +
                "\nValor de z: " + z);


        System.out.println("x == y?");
        System.out.println(x == y); // Igualdade
        System.out.println("x != y?");
        System.out.println(x != y); // Negação
        System.out.println("z >= y?");
        System.out.println(z >= y); // Maior/Igual
        System.out.println("z <= x?");
        System.out.println(z <= y); // Menor/Igual

    }
}
