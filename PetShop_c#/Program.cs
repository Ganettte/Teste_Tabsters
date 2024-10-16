using System;

class Program
{
    static void Main(string[] args)
    {
        // Initialissation du magasin
        Magasin petshop = new Magasin(500);

        // Création des objetcs chien et chat
        Chien chien1 = new Chien();
        Chien chien2 = new Chien();
        Chat chat1 = new Chat();
        Chat chat2 = new Chat();


        
        Console.WriteLine("La trésorerie initiale est de " + petshop.GetTresorerie() + "e.\n");

        Console.WriteLine("---Achat du chien 1---");
        petshop.AcheterAnimal(chien1);
        Console.WriteLine("La trésorerie après achat du chien est de " + petshop.GetTresorerie() + "e.\n");

        Console.WriteLine("---Achat du chat 1---");
        petshop.AcheterAnimal(chat1);
        Console.WriteLine("La trésorerie après achat du chat est de " + petshop.GetTresorerie() + "e.\n");

        Console.WriteLine("---Vente du chien 1---");
        petshop.VendreAnimal(chien1);
        Console.WriteLine("La trésorerie après vente du chien est de " + petshop.GetTresorerie() + "e.\n");

        Console.WriteLine("---Vente du chat 1---");
        petshop.VendreAnimal(chat1);
        Console.WriteLine("La trésorerie après vente du chat est de " + petshop.GetTresorerie() + "e.\n");

        Console.WriteLine("---Achat du chien 2 et du chat 2---");
        List<Animal> animauxAAcheter = new List<Animal> { chien2, chat2 };
        petshop.AcheterAnimaux(animauxAAcheter);
        Console.WriteLine("La trésorerie après achat du chien et du chat est de " + petshop.GetTresorerie() + "e.\n");


        Console.WriteLine("---Vente du chien 2 et du chat 2---");
        List<Animal> animauxAVendre = new List<Animal> { chien2, chat2 };
        petshop.VendreAnimaux(animauxAVendre);
        Console.WriteLine("La trésorerie après vente du chien et du chat est de " + petshop.GetTresorerie() + "e.\n");

    }
}
