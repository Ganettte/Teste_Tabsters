import java.util.ArrayList;

public class Magasin {
    private ArrayList<Animal> animaux;
    private double tresorerie;

    public Magasin(double tresorerie) {
        this.animaux = new ArrayList<>();
        this.tresorerie = tresorerie;
    }

    public double getTresorerie() {
        return tresorerie;
    }

    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void supprimerAnimal(Animal animal) {
        animaux.remove(animal);
    }

    public void acheterAnimal(Animal animal) {
        if (tresorerie >= animal.getPrix()) {
            tresorerie -= animal.getPrix();
            ajouterAnimal(animal);
            System.out.println(animal.getType() + " achete !");
        } else {
            System.out.println("Pas assez de fond pour acheter cet animal.");
        }
    }

    public void vendreAnimal(Animal animal) {
        if (animaux.contains(animal)) {
            tresorerie += animal.getPrix();
            supprimerAnimal(animal);
            System.out.println(animal.getType() + " vendu !");
        } else {
            System.out.println("Aucun " + animal.getType() + " disponible dans le magasin.");
        }
    }

    public void acheterPlusieursAnimaux(ArrayList<Animal> animauxAacheter) {
        double totalPrix = 0;
        for (Animal animal : animauxAacheter) {
            totalPrix += animal.getPrix();
        }

        if (tresorerie >= totalPrix) {
            tresorerie -= totalPrix;
            animaux.addAll(animauxAacheter);  // Ajoute tous les animaux à la liste
            System.out.println(animauxAacheter.size() + " animaux achetés !");
        } else {
            System.out.println("Pas assez de trésorerie pour acheter tous les animaux.");
        }
    }

    public void vendrePlusieursAnimaux(ArrayList<Animal> animauxAvendre) {
        double totalPrix = 0;
        ArrayList<Animal> animauxAretirer = new ArrayList<>();

        // Vérifie d'abord si tous les animaux à vendre sont disponibles dans le magasin
        for (Animal animal : animauxAvendre) {
            if (animaux.contains(animal)) {
                totalPrix += animal.getPrix();
                animauxAretirer.add(animal);  // Marque l'animal pour suppression après
            } else {
                System.out.println("Erreur : Aucun " + animal.getType() + " disponible pour la vente.");
                return;  // Si un animal manque, on arrête l'opération
            }
        }

        // Si tous les animaux sont disponibles, on les supprime et met à jour la trésorerie
        for (Animal animal : animauxAretirer) {
            animaux.remove(animal);  // Supprime l'animal du magasin
        }

        tresorerie += totalPrix;
        System.out.println(animauxAretirer.size() + " animaux vendus pour un total de " + totalPrix + "€ !");
    }




}
