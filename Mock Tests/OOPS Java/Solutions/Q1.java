// Q. Write a program to find index of second last occurrence of a character in a given string.
package oops_mock;

import java.util.Scanner;

public class Q1Occurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Asking user for String
        System.out.println("Enter your string: ");
        String str = in.nextLine();

        // Asking user for Character to be searched for
        System.out.println("Enter the character you wish to look for: ");
        char ch = in.next().charAt(0);

        // Declaration of index variables
        int index1 = -1, index2 = -1;

        // Converting the provided String into Character Array
        char[] arr = str.toCharArray();

        // Using for loop to parse through the Array
        for (int i=0; i<arr.length; i++){
            
            // Using If condition to look if the Character at arr[i] matches our Character
            if (ch == arr[i]){
                
                // Storing the index values in the varibles
                index2 = index1;
                index1 = i;
            }
        }

        // If the Character doesn't exist in the given String
        if (index1 == -1){
            System.out.println("Character not present in the given String");
        }

        // If the Character only exists once in the given String
        if (index1 != -1 && index2 == -1) {
            System.out.println("There are no two occurrence of your Character in the given String");
        }

        // Printing the second last index of the occurrence of the Character in the given String
        if (index1 != -1 && index2 != -1){
            System.out.println("The last second occurrence of your Character in the given String is at index: " + index2);
            
            // We printed index2 as it stored the index of the second last occurrence of the Character in the given String
        }

    }
}
