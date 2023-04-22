package ConceptsOfProgramming.Assignment_3.com.app.org;

public class Emp {
    protected int empId;
    protected String firstName;
    protected String lastName;
    protected int deptId;
    protected double basic;

    private static int counter;

    static{
        counter = 2303000;
    }

    public Emp(String firstName, String lastName, int deptId, double basic){
        counter++;
        this.empId = counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptId = deptId;
        this.basic = basic;
    }

    @Override
    public String toString(){
        return "\nEmployee name: " + firstName + " " + lastName + "\nEmployee Id: " + empId + "\nDepartment Id: " + deptId;
    }

    public void computeNetSalary(){
        System.out.println("Salary: ₹" + basic);
    }

    public void setBasic(double basic){
        this.basic = basic;
    }

    public double getBasic(){
        return basic;
    }

}
