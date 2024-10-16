using System;

public abstract class Animal
{
    public abstract double GetPrix();
    public abstract string GetAnimalType();
}

public class Chien : Animal
{
    public override double GetPrix()
    {
        return 100;
    }

    public override string GetAnimalType()
    {
        return "Chien";
    }
}

public class Chat : Animal
{
    public override double GetPrix()
    {
        return 110;
    }

    public override string GetAnimalType()
    {
        return "Chat";
    }
}
