package ConceptsOfProgramming.Assignment_2.Employee;

import java.util.Scanner;

public class TesterEmployee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Employee emp1 = new Employee();
        emp1.displayData();

        Employee emp2 = new Employee(101,"Kunal Kushwaha",null);
        emp2.displayData();
        emp2.acceptData(110,"Rohit Singh",null);
        emp2.displayData();

        Employee emp3 = new Employee();
        System.out.println("\nEnter Employee Id: ");
        int id = in.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = in.nextLine();

        emp3.acceptData(id,name,null);
        emp3.displayData();
    }

}
