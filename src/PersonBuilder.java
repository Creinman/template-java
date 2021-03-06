public class PersonBuilder {
    private String surname;
    private String name;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
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
