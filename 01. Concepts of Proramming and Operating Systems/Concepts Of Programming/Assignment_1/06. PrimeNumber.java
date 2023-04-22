package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");

        int num = in.nextInt();
        boolean flag = true;

        for (int i=2 ; i<=num/2 ; i++){
            if(num%i == 0){
                flag = false;
                break;
            }
        }
        if(flag = true){
            System.out.println("The number " + num + " is a Prime number");
        }
        else{
            System.out.println("The number " + num + " is not a Prime number");
        }
    }
}
