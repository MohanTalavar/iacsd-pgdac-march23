package ConceptsOfProgramming.Assignment_3.com.app.tester;

import ConceptsOfProgramming.Assignment_3.com.app.fruits.Fruit;
import ConceptsOfProgramming.Assignment_3.com.app.fruits.Apple;
import ConceptsOfProgramming.Assignment_3.com.app.fruits.Mango;
import ConceptsOfProgramming.Assignment_3.com.app.fruits.Orange;

import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of Fruits in your Basket: ");
        int num = in.nextInt();

        System.out.println("Select from the menu mentioned below:");
        System.out.println("1. Add Mango");
        System.out.println("2. Add Orange");
        System.out.println("3. Add Apple");
        System.out.println("4. Display Names of all Fruits in the Basket");
        System.out.println("5. Display Name, Colour, Weight, Taste of all Fresh Fruits in the basket");
        System.out.println("6. Mark a Fruit as Stale");
        System.out.println("7. Mark all Sour Fruits as Stale");
        System.out.println("8. Make Mango Pulp, Orange Juice or Apple Jam");

       Fruit [] fruit = new Fruit[num];
       int index = 0;
       int choice;

        do {
            System.out.println("\nEnter your choice");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    if (index < (num)) {
                        System.out.println("\nEnter the details of your Fruit(Mango): ");
                        System.out.println("Name: \nWeight: \nColour: \nFresh(Boolean): ");
                        fruit[index] = new Mango(in.next(), in.nextDouble(), in.next(), in.nextBoolean());
                        index ++;
                    }
                    else{
                        System.out.println("Your Basket is full");
                    }
                    break;

                case 2:
                    if (index < (num)) {
                        System.out.println("\nEnter the details of your Fruit(Orange): ");
                        System.out.println("Name: \nWeight: \nColour: \nFresh(Boolean): ");
                        fruit[index] = new Orange(in.next(), in.nextDouble(), in.next(), in.nextBoolean());
                        index ++;
                    }
                    else{
                        System.out.println("Your Basket is full");
                    }
                    break;
                case 3:
                    if (index < (num)) {
                        System.out.println("\nEnter the details of your Fruit(Apple): ");
                        System.out.println("Name: \nWeight: \nColour: \nFresh(Boolean): ");
                        fruit[index] = new Apple(in.next(), in.nextDouble(), in.next(), in.nextBoolean());
                        index ++;
                    }
                    else{
                        System.out.println("Your Basket is full");
                    }
                    break;

                case 4:
                    System.out.println("\nBelow are the names of all the fruits in your Basket: ");
                    for (Fruit f: fruit) {
                        if (f!=null) {
                            System.out.println("Name of Fruit: " + f.getName());
                        }
                    }
                    break;

                case 5:
                    System.out.println("\nBelow are the Details of all the Fresh Fruits in your Baskets: ");
                    for (int i=0; i<index; i++)
                        if (fruit[i].getFresh()) {
                            System.out.println(fruit[i].toString());
                            System.out.println(fruit[i].taste());
                        }
                    break;

                case 6:
                    System.out.println("Select which Fruit you want to mark as Stale:");
                    for (int i=0; i<index; i++) {
                        System.out.println((i+1) + ". " + "Name of Fruit: " + fruit[i].getName());
                    }

                    System.out.println("Enter your selection: ");
                    int sel = in.nextInt();
                    fruit[sel-1].setFresh(false);
                    System.out.println(fruit[sel-1].getName() + " has been marked as Stale");
                    break;

                case 7:
                    System.out.println("The following Fruits that were Sour have been marked as Stale");
                    for (int i=0; i<index; i++) {
                        if(fruit[i].taste().equals("Sour") || fruit[i].taste().equals("sour")){
                            fruit[i].setFresh(false);
                            System.out.println(fruit[i].getName());
                        }
                    }

                    break;

                case 8:
                    System.out.println("Select the fruit of your choice to perform Fruit-specific function: ");

                    for (int i=0; i<index; i++) {
                        System.out.println((i+1) + ". " + "Name of Fruit: " + fruit[i].getName());
                    }

                    System.out.println("Enter your selection: ");
                    sel = in.nextInt();

                    if(fruit[(sel-1)] instanceof Apple) {
                        ((Apple) fruit[(sel - 1)]).jam();
                    }

                    if(fruit[(sel-1)] instanceof Mango){
                        ((Mango) fruit[(sel - 1)]).pulp();
                    }

                    if(fruit[(sel-1)] instanceof Orange){
                        ((Orange) fruit[(sel - 1)]).juice();
                    }

                    break;

                case 10:
                    break;

                default:
                    System.out.println("Invalid Selection, Please select from the menu below:");
                    System.out.println("1. Add Mango");
                    System.out.println("2. Add Orange");
                    System.out.println("3. Add Apple");
                    System.out.println("4. Display Names of all Fruits in the Basket");
                    System.out.println("5. Display Name, Colour, Weight, Taste of all Fresh Fruits in the basket");
                    System.out.println("6. Mark a Fruit as Stale");
                    System.out.println("7. Mark all Sour Fruits as Stale");
                    System.out.println("8. Make Mango Pulp, Orange Juice or Apple Jam");

                    break;

            }
        }while (choice != 10) ;

    }
}
