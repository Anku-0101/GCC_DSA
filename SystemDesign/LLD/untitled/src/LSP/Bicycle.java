package LSP;

public class Bicycle extends Vehicle{
    @Override
    public int getNumberOfWheel() {
        return 2;
    }

    @Override
    public void StartEngine() throws IllegalAccessException {
        throw new IllegalAccessException();
    }
}
