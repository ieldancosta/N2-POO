package Ex2;

public class TestePessoa
{
    public static void main(String[] args)
    {
        // Objetos
        Pessoa albert = new Pessoa("Albert Einstein", 14, 3, 1900);
        Pessoa isaac = new Pessoa("Isaac Newton", 4, 1, 1643);


        albert.calculaIdade();
        isaac.calculaIdade();

        System.out.println("Albert Einstein - idade: " + albert.informaIdade());
        System.out.println("Isaac Newton - idade: " + isaac.informaIdade());

        albert.ajustaDataDeNascimento(14, 3,  1879);
        albert.calculaIdade();

        System.out.println("\n" + albert);
        System.out.println("\n" + isaac);
    }
}
