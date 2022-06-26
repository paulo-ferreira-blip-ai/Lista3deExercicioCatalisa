package Lista3A;
/*Faça um programa que receba o preço de três produtos e informe qual produto você deve comprar, sabendo que
a decisão é sempre pelo mais barato.*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual valor da camisa? R$: ");
        double camisa = input.nextDouble();

        System.out.print("Qual valor da calça? R$: ");
        double calca = input.nextDouble();

        System.out.print("Qual valor do sapato? R$: ");
        double sapato = input.nextDouble();
        input.close();

        if (camisa < calca && camisa < sapato) {
            System.out.println("Você deve comprar a camisa! ");

        } else if (calca < camisa && calca < sapato) {
            System.out.println("Você deve comprar a calça! ");

        } else {
            System.out.println("Você deve comprar o sapato! ");
        }

    }
}
