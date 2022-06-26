package Lista3B;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número para calcular seu fatorial: ");
        int numero = input.nextInt();

        int x = numero;
        int y = x;

        if (numero <= 0) {
            System.out.println("Não existe fatorial para números negativos!");
        }
        while (x > 1) {
            y = y * (x - 1);
            x--;

            System.out.println( numero + " x " + x + " = " +y);

        } System.out.print("A fatoração de " + numero + " resulta em " + y );


    }
}
