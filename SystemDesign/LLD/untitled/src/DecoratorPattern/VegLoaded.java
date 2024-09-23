package DecoratorPattern;

public class VegLoaded extends BasePizza {
    public VegLoaded(){
        description= "Veg Loaded";
    }
    @Override
    public int getCost() {
        return 20;
    }
}
