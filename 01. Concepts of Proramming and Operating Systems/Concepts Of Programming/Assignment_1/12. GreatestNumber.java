package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the 3 numbers you want to compare");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if (num1>num2){
            if (num1>num3){
                System.out.println("The greatest number is: " + num1);
            } else if (num3>num2) {
                System.out.println("The greatest number is: " + num3);
            }
        } else if (num2>num3) {
            System.out.println("The greates number is: " + num2);
        }else {
            System.out.println("The greatest number is: " + num3);
        }
    }
}
