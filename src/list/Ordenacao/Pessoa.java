package list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    //atributos
    String nome;
    int idade;
    double altura;

    //construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //Método Comparable usando generics, sem especificar a Classe em <>

    /*@Override
    public int compareTo(Object o) {
        return 0;
    }*/
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }


    /*Class ComparatorPorAltura implements Comparator<Pessoa> {

    }*/
}
    class ComparatorPorAltura implements Comparator<Pessoa> {

        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return Double.compare(p1.getAltura(), p2.getAltura());
        }
    }



