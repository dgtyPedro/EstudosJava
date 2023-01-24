import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;


public class Author {
    private static List<WeakReference<Author>> instances = new ArrayList<>();
    private static int authorCount = 0;
    private String name = "Desconhecido";
    private Book[] books;

    public Author(){
        authorCount++;
        instances.add(new WeakReference<Author>(this));
    }

    public static List<WeakReference<Author>> getInstances() {
        return instances;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }


}
