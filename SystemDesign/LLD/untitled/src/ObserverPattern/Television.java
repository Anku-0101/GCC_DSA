package ObserverPattern;

public class Television implements Observer{
    private String weather;
    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }
    private void display(){
        System.out.println("displaying tv Weather = "+weather);
    }
}
