package Ex3;

import java.time.LocalDate;

public class Pessoa
{
    // Atributos
    private String nome;
    private int idade;
    private Data dataDeNascimento;
    private Universidade universidade;

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Data getDataDeNascimento()
    {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Data dataDeNascimento)
    {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Universidade getUniversidade()
    {
        return universidade;
    }

    public void setUniversidade(Universidade universidade)
    {
        this.universidade = universidade;
    }


    // Construtor
    public Pessoa(String nome, int dia, int mes, int ano)
    {
        this.nome = nome;
        this.dataDeNascimento = new Data(dia, mes, ano);
    }


    // Métodos
    public void calculaIdade()
    {
        LocalDate dataAtual = LocalDate.now();

        int anoDiferenca = (dataAtual.getYear() - this.dataDeNascimento.getAno()) - 1;

        if (dataAtual.getMonthValue() > this.dataDeNascimento.getMes() || dataAtual.getMonthValue() == this.dataDeNascimento.getMes() && dataAtual.getDayOfMonth() > this.dataDeNascimento.getDia())
        {
            anoDiferenca++;
        }

        this.idade = anoDiferenca;
    }

    public int informaIdade()
    {
        return this.idade;
    }

    public String informaNome()
    {
        return this.nome;
    }

    public String informaUniversidade()
    {
        return this.universidade.getNome();
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano)
    {
        this.dataDeNascimento.setDia(dia);
        this.dataDeNascimento.setMes(mes);
        this.dataDeNascimento.setAno(ano);
    }

    public String toString()
    {
        return String.format("Nome: %s\nIdade: %d\nData de Nascimento: %s\nUniversidade: %s", this.nome, this.idade, this.dataDeNascimento, this.universidade.getNome());
    }
}
