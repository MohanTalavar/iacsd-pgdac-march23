package ConceptsOfProgramming.Assignment_2.Student;

import java.util.Scanner;

public class TesterStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student ahad = new Student();
        Student tushar = new Student();

        ahad.acceptInfo("Ahad",93,76,64);
        ahad.displayInfo();

        tushar.acceptInfo("Tushar",78,84,92);
        tushar.displayInfo();

    }

}
