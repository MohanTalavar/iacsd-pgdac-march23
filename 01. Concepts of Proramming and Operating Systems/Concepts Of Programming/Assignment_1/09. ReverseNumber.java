package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = in.nextInt();

        int new_num = 0;

        while(num != 0){
            new_num += num%10;
            new_num *= 10;
            num /= 10;
        }

        System.out.println("Your number in reverse order is: " + new_num/10);
    }
}
