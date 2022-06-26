package Lista3A;
/* Os gestores da Zup resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram
para desenvolver o programa que calcula os reajustes. Portanto, faça um programa que recebe o salário
de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
*Salários até R$ 280,00 (incluindo), receberão aumento de 20%
*Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de 15%
*Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de 10%
*Salários de R$ 1500,00 em diante, receberão aumento de 5%

Após o aumento ser realizado, informe na tela:
*O salário antes do reajuste;
*O percentual de aumento aplicado;
*O valor do aumento;
*O novo salário, após o aumento;
 */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do seu salário R$: ");
        double salario = input.nextDouble();
        input.close();

        double vinteporcento = salario * 0.2;
        double quinzeporcento = salario * 0.15;
        double dezporcento = salario * 0.1;
        double cincoporcento = salario * 0.5;

        if (salario <= 280){
            System.out.printf("O seu salário atual é R$:  %.0f\n", salario);
            System.out.println("O percentual de aumento aplicado foi: 20%");
            System.out.printf("O valor do aumento foi : R$ %.0f\n", vinteporcento);
            System.out.printf("Seu novo salário após o aumento é de: R$ %.0f\n", (vinteporcento + salario));
        } else if (salario > 280 && salario <= 700) {
            System.out.printf("O seu salário atual é: R$ %.0f\n", salario);
            System.out.println("O percentual de aumento aplicado foi: 15%");
            System.out.printf("O valor do aumento foi : R$ %.0f\n", quinzeporcento);
            System.out.printf("Seu novo salário após o aumento é de: R$ %.0f\n", (quinzeporcento + salario));
        } else if ( salario > 700 && salario <= 1500 ) {
            System.out.printf("O seu salário atual é: R$ %.0f\n", salario);
            System.out.println("O percentual de aumento aplicado foi: 10%");
            System.out.printf("O valor do aumento foi : R$ %.0f\n", dezporcento);
            System.out.printf("Seu novo salário após o aumento é de: R$ %.0f\n", (dezporcento + salario));
        } else if (salario > 1500) {
            System.out.printf("O seu salário atual é: R$ %.0f\n", salario);
            System.out.println("O percentual de aumento aplicado foi: 5%");
            System.out.printf("O valor do aumento foi : R$ %.0f\n", cincoporcento);
            System.out.printf("Seu novo salário após o aumento é de: R$ %.0f\n", (cincoporcento + salario));

        }
    }
}
