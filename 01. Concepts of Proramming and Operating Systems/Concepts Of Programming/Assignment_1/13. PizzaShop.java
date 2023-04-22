package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class PizzaShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to A&T's Pizza shop. Please select your choice from the Menu given below:\n");
        System.out.println("1. Add Pizza to your order");
        System.out.println("2. View cart total");
        System.out.println("3. Checkout/Exit");

        int choice;
        int order;
        int total = 0;
        int pizza1 = 150;
        int pizza2 = 300;
        int pizza3 = 550;

        do {
            System.out.println("Please enter your choice: ");
            choice = in.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Select which Pizza you would like to add to your order");
                    System.out.println("1. Pizza1 = ₹150\n2. Pizza2 = ₹300\n3. Pizza3 = ₹550");
                    order = in.nextInt();

                    switch (order) {
                        case 1:
                            total += pizza1;
                            break;
                        case 2:
                            total += pizza2;
                            break;
                        case 3:
                            total += pizza3;
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Your Total is: " + total);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid Selection Please choice from the following:");
                    System.out.println("1. Add Pizza to your order");
                    System.out.println("2. View cart total");
                    System.out.println("3. Checkout/Exit");
            }
        }
        while(choice !=3);

    }
}
