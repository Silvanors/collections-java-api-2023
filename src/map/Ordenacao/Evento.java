package map.Ordenacao;

public class Evento {
    //atributos
    private String nome;
    private String atracao;

    //construtor

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    //get

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    //To String

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
