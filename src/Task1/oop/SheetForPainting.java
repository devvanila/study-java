package Task1.oop;

import java.util.Scanner;

public class SheetForPainting {

    public static void main (String []args) {
        System.out.println(Board.MAIN_INVITATION);
        System.out.println(Board.CHESSBOARD_WIDTH);
        Scanner scanner = new Scanner(System.in);
        int width  = Board.getCorrectUserInput(scanner);
        System.out.println(Board.CHESSBOARD_HEIGHT);
        int height  = Board.getCorrectUserInput(scanner);
        Board board = new Board(width, height);
        board.print();
    }
}
