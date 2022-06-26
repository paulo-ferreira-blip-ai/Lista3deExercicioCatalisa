package Lista3A;
/* Faça um Programa que receba um número e exiba o dia correspondente da semana.
(1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer a mensagem “valor inválido” */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 7: ");
        int dia = input.nextInt();
        input.close();

        if (dia == 1) {
            System.out.println("Domingo");
        }
        if (dia == 2) {
            System.out.println("Segunda");
        }
        if (dia == 3) {
            System.out.println("Terça");
        }
        if (dia == 4) {
            System.out.println("Quarta");
        }
        if (dia == 5) {
            System.out.println("Quinta");
        }
        if (dia == 6) {
            System.out.println("Sexta");
        }
        if (dia == 7) {
            System.out.println("Sábado");
        } else if (dia != 1 && dia != 2 && dia != 3 && dia != 4 && dia != 5 && dia != 6 && dia != 7) {
            System.out.println("Número Inválido");

        }


    }


}



