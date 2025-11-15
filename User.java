package library;

public class User extends Person {
    private String login;
    private String password;
    private String role;

    public User(int id, String firstName, String lastName, String login, String password, String role) {
        super(id, firstName, lastName);
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public void register() {
        System.out.println("Користувач " + getName() + " зареєстрований.");
    }

    public void login() {
        System.out.println("Користувач " + getName() + " увійшов у систему.");
    }

    public void addToFavorites(Book book) {
        System.out.println("Книга \"" + book.getTitle() + "\" додана до улюблених користувача " + getName());
    }

    @Override
    public void showInfo() {
        System.out.println("User: " + getName() + ", роль: " + role);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + getName() + '\'' +
                ", login='" + login + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
