public abstract class Animal {
    //---Variables
    protected double prix;
    protected String type;


    public Animal(double prix, String type) {
        this.prix = prix;
        this.type = type;
    }
    public abstract double getPrix();
    public abstract String getType();
}

//---Classe Chien---
class Chien extends Animal {
    public Chien() {
        super(100, "Chien");
    }

    @Override
    public double getPrix() {
        return prix;
    }

    @Override
    public String getType() {
        return type;
    }
}

//---Classe Chat
class Chat extends Animal {
    public Chat() {
        super(110, "Chat");
    }

    @Override
    public double getPrix() {
        return prix;
    }

    @Override
    public String getType() {
        return type;
    }
}
