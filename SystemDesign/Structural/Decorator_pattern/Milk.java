public class Milk extends IngridientDecorator{
    Beverage beverage;

    public Milk(Beverage beverage_)
    {
        this.beverage = beverage_;
    }

    @override
    string GetBeverageName()
    {
        return beverage.GetBeverageName() + " With Milk";
    }

    @override
    int GetBeveragePrice()
    {
        return beverage.GetBeveragePrice() + 2;
    }
}

// Similarly other addons can be added 