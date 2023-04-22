package ConceptsOfProgramming.Assignment_3.com.app.org;

public class Mgr extends Emp{

    private double perfBonus;

    public Mgr(String firstName, String lastName, int deptId, double basic, double perfBonus) {
        super(firstName, lastName, deptId, basic);
        this.perfBonus = perfBonus;
    }

    @Override
    public String toString(){
        return "\nEmployee name: " + firstName + " " + lastName + "\nEmployee Id: " + empId + "\nDepartment Id: " + deptId;
    }

    @Override
    public void computeNetSalary(){
        System.out.println("Salary: ₹" + basic+perfBonus);
    }

    public void getPerfBonus(){
        System.out.println("Performance Bonus: ₹" + perfBonus);
    }

}
