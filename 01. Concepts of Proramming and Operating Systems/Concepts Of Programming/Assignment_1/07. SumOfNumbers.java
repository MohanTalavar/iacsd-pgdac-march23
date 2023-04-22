package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = in.nextInt();

        int sum = num*(num+1)/2;

        System.out.println("The sum till " + num + " numbers is: " + sum);
    }
}
