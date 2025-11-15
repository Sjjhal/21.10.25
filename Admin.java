package library;

public class Admin extends Person {

    public Admin(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public void addBook(Book book) {
        System.out.println("Адмін " + getName() + " додав книгу: " + book.getTitle());
    }

    public void removeBook(Book book) {
        System.out.println("Адмін " + getName() + " видалив книгу: " + book.getTitle());
    }

    public void blockUser(User user) {
        System.out.println("Адмін " + getName() + " заблокував користувача " + user.getName());
    }

    @Override
    public void showInfo() {
        System.out.println("Admin: " + getName());
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + getName() + '\'' +
                '}';
    }
}
