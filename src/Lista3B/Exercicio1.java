package Lista3B;
//Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 2 vezes. A primeira vez com "for" e a segunda com "while".

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Contagem usando o for: ");
        for (int contagem = 1; contagem <= 100; contagem++) {
            System.out.println(contagem);
        }
        System.out.println("Contagem usando o while: ");
        int contagem2 = 1;
        while (contagem2 <= 100) {
            System.out.println(contagem2);
            contagem2++;


        }
    }
}


