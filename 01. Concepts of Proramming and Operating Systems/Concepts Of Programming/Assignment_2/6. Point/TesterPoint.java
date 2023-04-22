package ConceptsOfProgramming.Assignment_2.Point;

import java.util.Scanner;

public class TesterPoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Point p1 = new Point();
        int x = p1.getX();
        System.out.println("Value of X: " + x);

        int y = p1.getY();
        System.out.println("Value of Y: " + y);

        Point p2 = new Point();
        p2.setX(92);
        p2.setY(109);

        p2.displayData();
    }
}
