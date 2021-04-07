public class Person {
    protected final String name;
    protected final String surname;
    protected String address;
    protected int age;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge(int age) {
        if (this.age != null) return true;
    }

    public boolean hasAddress() {
        if (this.address != null) return true;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public String setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        this.age += 1;
    }

    @Override
    public String toString() {

    }

    @Override
    public int hashCode() {

    }

    public PersonBuilder newChildBuilder() {

    }
}