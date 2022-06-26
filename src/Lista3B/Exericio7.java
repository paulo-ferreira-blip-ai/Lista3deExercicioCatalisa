package Lista3B;

import java.util.Scanner;

public class Exericio7 {
    public static boolean primo(int numero) {
        if ((numero == 1) || (numero == 0))
            return (false);
        else {
            int i = 0;
            int fim = 0;
            fim = (int) Math.sqrt(numero);
            for (i = 2; i <= fim; i++) {
                if ((numero % i) == 0)
                    return (false);
            }
            return (true);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número e sáiba se é primo ou não: ");
        int recebe = input.nextInt();

        if (primo(recebe)) {
            System.out.println("É um número primo!");
        } else {
            System.out.println("Não é um número primo!");
        }


    }
}




