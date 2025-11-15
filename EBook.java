package library;

public class EBook extends Book {
    private String fileType;

    public EBook(int id, String title, String author, int year, String genre, String fileType) {
        super(id, title, author, year, genre);
        this.fileType = fileType;
    }

    @Override
    public void read() {
        System.out.println("Читання електронної книги \"" + title + "\" у форматі " + fileType + ".");
    }
}
