package ConceptsOfProgramming.Assignment_2.Student;

public class Student {
    private int roll_no;
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;
    private static int counter;

    static {
        counter = 233000;
    }



    public void acceptInfo(String name, int marks1, int marks2, int marks3){

        counter++;
        this.roll_no = counter;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;

    }

    public void displayInfo(){
        System.out.println("\nStudent name: " + this.name);
        System.out.println("Roll no.: " + this.roll_no);
        System.out.println("Marks in\nSubject1: " + marks1);
        System.out.println("Subject2: " + marks2);
        System.out.println("Subject3: " + marks3);
        System.out.println("Total Marks scored: " + (marks1+marks2+marks3));

        double percentage = (marks1 + marks2 + marks3)/3;
        System.out.println("Percentage obtained: " + percentage + "%");

        if (percentage<=100 && percentage>90){
            System.out.println("Grade obtained: A+");
        }

        if (percentage<=90 && percentage>80){
            System.out.println("Grade obtained: A");
        }

        if (percentage<=80 && percentage>70){
            System.out.println("Grade obtained: B");
        }

        if (percentage<=70 && percentage>60){
            System.out.println("Grade obtained: C");
        }

        if (percentage<=600 && percentage>50){
            System.out.println("Grade obtained: D");
        }

        if (percentage<=50 && percentage>40){
            System.out.println("Grade obtained: E");
        }

        if (percentage<=40){
            System.out.println("Grade obtained: F");
        }
    }
}
