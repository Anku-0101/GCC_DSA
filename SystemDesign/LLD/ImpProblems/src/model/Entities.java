package model;

import java.util.HashMap;

public class Entities {
    static HashMap<Integer, Integer> snakes;
    static HashMap<Integer, Integer> ladders;
    static HashMap<Integer, String> players;
    static Entities instance = null;

    private Entities(){
        snakes = new HashMap<>();
        ladders = new HashMap<>();
        players = new HashMap<>();
    }

    public void setSnake(int startPosition, int endPosition){
        snakes.put(startPosition, endPosition);
    }

    public HashMap<Integer, Integer> getSnakes(){
        return snakes;
    }

    public void setLadders(int startPosition, int endPosition){
        ladders.put(startPosition, endPosition);
    }

    public HashMap<Integer, Integer> getLadders(){
        return ladders;
    }

    public void setPlayer(int id, String playerName){
        players.put(id, playerName);
    }

    public HashMap<Integer, String> getPlayers(){
        return players;
    }

    public static Entities getInstance(){
        return instance == null ? instance = new Entities():instance;
    }
}
