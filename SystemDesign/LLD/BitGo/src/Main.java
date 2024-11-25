import java.util.*;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player player1 = new Player("Aman");
        Player player2 = new Player("Mohan");
        Player player3 = new Player("Suman");

        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);

        Board board = new Board(100);

        BoardItemFactory.createSnakes(board, Arrays.asList(new int[][]{
                {97, 52},
                {37, 9},
                {54, 21},
                {62, 21},
                {21, 4},
                {81, 32},
                {78, 37},
                {79, 16}
        }));

        BoardItemFactory.createLadders(board, Arrays.asList(new int[][]{
                {4, 81},
                {8, 37},
                {22, 60},
                {16, 42},
                {42, 97},
                {51, 90},
                {24, 62},
                {27, 79}
        }));
        game.startGame(board);
    }
}

 class  Board{
    //private static Board instance;
    private int size;
    private Map<Integer, Integer> snakes;
    private Map<Integer, Integer> ladders;

    public Board(int size){
        this.size = size;
        this.snakes = new HashMap<>();
        this.ladders = new HashMap<>();
    }

    public int getSize(){
        return size;
    }
    public void addSnake(int start, int end){
        snakes.put(start, end);
    }
    public void addLadder(int start, int end){
        ladders.put(start, end);
    }

    public Map<Integer, Integer> getSnakes(){
        return snakes;
    }

    public Map<Integer, Integer> getLadders(){
        return ladders;
    }
}

class BoardItemFactory{
    public static void createSnakes(Board board, List<int[]> snakes){
        for(int[] snake : snakes)
            board.addSnake(snake[0], snake[1]);
    }

    public static void createLadders(Board board, List<int[]> ladders){
        for(int[] ladder : ladders)
            board.addLadder(ladder[0], ladder[1]);
    }
}

class Dice{
    private Random random;

    public Dice(){
        this.random = new Random();
    }

    public int rollDice(){
        return random.nextInt(6)+1;
    }
}

class Player{
    private String Name;
    private int position;

    public Player(String Name){
        this.Name = Name;
        position = 0;
    }

    public String getName(){
        return this.Name;
    }

    public int getPosition(){
        return position;
    }

    public void SetPosition(int newPosition){
        this.position = newPosition;
    }
}

class Game{
    List<Player> players;
    int currentPlayerIndex;
    Dice dice;

    public Game(){
        this.players = new ArrayList<>();
        this.currentPlayerIndex = 0;
        this.dice = new Dice();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public Player getCurrentPlayer(){
        return players.get(currentPlayerIndex);
    }

    public void nextTurn(){
        currentPlayerIndex = (currentPlayerIndex+1)%players.size();
    }

    public void startGame(Board board){


        while(true){
            Player player = getCurrentPlayer();
            int diceOutcome = dice.rollDice();

            System.out.println("Current Player : " + player.getName());
            System.out.println("Current Pos : " + player.getPosition());
            System.out.println("Player got : " + diceOutcome + " on the dice");

            MoveCommand moveCommand = new MoveCommand(player, diceOutcome, board);
            moveCommand.execute();
            if(player.getPosition() == board.getSize()){
                System.out.println("Player : " + player.getName() +" has won the game");
                break;
            }
            System.out.println("Final Pos: " + player.getPosition());
            nextTurn();
        }

    }
}

class MoveCommand{
    private Player player;
    private int steps;
    private Board board;

    public MoveCommand(Player player, int steps, Board board){
        this.player = player;
        this.steps = steps;
        this.board = board;
    }

    public void execute(){
        int newPosition = player.getPosition()+steps;
        if(newPosition > board.getSize()){
            newPosition = player.getPosition();
        }

        while(true){
            if(board.getSnakes().containsKey(newPosition)){
                System.out.println("Snake encountered at " +  newPosition + " taking the player to " + board.getSnakes().get(newPosition));
                newPosition = board.getSnakes().get(newPosition);
            }else if(board.getLadders().containsKey(newPosition)){
                System.out.println("Ladder encountered at " +  newPosition + " taking the player to " + board.getLadders().get(newPosition));
                newPosition = board.getLadders().get(newPosition);
            }else{
                break;
            }
        }

        player.SetPosition(newPosition);
    }
}
