package library;

public class Category extends LibraryItem {

    public Category(int id, String name) {
        super(id, name);
    }

    public void addBook(Book book) {
        System.out.println("Книга \"" + book.getTitle() + "\" додана до категорії \"" + name + "\".");
    }

    @Override
    public void showInfo() {
        System.out.println("Category: " + name);
    }
}
