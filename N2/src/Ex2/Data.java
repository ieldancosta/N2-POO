package Ex2;

import java.time.LocalDate;

public class Data
{
    // Atributos
    private int dia;
    private int mes;
    private int ano;

    public int getDia()
    {
        return dia;
    }

    public void setDia(int dia)
    {
        this.dia = dia;
    }

    public int getMes()
    {
        return mes;
    }

    public void setMes(int mes)
    {
        this.mes = mes;
    }

    public int getAno()
    {
        return ano;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }


    // Construtor
    public Data(int dia, int mes, int ano)
    {
        /* Verificação e Inicialização */

        // Mês e Dia
        if (mes >= 1 && mes <= 12)
        {
            this.mes = mes;

            if (mes < 8)
            {
                if (mes == 2) // Fevereiro
                {
                    this.dia = dia < 1 || dia > 28 ? 1 : dia;
                }
                else if (mes % 2 == 0)
                {
                    this.dia = dia < 1 || dia > 30 ? 1 : dia;
                }
                else if (mes % 2 != 0)
                {
                    this.dia = dia < 1 || dia > 31 ? 1 : dia;
                }
            }
            else
            {
                if (mes % 2 == 0)
                {
                    this.dia = dia < 1 || dia > 31 ? 1 : dia;
                }
                else if (mes % 2 != 0)
                {
                    this.dia = dia < 1 || dia > 30 ? 1 : dia;
                }
            }
        }
        else
        {
            this.dia = 1;
            this.mes = 1;
        }

        // Ano
        this.ano = ano < 1 ? 1 : ano;
    }

    // Construtor sem parâmetros
    public Data()
    {
        LocalDate dataAtual = LocalDate.now();
        this.dia = dataAtual.getDayOfMonth();
        this.mes = dataAtual.getMonthValue();
        this.ano = dataAtual.getYear();
    }


    // Método ToString
    public String toString()
    {
        return String.format("%d / %d / %d", dia, mes, ano);
    }


    // Método para Avançar Dias
    public void avancar(int dias)
    {
        this.dia = this.dia + dias;

        while(true)
        {
            if (mes < 8)
            {
                if (mes == 2) // Fevereiro
                {
                    if (this.dia > 28)
                    {
                        this.dia = this.dia - 28;
                        this.mes = this.mes + 1;
                    }
                    else if (this.dia >= 1 && this.dia <= 28)
                    {
                        break;
                    }
                }
                else if (mes % 2 == 0)
                {
                    if (this.dia > 30)
                    {
                        this.dia = this.dia - 30;
                        this.mes = this.mes + 1;
                    }
                    else if (this.dia >= 1 && this.dia <= 30)
                    {
                        break;
                    }
                }
                else if (mes % 2 != 0)
                {
                    if (this.dia > 31)
                    {
                        this.dia = this.dia - 31;
                        this.mes = this.mes + 1;
                    }
                    else if (this.dia >= 1 && this.dia <= 31)
                    {
                        break;
                    }
                }
            }
            else
            {
                if (mes % 2 == 0)
                {
                    if (this.dia > 31)
                    {
                        this.dia = this.dia - 31;
                        this.mes = this.mes + 1;
                    }
                    else if (this.dia >= 1 && this.dia <= 30)
                    {
                        break;
                    }
                }
                else if (mes % 2 != 0)
                {
                    if (this.dia > 30)
                    {
                        this.dia = this.dia - 30;
                        this.mes = this.mes + 1;
                    }
                    else if (this.dia >= 1 && this.dia <= 31)
                    {
                        break;
                    }
                }
            }
        }
    }


    // Método para Retroceder Dias
    public void retroceder(int dias)
    {
        int retrocesso = dias;

        while (true)
        {
            if (mes < 8)
            {
                if (this.mes == 3)
                {
                    if (this.dia - retrocesso > 1)
                    {
                        this.dia = this.dia - retrocesso;
                        break;
                    }
                    else
                    {
                        retrocesso = retrocesso - this.dia;
                        this.dia = 28;
                        this.mes = this.mes - 1;
                    }
                }
                else if (this.mes % 2 == 0)
                {
                    if (this.dia - retrocesso > 1)
                    {
                        this.dia = this.dia - retrocesso;
                        break;
                    }
                    else
                    {
                        retrocesso = retrocesso - this.dia;
                        this.dia = 31;
                        this.mes = this.mes - 1;
                    }
                }
                else if (this.mes % 2 != 0)
                {
                    if (this.dia - retrocesso > 1)
                    {
                        this.dia = this.dia - retrocesso;
                        break;
                    }
                    else
                    {
                        retrocesso = retrocesso - this.dia;
                        this.dia = 30;
                        this.mes = this.mes - 1;
                    }
                }
            }
            else
            {
                if (this.mes % 2 == 0)
                {
                    if (this.dia - retrocesso > 1)
                    {
                        this.dia = this.dia - retrocesso;
                        break;
                    }
                    else
                    {
                        retrocesso = retrocesso - this.dia;
                        this.dia = 30;
                        this.mes = this.mes - 1;
                    }
                }
                else if (this.mes % 2 != 0)
                {
                    if (this.dia - retrocesso > 1)
                    {
                        this.dia = this.dia - retrocesso;
                        break;
                    }
                    else
                    {
                        retrocesso = retrocesso - this.dia;
                        this.dia = 31;
                        this.mes = this.mes - 1;
                    }
                }
            }
        }
    }
}
