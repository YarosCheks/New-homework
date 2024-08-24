public class PersonBuilder {

    Person person;

    public PersonBuilder setFirstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    public PersonBuilder setAge(int age) {
        person.setAge(age);
        return this;
    }

    public PersonBuilder setAddress(String address) {
        person.setAddress(address);
        return this;
    }

    public Person build() {

        person = new Person(
                person.getFirstName(),
                person.getLastName(),
                person.getAge()
        );

        if (person.getAddress() != null) person.setAddress(person.getAddress());

        return person;
    }
}
