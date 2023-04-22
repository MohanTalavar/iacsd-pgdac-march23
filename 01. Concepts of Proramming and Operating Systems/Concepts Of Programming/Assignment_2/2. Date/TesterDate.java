package ConceptsOfProgramming.Assignment_2.Date;

import java.util.Scanner;

public class TesterDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Date d = new Date();
        System.out.println("Enter the Day, Month and Year:");

        System.out.print("Day:");
        int date = in.nextInt();

        System.out.print("Month:");
        int month = in.nextInt();

        System.out.print("Year");
        int year = in.nextInt();

         d.acceptDate(date,month,year);
         d.printDate();

    }
}
