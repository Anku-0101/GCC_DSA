package DecoratorPattern;

public class FarmHouse extends BasePizza {
    public FarmHouse(){
        description = "Farm House";
    }
    @Override
    public int getCost() {
        return 15;
    }
}
