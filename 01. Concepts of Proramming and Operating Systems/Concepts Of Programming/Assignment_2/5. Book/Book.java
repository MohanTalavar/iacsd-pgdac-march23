package ConceptsOfProgramming.Assignment_2.Book;

public class Book {
    private String bname;
    private int id;
    private String author;
    private int price;

    public void setBookName(String bname){
        this.bname = bname;
    }

    public String getBookName(){
        return bname;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public Book(){
        this.bname= "12 Rules for Life";
        this.id = 10001;
        this.author = "Dr. Jordan B. Peterson";
        this.price = 750;
    }

    public Book(String bname, int id, String author, int price){
        this.bname = bname;
        this.id = id;
        this.author = author;
        this.price = price;
    }

    public void displayData(){
        System.out.println("Book Name: " + bname);
        System.out.println("id: " + id);
        System.out.println("Author Name: " + author);
        System.out.println("Price: " + price);
    }

}
