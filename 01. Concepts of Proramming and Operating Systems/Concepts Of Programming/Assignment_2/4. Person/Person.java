package ConceptsOfProgramming.Assignment_2.Person;

public class Person {
    private String name;
    private int age;
    private String city;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return city;
    }

    public void displayData(){
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
        System.out.println("City: " + city);
    }

    public Person(){
        this.name = "Kunal Kushwaha";
        this.age = 24;
        this.city = "London";
    }

    public Person(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }
}
