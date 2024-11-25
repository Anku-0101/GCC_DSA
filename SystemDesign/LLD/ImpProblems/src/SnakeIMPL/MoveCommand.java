package SnakeIMPL;

public class MoveCommand implements Command{
    private Player player;
    private int steps;
    private Board board;

    public MoveCommand(Player player, int steps, Board board){
        this.player = player;
        this.steps = steps;
        this.board = board;
    }
    @Override
    public void execute() {
        int newPosition = player.getPosition()+steps;
        if(newPosition > board.getSize()){
            newPosition = board.getSize();
        }
        if(board.getSnakes().containsKey(newPosition)){
            newPosition = board.getSnakes().get(newPosition);
        } else if (board.getLadders().containsKey(newPosition)) {
            newPosition = board.getLadders().get(newPosition);
        }
        player.setPosition(newPosition);
    }
}
