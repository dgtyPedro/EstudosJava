import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static boolean run = true;
    public static void main(String[] args) {
        System.out.println("Welcome.");
        Book bookTest = new Book("Test", 2023);
        while (run){
            Menu();
        }
        Book myBook = new Book("Berserk", 1989);
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
            case 2:
                seeAuthors();
                break;
        }
    }

    public static void BookMenu(){
        System.out.println("1- See Info");
        System.out.println("2- Edit Price");
        System.out.println("3- Edit Storage");
        System.out.println("0- Go Back");
        int option = scanner.nextInt();
        switch (option){
//            case 0:
//                run = false;
//                break;
//            case 1:
//                seeBooks();
//                break;
//            case 2:
//                seeAuthors();
//                break;
        }
    }

    public static void InspectBookMenu(){
        System.out.println("1- See Info");
        System.out.println("2- Edit Price");
        System.out.println("3- Edit Storage");
        System.out.println("0- Go Back");
        int option = scanner.nextInt();
        switch (option){
//            case 0:
//                run = false;
//                break;
//            case 1:
//                seeBooks();
//                break;
//            case 2:
//                seeAuthors();
//                break;
        }
    }

    public static void AuthorMenu(){
        System.out.println("1- See Info");
        System.out.println("2- Edit Price");
        System.out.println("3- Edit Storage");
        System.out.println("0- Go Back");
        int option = scanner.nextInt();
        switch (option){
//            case 0:
//                run = false;
//                break;
//            case 1:
//                seeBooks();
//                break;
//            case 2:
//                seeAuthors();
//                break;
        }
    }

    public static void InspectAuthorMenu(){
        System.out.println("1- See Info");
        System.out.println("2- Edit Price");
        System.out.println("3- Edit Storage");
        System.out.println("0- Go Back");
        int option = scanner.nextInt();
        switch (option){
//            case 0:
//                run = false;
//                break;
//            case 1:
//                seeBooks();
//                break;
//            case 2:
//                seeAuthors();
//                break;
        }
    }

    public static void YearMenu(){
        System.out.println("1- See Info");
        System.out.println("2- Edit Price");
        System.out.println("3- Edit Storage");
        System.out.println("0- Go Back");
        int option = scanner.nextInt();
        switch (option){
//            case 0:
//                run = false;
//                break;
//            case 1:
//                seeBooks();
//                break;
//            case 2:
//                seeAuthors();
//                break;
        }
    }

    public static void seeBooks(){
        System.out.println("");
        System.out.println("See Books:");
        List<WeakReference<Book>> books = Book.getInstances();
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
        switch (bookI){
            case 1:
                seeBooks();
                break;
            case 2:
                seeAuthors();
                break;
        }
        System.out.println("");
    }

    public static void seeAuthors(){

    }
}