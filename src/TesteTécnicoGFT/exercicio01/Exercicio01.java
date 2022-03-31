package TesteTécnicoGFT.exercicio01;

/*Crie uma classe para representar uma pessoa, com os atributos privados
        de nome, data de nascimento e altura. Crie os métodos públicos
        necessários para sets e gets e também um método para imprimir todos
        dados de uma pessoa. Crie um método para calcular a idade da pessoa.*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Exercicio01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Alexandre", "14/08/1990", 1.70);
        Pessoa pessoa2 = new Pessoa("Valdeci", "13/01/1969", 1.85);


        System.out.println(pessoa);
        System.out.println("Idade: " + idade(converterData(pessoa.getDataDeNascimento())) + " anos");

        System.out.println(pessoa2);
        System.out.println("Idade: " + idade(converterData(pessoa2.getDataDeNascimento())) + " anos");
    }

    public static LocalDate converterData(String data) {
        return LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public static int idade(LocalDate aniversario) {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(aniversario, hoje);
        return periodo.getYears();
    }
}
