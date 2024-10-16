import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Magasin petshop = new Magasin(500);

        Chien chien1 = new Chien();
        Chat chat1 = new Chat();

        int choix;

        System.out.println("\nLa tresorerie à actuelement " + petshop.getTresorerie() + "€");

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-- Menu --\nQue voulez vous faire ?");
            System.out.println("1. Acheter un chien");
            System.out.println("2. Acheter un chat");
            System.out.println("3. Acheter un chien et un chat");

            System.out.println("4. Vendre un chien");
            System.out.println("5. Vendre un chat");
            System.out.println("6. Vendre un chien et un chat");

            System.out.println("7. Afficher la tresorerie");
            System.out.println("8. Arret du programme");
            System.out.println("----------------\n");
            choix = scanner.nextInt();

            switch (choix) {
                case 1: //Acheter un chien
                    petshop.acheterAnimal(chien1);
                    System.out.println("Tresorerie est de " + petshop.getTresorerie() + "€ apres l'achat du chien.");
                    break;

                case 2: //Acheter un chat
                    petshop.acheterAnimal(chat1);
                    System.out.println("Tresorerie est de " + petshop.getTresorerie() + "€ apres l'achat du chat.");
                    break;

                case 3: // Acheter un chien et un chat
                    ArrayList<Animal> animauxAacheter = new ArrayList<>();
                    animauxAacheter.add(chien1);
                    animauxAacheter.add(chat1);
                    petshop.acheterPlusieursAnimaux(animauxAacheter);
                    System.out.println("La trésorerie est de " + petshop.getTresorerie() + "€ après l'achat du chien et du chat.");
                    break;

                case 4: //Vendre un chien
                    petshop.vendreAnimal(chien1);
                    System.out.println("Tresorerie est de " + petshop.getTresorerie() + "€ apres la vente du chien.");
                    break;

                case 5: //Vendre un chat
                    petshop.vendreAnimal(chat1);
                    System.out.println("Tresorerie est de " + petshop.getTresorerie() + "€ apres la vente du chat.");
                    break;

                case 6: // Vendre un chien et un chat
                    ArrayList<Animal> animauxAvendre = new ArrayList<>();
                    animauxAvendre.add(chien1);
                    animauxAvendre.add(chat1);
                    petshop.vendrePlusieursAnimaux(animauxAvendre);
                    System.out.println("La trésorerie est de " + petshop.getTresorerie() + "€ après la vente de plusieurs animaux.");
                    break;

                case 7: //Afficher la tresorerie
                    System.out.println("La tresorerie à actuelement " + petshop.getTresorerie() + "€" );
                    break;

                case 8: //Arret du programme
                    System.out.println("Fin du programme");
                    break;

                default:
                    System.out.println("-- Erreur de saisie --");
                    break;
            }
        }
        while(choix !=8);
    }
}
