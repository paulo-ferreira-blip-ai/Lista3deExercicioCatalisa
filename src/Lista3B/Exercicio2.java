package Lista3B;
//Faça um programa que leia n números inteiros e imprima sua média.
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Qual a quantidade de números você deseja tirar a média?");
        int qtdDesejada = entrada1.nextInt();


        double valoresRecebidos = 0;
        double somaDosValores = 0;
        double mediaGeral = 0;

        for (int c = 0; c < qtdDesejada; c++) {

            Scanner entrada2 = new Scanner(System.in);
            System.out.print("Digite o numero: ");
            valoresRecebidos = entrada1.nextDouble();
            somaDosValores = somaDosValores + valoresRecebidos;


        }
        mediaGeral = somaDosValores / qtdDesejada;
        System.out.printf("A média é: %.0f", mediaGeral);
    }
}

