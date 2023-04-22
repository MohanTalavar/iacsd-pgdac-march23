package ConceptsOfProgramming.Assignment_2.NewStudent;

import ConceptsOfProgramming.Assignment_2.Student.Student;

import java.util.Scanner;

public class TesterNewStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        NewStudent ahad = new NewStudent("Ahad","Wardha");
        NewStudent tushar = new NewStudent("Tushar","Nashik");
        NewStudent mohan = new NewStudent("Mohan","Pune");
        NewStudent pranay = new NewStudent("Pranay","Miraj");
        NewStudent kunal = new NewStudent("Kunal","Delhi");

        ahad.displayData();
        tushar.displayData();
        mohan.displayData();
        pranay.displayData();
        kunal.displayData();

        NewStudent [] stud = new NewStudent[5];

        for(int i=0 ; i<5 ; i++){
            System.out.println("\nEnter the Name and Address of the Student: ");
            String name = in.nextLine();
            String address = in.nextLine();
            stud[i] = new NewStudent(name,address);
        }
        System.out.println("\n");

        for (int i=0 ; i<5 ; i++){
            System.out.println(stud[i].getName());
        }
    }
}
