package Ex3;

public class TesteUniversidade
{
    public static void main(String[] args)
    {
        // Objetos
        Pessoa albert = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa isaac = new Pessoa("Isaac Newton", 4, 1, 1643);
        Pessoa daniel = new Pessoa("Daniel Lopes", 10, 2, 2006);

        Universidade gamic = new Universidade("Gamic");
        Universidade princeton = new Universidade("Princeton", albert);
        Universidade cambridge = new Universidade("Cambridge", isaac);


        albert.calculaIdade();
        isaac.calculaIdade();
        daniel.calculaIdade();

        System.out.println("Albert - universidade: " + albert.informaUniversidade());
        System.out.println("Isaac - universidade: " + isaac.informaUniversidade());

        daniel.setUniversidade(gamic);

        System.out.println("\n" + albert);
        System.out.println("\n" + isaac);
        System.out.println("\n" + daniel);
    }
}
