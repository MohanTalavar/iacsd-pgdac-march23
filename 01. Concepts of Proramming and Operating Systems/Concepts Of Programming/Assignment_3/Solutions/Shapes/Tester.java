package ConceptsOfProgramming.Assignment_3.abstractMethod;

import java.util.Scanner;

import static ConceptsOfProgramming.Assignment_3.abstractMethod.ShapeFactory.generateShape;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int run = 0;

        while(run !=5){
            int num = generateShape();

            switch (num){
                case 1:
                    System.out.println("\nShape generated: Circle");
                    Circle circle = new Circle();
                    System.out.println("Enter the radius of the Circle: ");
                    circle.setRadius(in.nextInt());
                    System.out.println("Area of your circle is: " + circle.area());
                    run++;
                    break;

                case 2:
                    System.out.println("\nShape generate: Rectangle");
                    Rectangle rectangle = new Rectangle();
                    System.out.println("Enter the Width of the Rectangle: ");
                    rectangle.setW(in.nextInt());
                    System.out.println("Enter the Height of the Rectangle: ");
                    rectangle.setH(in.nextInt());
                    System.out.println("Area of your Rectangle is: " + rectangle.area());
                    run++;
                    break;

                case 3:
                    System.out.println("\nShape generated: Square");
                    Square square = new Square();
                    System.out.println("Enter the length of the side of the Square: ");
                    square.setSide(in.nextInt());
                    System.out.println("Area of the Square is: " + square.area());
                    run++;
                    break;

                default:
                    System.out.println("\nShape not formed. Please try again!");
                    run++;
                    break;
            }
        }


    }
}
