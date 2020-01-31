package Task1.oop;

public class SheetForPainting {

    public static void main (String []args) {
        Board board = new Board();
        board.print();
        System.out.println("Board 2");
        Board board1 = new Board(10, 20);
        board1.print();
    }
}
