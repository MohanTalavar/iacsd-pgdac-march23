package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = in.nextInt();

        int esum = 0;
        int osum = 0;
        while(num != 0){
            if (num%2 == 0){
                esum += num;
            }
            else{
                osum += num;
            }
            num--;
        }

        System.out.println("Sum of even numbers is: " + esum);
        System.out.println("Sum of odd numers is: " + osum);
    }
}
