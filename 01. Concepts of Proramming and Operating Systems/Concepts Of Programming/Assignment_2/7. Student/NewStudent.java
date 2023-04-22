package ConceptsOfProgramming.Assignment_2.NewStudent;

public class NewStudent {
    private int roll_no;
    private String name;
    private String address;
    private static int counter;

    static {
        counter = 2303000;
    }

    public NewStudent(String name , String address){
        counter++;

        this.roll_no = counter;
        this.name = name;
        this.address = address;

    }

    public int getRoll_no(){
        return roll_no;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void displayData(){
        System.out.println("Name: " + this.name);
        System.out.println("Roll no.: " + this.roll_no);
        System.out.println("Address: " + this.address);
    }
}
