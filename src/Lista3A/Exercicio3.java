package Lista3A;
/* Faça um programa que receba duas notas parciais de um aluno. O programa deve calcular
  a média alcançada por aluno e apresentar:
  *A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
  *A mensagem "Reprovado", se a média for menor do que sete;
  *A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();
        input.close();

        double media = (nota1 + nota2) / 2;
        if (media == 10) {
            System.out.println("Aprovado com Distinção!");
        } else if (media >= 7 && media < 10) {
            System.out.println("Aprovado!");

        } else {
            System.out.println("Reprovado!");
        }
    }
}
