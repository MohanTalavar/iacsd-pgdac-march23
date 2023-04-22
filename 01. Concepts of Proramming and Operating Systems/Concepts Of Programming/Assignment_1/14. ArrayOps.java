package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class ArrayOps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of your Array: ");
        int size = in.nextInt();
        int [] arr = new int[size];

        System.out.println("Select the operation you want to perform on your Array: ");
        System.out.println("1. Enter the elements of the Array");
        System.out.println("2. Print Array");
        System.out.println("3. Search an element in the Array");
        System.out.println("4. Reverse Array");
        System.out.println("5. Find Even numbers in the Array");
        System.out.println("6. Sum of all the numbers in the Array");
        System.out.println("7. Exit");

        int choice;

        do {
            System.out.println("\nEnter your choice: ");
            choice = in.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Enter the elements of your Array: ");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = in.nextInt();
                    }
                    System.out.println("The Array is full");
                    break;

                case 2:
                    System.out.println("The Values in the Array are: ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    break;

                case 3:
                    System.out.println("Enter the number you want to search in the Array: ");
                    int num = in.nextInt();
                    int counter = 0;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == num) {
                            System.out.println(num + " is in the Array");
                            counter=0;
                            break;
                        } else {
                            counter++;
                        }

                    }
                    if (counter != 0) {
                        System.out.println(num + " is not in the Array");
                    }
                    break;

                case 4:
                    int[] rev_arr = new int[size];
                    int j = size;
                    for (int i = 0; i < arr.length; i++) {
                        j--;
                        rev_arr[j] = arr[i];
                    }
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = rev_arr[j];
                        j++;
                    }
                    System.out.println("Your Array has been reversed. The reversed Array is: ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    break;

                case 5:
                    System.out.println("The even numbers in the Array are: ");
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 == 0) {
                            System.out.println(arr[i] + " ");
                        }
                    }
                    break;

                case 6:
                    int sum = 0;
                    for (int i = 0; i < arr.length; i++) {
                        sum += arr[i];
                    }
                    System.out.println("Sum of all the elements of the Array is: " + sum);
                    break;

                case 7:
                    break;

                default:
                    System.out.println("Invalid selection, Please select from the following operations:");
                    System.out.println("Select the operation you want to perform on your Array: ");
                    System.out.println("1. Enter Array");
                    System.out.println("2. Print Array");
                    System.out.println("3. Search an element in the Array");
                    System.out.println("4. Reverse Array");
                    System.out.println("5. Find Even numbers in the Array");
                    System.out.println("6. Sum of all the numbers in the Array");
                    System.out.println("7. Exit");
                    break;
            }

        } while(choice != 7);
    }
}
