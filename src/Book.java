import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private static List<WeakReference<Book>> instances = new ArrayList<>();
    private static int bookCount = 0;
    private String title;
    private Author author = new Author();
    private int year;
    private int storage;
    private double price;

    public Book(String title, int year){
        bookCount++;
        instances.add(new WeakReference<Book>(this));
        this.title = title;
        this.year = year;
    }

    public static List<WeakReference<Book>> getInstances() {
        return instances;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
