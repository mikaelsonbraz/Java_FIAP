package cap_02;

public class increemento_decremento {

    public static void main(String[] args){

        int x = 10;
        int y = 10;
        System.out.println("Valor de x: " + x +
                "\nValor de y:" + y);

        x++;
        System.out.println("x++ = " + x);

        y--;
        System.out.println("y-- = " + y);

        ++x;
        System.out.println("++x = " + x);

        --y;
        System.out.println("--y = " + y);

        //x++ e ++x quando isolados representam a mesma coisa, porém...

        int z = 10, m = 5, n = 5;

        System.out.println("Valor de z: " + z +
                "\nValor de m: " + m +
                "\nValor de n: " + n);

        z = m++;
        System.out.println("z = m++ = " + z +
                "\nm = " + m);
        //OLHA O PERIGO! Nesse caso z recebe o valor de m antes dele ser imcrementado, já m passa a ter o valor m++

        z = --n;
        System.out.println("z = --n = " + z +
                "\nn = " + n);
        //OLHA O PERIGO! Já nesse caso z vai receber o valor de --n, porque o operador de decremento ta antes da variavel
    }
}
