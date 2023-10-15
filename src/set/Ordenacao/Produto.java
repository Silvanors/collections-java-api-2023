package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    //atributos
    private String nome;
    private long codigo;
    private int quantidade;
    private double preco;


    //construtor
    public Produto(String nome, long codigo, int quantidade, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //Comparable
    @Override
    public int compareTo(Produto p) {
        return nome.compareTo(p.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    //Hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }


    //To String

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }

    //para utilizar o comparator deve-se criar uma classe implementando o "Comparator<>" e depois criar o
    //método
    static class ComparatorPorPreco implements Comparator<Produto> {
        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }
}
