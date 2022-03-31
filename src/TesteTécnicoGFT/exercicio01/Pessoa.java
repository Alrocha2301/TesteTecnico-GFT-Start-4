package TesteTécnicoGFT.exercicio01;

/*Crie uma classe para representar uma pessoa, com os atributos privados
        de nome, data de nascimento e altura. Crie os métodos públicos
        necessários para sets e gets e também um método para imprimir todos
        dados de uma pessoa. Crie um método para calcular a idade da pessoa.*/

public class Pessoa {

    private String nome;
    private String dataDeNascimento;
    private Double altura;

    public Pessoa(String nome, String dataDeNascimento, Double altura) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa: Nome: " + nome + " - Data de Nascimento: " + dataDeNascimento +
                " - Altura: " + altura + "m";
    }
}
