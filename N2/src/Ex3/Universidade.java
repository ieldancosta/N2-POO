package Ex3;

public class Universidade
{
    // Atributos
    private String nome;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }


    // Construtor
    public Universidade(String nome)
    {
        this.nome = nome;
    }

    public Universidade(String nome, Pessoa trabalhador)
    {
        this.nome = nome;
        trabalhador.setUniversidade(this);
    }


    // Métodos
    public String informaNome()
    {
        return this.nome;
    }
}
