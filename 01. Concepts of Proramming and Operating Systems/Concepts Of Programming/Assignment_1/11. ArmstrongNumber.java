package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = in.nextInt();
        int n = num;
        int a_num = 0;

        while(n!=0){
            int temp = n%10;
            a_num += temp * temp * temp;
            n/=10;
        }
        if(num!=a_num){
            System.out.println("Your number is not an Armstrong Number");
        }
        else{
            System.out.println("Your number is an Armstrong Number");
        }
    }
}
