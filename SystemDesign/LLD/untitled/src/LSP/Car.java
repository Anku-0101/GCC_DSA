package LSP;

public class Car extends Vehicle{
    @Override
    public int getNumberOfWheel() {
        return 4;
    }

    @Override
    public void StartEngine() {
        System.out.println("car Engine Started");
    }
}
