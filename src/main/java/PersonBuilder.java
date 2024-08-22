public class PersonBuilder {

    Person person;

    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
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

        person = new Person(firstName, lastName, age);
        if (address != null) person.setAddress(address);

        return person;
    }
}
