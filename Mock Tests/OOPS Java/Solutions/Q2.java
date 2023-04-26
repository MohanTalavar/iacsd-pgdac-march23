// Q. Write a program to check whether two strings are Anagram or not.
package oops_mock;

import java.util.*;
public class Q2Anagram {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        // Asking user for 1st String
        System.out.println("Enter the first String: ");
        String str1 = in.nextLine();

        // Asking user for 2nd String
        System.out.println("Enter the second String: ");
        String str2 = in.nextLine();

        // Initializing a flag checker
        boolean flag = true;

        // First check condition
        if (str1.length() != str2.length()){
            System.out.println("Your Strings are not Anagram");
        }

        else{
            
            // Converting Strings to respecting Character Array
            char [] arr1 = str1.toCharArray();
            char [] arr2 = str2.toCharArray();

            // Using Array.sort() method to sort the array Alphabetically
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Using for loop to match the elements of both the Arrays
            for (int i=0; i<arr1.length; i++){
                
                // If the condition fails, changing the state of flag to false
                if (arr1[i] != arr2 [i]) {
                    flag = false;
                    break;
                }
            }

            // if the state of flag is true
            if (flag){
                System.out.println("Your Strings are Anagram");
            }
            // if the state of flag is false
            else {
                System.out.println("Your Strings are not Anagram");
            }
        }

    }
}
