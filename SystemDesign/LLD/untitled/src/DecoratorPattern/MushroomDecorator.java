package DecoratorPattern;

public class MushroomDecorator extends ToppingsDecorator{
    public MushroomDecorator(BasePizza pizza){
        super(pizza);
    }

    @Override
    public int getCost() {
        return super.getCost()+2;
    }

    @Override
    public String getDescription() {
        description = pizza.description+" ,Mushroom Toppings";
        return description;
    }
}
