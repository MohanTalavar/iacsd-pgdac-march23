package ConceptsOfProgramming.Assignment_3.com.app.tester;

import ConceptsOfProgramming.Assignment_3.com.app.org.Emp;
import ConceptsOfProgramming.Assignment_3.com.app.org.Mgr;
import ConceptsOfProgramming.Assignment_3.com.app.org.Worker;

import java.util.Scanner;

public class TestOrganization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of Employees in your Organization");
        int size = in.nextInt();

        int index = 0;

        Emp[] employee = new Emp[size];

        System.out.println("\nSelect your option of preference: ");
        System.out.println("1. Hire Manager");
        System.out.println("2. Hire Worker");
        System.out.println("3. Display information of all the Employees in the Organization");
        System.out.println("4. Update Basic Salary");
        System.out.println("10. Exit");
        int choice;
        do {
            System.out.println("\nEnter your choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    if (index < size) {
                        System.out.println("\nEnter the details of your Manager: ");
                        System.out.println("First Name:");
                        String f_name = in.nextLine();
                        in.nextLine();
                        System.out.println("Last Name:");
                        String l_name = in.nextLine();
                        in.nextLine();
                        System.out.println("Department Id:");
                        int deptId = in.nextInt();
                        System.out.println("Basic Salary:");
                        double sal = in.nextDouble();
                        System.out.println("Performance Bonus:");
                        double perfBonus = in.nextDouble();
                        employee[index] = new Mgr(f_name,l_name,deptId,sal,perfBonus);
                        index++;
                    } else {
                        System.out.println("Your organization is full");
                    }
                    break;

                case 2:
                    if (index < size) {
                        System.out.println("\nEnter the details of your Worker: ");
                        System.out.println("First Name:");
                        String f_name = in.nextLine();
                        in.nextLine();
                        System.out.println("Last Name:");
                        String l_name = in.nextLine();
                        in.nextLine();
                        System.out.println("Department Id:");
                        int deptId = in.nextInt();
                        System.out.println("Basic Salary:");
                        double sal = in.nextDouble();
                        System.out.println("Hours Worked:");
                        int hours_worked = in.nextInt();
                        System.out.println("Hourly Rate:");
                        int hourly_rate = in.nextInt();
                        employee[index] = new Worker(f_name,l_name,deptId,sal,hours_worked,hourly_rate);
                        index++;
                    } else {
                        System.out.println("Your organization is full");
                    }
                    break;

                case 3:
                    System.out.println("\nEmployees of your Organization:");
                    for (int i = 0; i < index; i++){
                        System.out.println(employee[i].toString());
                    }
                        break;

                case 4:
                    System.out.println("\nSelect who's Base Salary has to be changed: ");
                    for (int i = 0; i < index; i++){
                        System.out.print((i+1) + "." );
                        System.out.println(employee[i].toString());
                    }
                    int ch = in.nextInt();

                    if(ch>(index+1)){
                        System.out.println("Invalid selection");
                        break;
                    }
                    else{
                        System.out.println("Enter new Basic Salary: ");
                        ch--;
                        employee[ch].setBasic(in.nextDouble());

                        System.out.println("New salary is ₹" + employee[ch].getBasic());
                        break;
                    }

                case 10:
                    break;


                default:
                    System.out.println("\nInvalid Selection: Please select from the options mentioned below:");
                    System.out.println("1. Hire Manager");
                    System.out.println("Hire Worker");
                    System.out.println("Display information of all the Employees in the Organization");
                    break;
            }
        } while (choice != 10);


    }
}
