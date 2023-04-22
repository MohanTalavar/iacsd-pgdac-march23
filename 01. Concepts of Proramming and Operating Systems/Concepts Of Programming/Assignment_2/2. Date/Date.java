package ConceptsOfProgramming.Assignment_2.Date;

public class Date {
    private int day, month, year;

    public void acceptDate (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printDate (){
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}
