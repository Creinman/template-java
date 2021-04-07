public class PersonBuilder {
    private String surname;
    private String name;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
    }
    public PersonBuilder setAge(int age) {
        this.age = age;
    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
    }

    public Person build() {
        if (this.address == null || this.name == null || this.surname == null) {
            throw new IllegalStateException("Заданы не все параметры");
        } else if (this.age < 0) {
            throw new IllegalArgumentException("Возраст = " + this.age + " задан не верно, допустимое значение БОЛЬШЕ нуля");
        }
        return new Person(this.name, this.surname, this.age, this.address);
    }
}
