import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static boolean run = true;

    static List<WeakReference<Book>> books = Book.getInstances();
    public static void main(String[] args) {
        System.out.println("Welcome.");
        Book bookTest = new Book("Test", 2023);
        Book myBook = new Book("Berserk", 1989);
        while (run){
            Menu();
        }
    }

    public static void Menu(){
        System.out.println("1- See books");
        System.out.println("2- See authors");
        System.out.println("0- Quit");
        int option = scanner.nextInt();
        switch (option){
            case 0:
                run = false;
                break;
            case 1:
                seeBooks();
                break;
        }
    }

    public static void seeBooks(){
        System.out.println("");
        System.out.println("See Books:");
        int i = 1;
        for (WeakReference<Book> ref : books) {
            Book book = ref.get();
            if (book != null) {
                System.out.println(i + "- " + book.getTitle());
                i++;
            }
        }
        System.out.println("Which Book do you want to select? (0 to go back)");
        int bookI = scanner.nextInt();
        if(bookI == 0){
            Menu();
        }else{
            BookMenu(bookI);
        }
    }

    public static void BookMenu(int bookI){
        System.out.println("1- See Info");
        System.out.println("2- Edit Price");
        System.out.println("3- Edit Storage");
        System.out.println("0- Go Back");
        int option = scanner.nextInt();
        switch (option){
            case 0:
                seeBooks();
                break;
            case 1:
                seeInfoBook(bookI);
                break;
            case 2:
                editPrice(bookI);
                break;
            case 3:
                editStorage(bookI);
        }
    }

    public static void seeInfoBook(int bookI) {
        Book book = null;
        int i = 1;
        for (WeakReference<Book> ref : books) {
            if (i == bookI) {
                book = ref.get();
                break;
            }
        }
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getYear());
        System.out.println(book.getPrice());
        System.out.println(book.getStorage());
        BookMenu(bookI);
    }

    public static void editPrice(int bookI) {
        System.out.println("Add new price.");
        double newPrice = scanner.nextDouble();
        int i = 1;
        for (WeakReference<Book> ref : books) {
            if (i == bookI) {
                Book book = ref.get();
                book.setPrice(newPrice);
                break;
            }
        }
        BookMenu(bookI);
    }

    public static void editStorage(int bookI) {
        System.out.println("Edit the Storage.");
        int newStorage = scanner.nextInt();
        int i = 1;
        for (WeakReference<Book> ref : books) {
            if (i == bookI) {
                Book book = ref.get();
                book.setStorage(newStorage);
                break;
            }
        }
        BookMenu(bookI);
    }
}