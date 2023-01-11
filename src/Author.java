public class Author {
    private static int authorCount = 0;
    private String name = "Desconhecido";
    private Book[] books;

    public Author(){
        authorCount++;
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
