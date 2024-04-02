package section_18.t_18_20;

import java.nio.CharBuffer;
import java.util.Arrays;

public class Main {
    private static final int MAZE_SIZE = 12;
    private static final char[][] maze = new char[MAZE_SIZE][];

    public static void main(String[] args) {
        String mazeText = """
                # # # # # # # # # # # #
                # . . . # . . . . . . #
                . . # . # . # # # # . #
                # # # . # . . . . # . #
                # . . . . # # # . # . .
                # # # # . # . # . # . #
                # . . # . # . # . # . #
                # # . # . # . # . # . #
                # . . . . . . . . # . #
                # # # # # # . # # # . #
                # . . . . . . # . . . #
                # # # # # # # # # # # #
                """;
        String[] rows = mazeText.split("\n");
        for (int i = 0; i < rows.length; i++) {
            maze[i] = rows[i].replaceAll(" ", "").toCharArray();
        }

        if (mazeTraveler(2, 0))
            System.out.println("It have a exit!");
        else
            System.out.println("It have not a exit!");

    }

    public static void printMaze(char[][] maze) {
        System.out.println();
        Arrays.stream(maze)
                .forEach(row -> {
                    CharBuffer.wrap(row).chars()
                            .forEach(element -> System.out.printf("%c ", element));
                    System.out.println();
                });
    }

    public static boolean mazeTraveler(int x, int y) {

        maze[x][y] = 'x';

        //right
        if (isWall(x, y + 1)) {
            maze[x][y + 1] = 'x';

            if (y + 1 == MAZE_SIZE -1 ) {
                printMaze(maze);
                return true;
            }

            if (mazeTraveler(x, y + 1))
                return true;
        }

        //up
        if (isWall(x - 1, y)) {
            maze[x - 1][y] = 'x';
            if (mazeTraveler(x - 1, y))
                return true;
        }

        //left
        if (isWall(x, y - 1)) {
            maze[x][y - 1] = 'x';
            if (mazeTraveler(x, y - 1))
                return true;
        }

        //down
        if (isWall(x + 1, y)) {
            maze[x + 1][y] = 'x';
            if (x + 1 == MAZE_SIZE-1) {
                printMaze(maze);
                return true;
            }

            if (mazeTraveler(x + 1, y))
                return true;
        }

        maze[x][y] = '0';
        return false;
    }

    public static boolean isWall(int x, int y) {
        if (y >= 0 &&
                y < MAZE_SIZE &&
                x >= 0 &&
                x < MAZE_SIZE) {
            return !(maze[x][y] == '#' || maze[x][y] == 'x' || maze[x][y] == '0');
        } else {
            return false;
        }
    }
}
