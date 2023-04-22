package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers to add: \n");
        // asking user for inputs
        int a = in.nextInt();
        int b = in.nextInt();
        
        // performing addition
        int c = a + b;
        
        //printing output
        System.out.println("The sum of the two numbers is: " + c);
    }
}
