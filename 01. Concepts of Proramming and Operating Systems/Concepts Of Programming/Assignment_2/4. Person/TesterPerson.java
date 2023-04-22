package ConceptsOfProgramming.Assignment_2.Person;

import java.util.Scanner;

public class TesterPerson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Person person1 = new Person();
        String name = person1.getName();
        int age = person1.getAge();
        String city = person1.getCity();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        Person person2 = new Person();
        person2.setName("Rohit Singh");
        person2.setAge(34);
        person2.setCity("Brahmpton");

        person2.displayData();

        Person person3 = new Person("Akash Umate",24,"California");
        person3.displayData();
    }
}
