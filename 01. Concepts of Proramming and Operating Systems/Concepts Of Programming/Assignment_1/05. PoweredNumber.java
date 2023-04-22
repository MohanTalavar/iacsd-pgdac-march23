package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class PoweredNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = in.nextInt();

        System.out.print("\nEnter the power to your number: ");
        int pow = in.nextInt();
        int pw=1;
        for (int i=0;i<pow;i++)
        {
            pw*=num;
        }
        System.out.println("\nThe answer of "+num+"^"+pow+" is :"+ pw);
    }
}
