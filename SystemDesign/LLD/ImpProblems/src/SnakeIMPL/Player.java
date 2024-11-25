package SnakeIMPL;

public class Player implements Observer {
    private String name;
    private int position;

    public Player(String name){
        this.name = name;
        this.position = 0;
    }

    public String getName(){
        return name;
    }

    public int getPosition(){
        return position;
    }

    public void setPosition(int position){
        this.position = position;
    }
    @Override
    public void update(String message) {
        System.out.println(name + " : "+message);
    }
}
