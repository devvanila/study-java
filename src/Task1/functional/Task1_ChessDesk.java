package Task1.functional;

public class Task1_ChessDesk {

    private static void printChessDesk(int height, int widht) {
      for(int i = 0; i < height; i++) {
          for(int y = 0; y < widht; y++) {
              if(y % 2 == 0 || y == 0) {
                  System.out.print("*");
              } else {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
    }

    public static void main (String [] args) {
        printChessDesk(5, 7);
    }


}
