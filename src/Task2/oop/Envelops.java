package Task2.oop;

import java.util.Scanner;

class Envelops {

    static final String MAIN_ENTRANCE_INTRO = "We are going to receive input of two envelops from you to check of one of them " +
            "can fit into another";
    static final String RECTANGLE_WIDTH = "Please type Rectangle's width: ";
    static final String RECTANGLE_HEIGHT = "Please type Rectangle's height:";
    static final String NEXT_RECTANGLE_REQUEST = "Now give us size of next envelop";

    static Double getCorrectUserInput (Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("You should type a valid number");
            scanner.next();
        }
        return scanner.nextDouble();
    }


}
