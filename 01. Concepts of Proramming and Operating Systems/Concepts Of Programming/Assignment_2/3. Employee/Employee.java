package ConceptsOfProgramming.Assignment_2.Employee;

import ConceptsOfProgramming.Assignment_2.Date.Date;

public class Employee {
    private int id;
    private String name;
    private Date dob;

    public Employee(int id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public Employee(){
        this.id = 106;
        this.name = "Abhimanyu Kashyaps";
    }

    public void acceptData(int id, String name, Date dob){
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public void displayData(){
        System.out.println("Employee Id: " + id );
        System.out.println("Employee Name: " + name);
        System.out.println("Date of Birth: " + dob);
    }
}


