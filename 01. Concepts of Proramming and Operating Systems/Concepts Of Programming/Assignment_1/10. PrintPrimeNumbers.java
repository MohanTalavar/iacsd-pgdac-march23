package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = in.nextInt();

        System.out.println("Prime numbers between 0 and " + num + " are: ");

        int counter = 0;
        while(num!=1){
            counter = 0;
            for (int i=2 ; i<num ; i++){
                if (num%i == 0){
                    counter++;
                    break;
                }
            }
            if (counter==0) {
                System.out.print(num + " ");
            }
            num--;
        }

    }
}
