package Lista3B;
/* Faça um programa que some os números ímpares contidos em um intervalo definido pelo usuário.
   O usuário define o valor inicial do intervalo e o valor final deste intervalo e o programa deve
   somar todos os números ímpares contidos neste intervalo. Caso o usuário digite um intervalo inválido:
   (começando por um valor maior que o valor final)
   deve ser escrito uma mensagem de erro na tela, “Intervalo de valores inválido” e o programa termina.
 */
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o valor inicial: ");
        int incial = input.nextInt();

        System.out.print("Insira o valor final: ");
        int fin = input.nextInt();
        input.close();

        int somarimpar = 0;


        if (incial > fin) {
            System.out.println("O valor do limite incial deve ser menor que o final!");

        }

        for (int i = incial; i <= fin; i++)
            if (i % 2 != 0) {
                somarimpar = somarimpar+ i;

            }
        System.out.println("A soma dos valores impares é: " + somarimpar);



    }
}


