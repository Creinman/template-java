public class Person {
    protected final String name;
    protected final String surname;
    //...

    public Person(String name, String surname) {
        //...
    }

    public Person(String name, String surname, int age) {
        //...
    }

    public boolean hasAge() { /*...*/ }
    public boolean hasAddress() { /*...*/ }

    public String getName() { /*...*/ }
    public String getSurname() { /*...*/ }
    public int getAge() { /*...*/ }
    public String getAddress() { /*...*/ }

    public String setAddress(String address) { /*...*/ }
    public void happyBirthday() { /*...*/ }

    @Override
    public String toString() { /*...*/ }

    @Override
    public int hashCode() { /*...*/ }

    public PersonBuilder newChildBuilder() { /*...*/ }
}