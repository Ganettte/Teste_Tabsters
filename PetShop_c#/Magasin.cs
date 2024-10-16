using System;
using System.Collections.Generic;

public class Magasin
{
    private double tresorerie;
    private List<Animal> animaux;

    public Magasin(double tresorerieInitiale)
    {
        tresorerie = tresorerieInitiale;
        animaux = new List<Animal>();
    }

    public void AcheterAnimal(Animal animal)
    {
        if (tresorerie >= animal.GetPrix())
        {
            tresorerie -= animal.GetPrix();
            animaux.Add(animal);
            Console.WriteLine(animal.GetType() + " acheté pour " + animal.GetPrix() + "e.");
        }
        else
        {
            Console.WriteLine("Pas assez d'argent pour acheter un " + animal.GetType());
        }
    }

    public void VendreAnimal(Animal animal)
    {
        if (animaux.Contains(animal))
        {
            tresorerie += animal.GetPrix();
            animaux.Remove(animal);
            Console.WriteLine(animal.GetType() + " vendu pour " + animal.GetPrix() + "e.");
        }
        else
        {
            Console.WriteLine("Aucun " + animal.GetType() + " disponible à la vente.");
        }
    }


 // Acheter plusieurs animaux
    public void AcheterAnimaux(List<Animal> nouveauxAnimaux)
    {
        foreach (Animal animal in nouveauxAnimaux)
        {
            if (tresorerie >= animal.GetPrix())
            {
                animaux.Add(animal);
                tresorerie -= animal.GetPrix();
                Console.WriteLine("Vous avez acheté un " + animal.GetAnimalType() + " pour " + animal.GetPrix() + "e.");
            }
            else
            {
                Console.WriteLine("Pas assez de trésorerie pour acheter un " + animal.GetAnimalType() + ".");
            }
        }
        //Console.WriteLine("Tresorerie restante : " + tresorerie + "€.");
    }

    // Vendre plusieurs animaux
    public void VendreAnimaux(List<Animal> animauxAVendre)
    {
        foreach (Animal animal in animauxAVendre)
        {
            if (animaux.Contains(animal))
            {
                animaux.Remove(animal);
                tresorerie += animal.GetPrix();
                Console.WriteLine("Vous avez vendu un " + animal.GetAnimalType() + " pour " + animal.GetPrix() + "e.");
            }
            else
            {
                Console.WriteLine("Ce " + animal.GetAnimalType() + " n'est pas disponible à la vente.");
            }
        }
        //Console.WriteLine("Tresorerie après vente : " + tresorerie + "€.");
    }


    public double GetTresorerie()
    {
        return tresorerie;
    }
}
