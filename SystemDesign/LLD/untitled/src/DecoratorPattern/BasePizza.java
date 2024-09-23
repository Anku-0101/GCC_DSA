package DecoratorPattern;

public abstract class BasePizza {
    public String description = "Unknown Pizza";
    public abstract int getCost();
    public String getDescription(){
        return description;
    }
}
