package Task1.oop;

public class Board {
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
