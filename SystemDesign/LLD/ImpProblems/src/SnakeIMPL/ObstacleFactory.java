package SnakeIMPL;

import java.util.List;

public class ObstacleFactory {
    public static void createSnakes(Board board, List<int[]> snakes){
        for(var snake : snakes){
            board.addSnake(snake[0], snake[1]);
        }
    }

    public static void createLadders(Board board, List<int[]> ladders){
        for(int[] ladder : ladders){
            board.addLadder(ladder[0], ladder[1]);
        }
    }
}
