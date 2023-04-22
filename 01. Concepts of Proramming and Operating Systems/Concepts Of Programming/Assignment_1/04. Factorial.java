package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");

        int  fact=1;
        
        //asking user for input
        int num = in.nextInt();

        //using while loop to multiply the all the numbers that come before the input to get the factorial value
        while(num!=0){
            fact*=num;
            num--;
        }
        //printing output
        System.out.println("The Factorial of your number is: " + fact);
    }
}
