package library;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Іван", "Петренко", "ivan123", "12345", "користувач");
        Admin admin = new Admin(2, "Олена", "Коваль");
        EBook ebook = new EBook(1, "Кобзар", "Тарас Шевченко", 1840, "Поезія", "PDF");
        PrintedBook printedBook = new PrintedBook(2, "Хіба ревуть воли", "Панас Мирний", 1880, "Роман", true);
        Category category = new Category(1, "Класична література");
        LibraryCatalog catalog = new LibraryCatalog(1, "Центральний каталог");

        user.showInfo();
        admin.showInfo();
        ebook.read();
        printedBook.read();
        category.showInfo();
        catalog.showInfo();

        admin.addBook(ebook);
        category.addBook(printedBook);
        catalog.searchByTitle("Кобзар");
    }
}
