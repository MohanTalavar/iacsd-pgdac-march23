package ConceptsOfProgramming.Assignment_2.Book;

import java.util.Scanner;

public class BookTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Book b1 = new Book();
        String bname = b1.getBookName();
        System.out.println("Book Name: " + bname);

        int id = b1.getId();
        System.out.println("Book Id: " + id);

        String author = b1.getAuthor();
        System.out.println("Author Name: " + author);

        int price = b1.getPrice();
        System.out.println("Price: " + price);

        Book b2 = new Book();
        b2.setBookName("Trust me I am lying");
        b2.setId(10002);
        b2.setAuthor("Ryan Holiday");
        b2.setPrice(650);

        b2.displayData();

        Book b3 = new Book("Harry Porter and the Order of Pheonix",10501,"J. K. Rowling",975);
        b3.displayData();

    }
}
