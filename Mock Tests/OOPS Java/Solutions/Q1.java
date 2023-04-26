// Q1. Write a program to find index of second last occurrence of a character in a given string.
package oops_mock;

import java.util.Scanner;

public class Q1Occurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String str = in.nextLine();

        System.out.println("Enter the character you wish to look for: ");
        char ch = in.next().charAt(0);

        int index1 = -1, index2 = -1;

        char[] arr = str.toCharArray();

        for (int i=0; i<arr.length; i++){
            if (ch == arr[i]){
                index2 = index1;
                index1 = i;
            }
        }

        if (index1 == -1){
            System.out.println("Character not present in the given String");
        }

        if (index1 != -1 && index2 == -1) {
            System.out.println("There are no two occurrence of your Character in the given String");
        }

        if (index1 != -1 && index2 != -1){
            System.out.println("The last second occurrence of your Character in the given String is at index: " + index2);
        }

    }
}
