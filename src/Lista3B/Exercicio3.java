package Lista3B;
// Escreva um programa que leia 10 números e escreva o menor valor lido é o maior valor lido.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double auxiliar = 0;
        double maior = 0;
        double menor = 1000000000;
        double[] limite = new double[10];

        for (double c = 0; c < 10; c++) {
            System.out.println("Digite o  " + (c+1) + "º número e aperte enter: ");
            limite[(int) c] = entrada.nextDouble();
            auxiliar = limite[(int) c];
            if (menor > auxiliar) {
                menor = limite[(int) c];
            }
            if (maior < auxiliar) {
                maior = limite[(int) c];

            }


        }
        System.out.println("O maior é: " + maior + "O menor é: " + menor);


    }

}
