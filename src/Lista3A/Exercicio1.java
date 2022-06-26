package Lista3A;
// Faça um programa que receba dois números e imprima o maior deles.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double primeiro = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double segundo = input.nextByte();

        input.close();

        if (primeiro > segundo) {
            System.out.printf("O número maior é: %.0f", primeiro);
        } else {
            System.out.printf("O número maior é: %.0f ", segundo);
        }

    }

}
