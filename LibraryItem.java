package library;

public class LibraryItem {
    protected int id;
    protected String name;

    public LibraryItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showInfo() {
        System.out.println("LibraryItem: " + name);
    }
}
