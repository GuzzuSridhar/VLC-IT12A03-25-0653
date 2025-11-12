package classesandobjects;

public class Book {
    String title;
    String author;
    String genre;
    int pages;

    // default constructor present inherent
    public Book() {
        System.out.println("Default constructor called");
    }

    public Book(String title, String author, String genre, int pages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    public static void main(String[] args) {
        Book b1 = new Book(); // invoking a constructor (default constructor)
        Book b2 = new Book(); // invoking a constructor (default constructor)

        Book b3 = new Book("Java", "Bill", "Tech", 512);
        Book b4 = new Book("python", "Alex", "Tech", 658);
    }

}
