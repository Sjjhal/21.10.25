package library;

public class PrintedBook extends Book {
    private boolean hardcover;

    public PrintedBook(int id, String title, String author, int year, String genre, boolean hardcover) {
        super(id, title, author, year, genre);
        this.hardcover = hardcover;
    }

    @Override
    public void read() {
        System.out.println("Читання паперової книги \"" + title + "\".");
    }
}
