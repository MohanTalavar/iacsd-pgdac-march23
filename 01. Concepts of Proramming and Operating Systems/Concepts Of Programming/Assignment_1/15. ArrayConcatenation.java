package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class ArrayConcatenation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of 1st Array: ");
        int size = in.nextInt();
        int [] arr1 = new int[size];
        System.out.println("Enter the Elements of the 1st Array: ");
        for (int i=0 ; i<arr1.length ; i++){
            arr1[i] = in.nextInt();
        }

        System.out.println("Enter the size of 2nd Array: ");
        size = in.nextInt();
        int [] arr2 = new int[size];
        System.out.println("Enter the Elements of the 2nd Array: ");
        for (int i=0 ; i<arr2.length ; i++){
            arr2[i] = in.nextInt();
        }

        size = arr1.length + arr2.length;
        int [] big_arr = new int[size];

        for(int i=0 ; i<arr1.length ; i++){
            big_arr[i] = arr1[i];
        }
        for (int i = 0; i<arr2.length ; i++) {
            big_arr[arr1.length + i] = arr2[i];
        }

        System.out.println("The combined Array is: ");
        for (int i=0; i<big_arr.length ; i++){
            System.out.print(big_arr[i] + " ");
        }
    }
}
