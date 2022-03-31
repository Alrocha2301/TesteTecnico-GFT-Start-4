package TesteTécnicoGFT.exercicio03;

/*Algumas crianças super inteligentes estão vendendo sucos com a seguinte
        tabela de descontos: (vale 3 pontos)
        Suco de Limão:
        • Até 2 litros : desconto de 3% por litro
        • Acima de 5 litros: Desconto de 5% por litro.
        Suco de Tamarindo:
        • Até 2 litros : desconto de 4% por litro
        • Acima de 5 litros: Desconto de 6% por litro.
        Escreva um algoritmo que leia o número de litros vendidos, o tipo de suco
        (codificado da seguinte forma: L-limão. T-tamarindo), calcule e imprima o
        valor a ser pago pelo cliente.*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        supondo que o preço seja R$ 2,50 o litro
        Double precoSuco = 2.50;
        System.out.print("Selecione o suco: (L - Limão) ou (T - Tamarindo): ");
        String suco = scan.next();
        System.out.print("Digite a quantidade em litros: ");
        Double litros = Double.parseDouble(scan.next());


        switch (suco) {
            case "L":
                if (litros <= 2) {
                    System.out.printf("Preço: R$ %.2f", (precoSuco * litros) * 0.97);
                } else if (litros > 5) {
                    System.out.printf("Preço: R$ %.2f", (precoSuco * litros) * 0.95);
                } else
                    System.out.printf("Preço: R$ %.2f", (precoSuco * litros));
                break;
            case "T":
                if (litros <= 2) {
                    System.out.printf("Preço: R$ %.2f", (precoSuco * litros) * 0.96);
                } else if (litros > 5) {
                    System.out.printf("Preço: R$ %.2f", (precoSuco * litros) * 0.94);
                } else
                    System.out.printf("Preço: R$ %.2f" + (precoSuco * litros));
                break;
        }
    }
}
