// Constructors Example
class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell");
        book.display();
    }
}
