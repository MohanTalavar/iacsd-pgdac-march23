package ConceptsOfProgramming.Assignment_3.com.app.org;

public class Worker extends Emp{

    private int hoursWorked;
    private int hourlyRate;
    public Worker(String firstName, String lastName, int deptId, double basic, int hoursWorked, int hourlyRate){
        super(firstName,lastName,deptId,basic);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString(){
        return "\nEmployee name: " + firstName + " " + lastName + "\nEmployee Id: " + empId + "\nDepartment Id: " + deptId;
    }

    @Override
    public void computeNetSalary(){
        System.out.println("Salary: ₹" + (basic + (hoursWorked*hourlyRate)));
    }

    public int getHourlyRate(){
        return hourlyRate;
    }

}
