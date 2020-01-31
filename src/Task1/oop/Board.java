package Task1.oop;

import java.util.Scanner;

public class Board {

    static final String MAIN_INVITATION = "You can define width and height of chess desk to be painted";
    static final String CHESSBOARD_WIDTH = "Please type Rectangle's width: ";
    static final String CHESSBOARD_HEIGHT = "Please type Rectangle's height:";


    private static int width;
    private static int height;
    private static String BLACK_CELL = "*";
    private static String WHITE_CELL = " ";

    Board () {
        this.width = 5;
        this.height = 7;
    }

    Board(int width, int height) {
        this.width = width;
        this.height = height;
    }

    static int getCorrectUserInput (Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("You should type a valid number");
            scanner.next();
        }
        return scanner.nextInt();
    }
     private static void printCell(String cell) {
         System.out.print(cell);
     }

     void print() {
         for (int i = 0; i < this.height; i++) {
             for (int y = 0; y < this.width; y++) {
                 if ((i + y) % 2 == 0) {
                     printCell(BLACK_CELL);
                 } else {
                     printCell(WHITE_CELL);
                 }
             }
             System.out.println();
         }
     }
}
