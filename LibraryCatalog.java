package library;

public class LibraryCatalog extends LibraryItem {

    public LibraryCatalog(int id, String name) {
        super(id, name);
    }

    public void searchByTitle(String title) {
        System.out.println("Пошук книги за назвою: " + title);
    }

    @Override
    public void showInfo() {
        System.out.println("LibraryCatalog: " + name);
    }
}
