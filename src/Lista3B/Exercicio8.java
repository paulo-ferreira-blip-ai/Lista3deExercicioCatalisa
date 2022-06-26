package Lista3B;

public class Exercicio8 {
    public static void main(String[] args) {

        int aux = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                aux = aux + i;

            }
        }
        System.out.println("A soma dos 50 primeiros números ímpares é: " + aux);
    }
}
