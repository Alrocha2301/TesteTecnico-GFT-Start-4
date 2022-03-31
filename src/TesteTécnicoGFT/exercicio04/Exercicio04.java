package TesteTécnicoGFT.exercicio04;

/*
A idade permitida para doar sangue é entre 18 e 67 anos. Faça um
        aplicativo que pergunte a idade de uma pessoa e diga se ela pode doar
        sangue ou não. Use alguns dos operadores lógicos OU (||) e E (&&).
*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        if (idade < 18 || idade > 67){
            System.out.print("Idade ");
            if (idade < 18) {
                System.out.println("abaixo da permitida para doação de sangue!");
            }
             else {
                System.out.println("acima da permitida para doação de sangue!");
            }
        }
        else {
            System.out.println("Idade dentro da faixa etária permitida para doação!");
        }
    }
}
