/*
    Decorator pattern adds additional responsibility to the current object at runtime
*/

public abstract class Beverage
{
    String beverageName;;

    String GetBeverageName()
    {
        return beverageName;
    }


    public abstract int GetBeveragePrice();
} 