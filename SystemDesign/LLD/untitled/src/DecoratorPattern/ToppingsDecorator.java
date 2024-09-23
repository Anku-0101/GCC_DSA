package DecoratorPattern;

// It has both Is-A and Has-A relationship
public abstract class ToppingsDecorator extends BasePizza {
    protected BasePizza pizza;
    ToppingsDecorator(BasePizza pizza){
        this.pizza = pizza;
    }
    public abstract String getDescription();

    @Override
    public int getCost() {
        return pizza.getCost();
    }
}
