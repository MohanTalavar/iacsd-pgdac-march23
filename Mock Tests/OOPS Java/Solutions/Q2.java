// Q. Write a program to check whether two strings are Anagram or not.
package oops_mock;

import java.util.*;
public class Q2Anagram {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.println("Enter the first String: ");
        String str1 = in.nextLine();

        System.out.println("Enter the second String: ");
        String str2 = in.nextLine();

        boolean flag = true;

        if (str1.length() != str2.length()){
            System.out.println("Your Strings are not Anagram");
        }

        else{
            char [] arr1 = str1.toCharArray();
            char [] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for (int i=0; i<arr1.length; i++){
                if (arr1[i] != arr2 [i]) {
                    flag = false;
                }
            }

            if (flag){
                System.out.println("Your Strings are Anagram");
            }
            else {
                System.out.println("Your Strings are not Anagram");
            }
        }

    }
}
