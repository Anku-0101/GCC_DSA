package DecoratorPattern;

public class Margerita extends BasePizza {
    public Margerita(){
        description = "Margerita";
    }
    @Override
    public int getCost() {
        return 10;
    }
}
