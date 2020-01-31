package Task2.oop;

import java.util.Scanner;

public class ApplicationEntry {
    public static void main (String [] args) {
        System.out.println(Envelops.MAIN_ENTRANCE_INTRO);

        System.out.println(Envelops.RECTANGLE_WIDTH);
        Scanner scanner  = new Scanner(System.in);
        double rectangleSide1 = Envelops.getCorrectUserInput(scanner);
        System.out.println(Envelops.RECTANGLE_HEIGHT);
        double rectangleSide2 = Envelops.getCorrectUserInput(scanner);

        Envelop envelop1 = new Envelop(rectangleSide1, rectangleSide2);

        System.out.println(Envelops.NEXT_RECTANGLE_REQUEST);
        System.out.println(Envelops.RECTANGLE_WIDTH);
        rectangleSide1 = Envelops.getCorrectUserInput(scanner);
        System.out.println(Envelops.RECTANGLE_HEIGHT);
        rectangleSide2 = Envelops.getCorrectUserInput(scanner);

        Envelop envelop2 = new Envelop(rectangleSide1, rectangleSide2);

        Envelop.compare(envelop1, envelop2);
    }
}
