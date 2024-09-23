package DecoratorPattern;

public class Paneer extends ToppingsDecorator{
    public Paneer(BasePizza pizza){
        super(pizza);
    }

    @Override
    public int getCost() {
        return super.getCost()+4;
    }

    @Override
    public String getDescription() {
        description = pizza.description+", Paneer Toppings";
        return description;
    }
}
