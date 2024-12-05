package Ex1;

import java.time.LocalDate;

public class TesteData
{
    public static void main(String[] args)
    {
        // Objetos
        Data data = new Data(10, 2, 2006);
        Data data2 = new Data();


        System.out.println("Data: " + data);

        data.avancar(100);

        System.out.println("Data: " + data + " | Avançado 100 dias");

        data.retroceder(100);

        System.out.println("Data: " + data + " | Retrocedido 100 dias");

        System.out.println("Data Atual: " + data2);
    }
}
