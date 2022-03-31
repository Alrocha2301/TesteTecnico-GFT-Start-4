package TesteTécnicoGFT.exercicio02;

/*Faça um programa que pergunte em que turno você Trabalha.
        Peça para digitar: (vale 3 pontos)
        M-matutino
        V-vespertino
        N-noturno.
        Imprima a mensagem “Bom dia!” ou “Boa Tarde” ou “Boa Noite” ou “Valor
        inválido”, conforme o caso.*/


import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o turno em que trabalha: \nM-matutino\nV-vespertino\nN-noturno.");
        String turno = scan.next();

        switch (turno) {
            case "M":
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "N":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Inválido!");
        }
    }
}
