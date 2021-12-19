package cap_02;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args){

        float altura, peso, imc;
        Scanner entrada = new Scanner(System.in);

        System.out.println("===== CALCULO DE IMC =====");
        System.out.println("Informe sua altura em metros: ");
        altura = entrada.nextFloat();
        System.out.println("Informe seu peso em quilogramas: ");
        peso = entrada.nextFloat();

        if(altura >= 100){
            altura /= 100;
        }

        imc = (float) peso / (altura * altura);

        if(imc < 18 || imc > 25){
            System.out.println("Seu IMC é de " + imc + ", você não está no seu peso ideal.");
        } else{
            System.out.println("Seu IMC é de " + imc + ", você está no peso ideal.");
        }

    }

}
