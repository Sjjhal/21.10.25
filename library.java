package library;

public class Person {
    protected int id;
    protected String firstName;
    protected String lastName;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void showInfo() {
        System.out.println("Person: " + getName());
    }
}
