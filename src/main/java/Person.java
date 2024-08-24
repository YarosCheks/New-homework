import lombok.Getter;
import lombok.Setter;

@Getter
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    @Setter
    private String address;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (firstName == null || lastName == null)
            throw new IllegalStateException("Отсутствует имя или фамилия");
    }

    public Person(String firstName, String lastName , Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

        if (firstName == null || lastName == null)
            throw new IllegalStateException("Отсутствует имя или фамилия");

        if (age < 0)
            throw new IllegalArgumentException("Вы указали некорректный возраст");
    }

    public void setLastName(String lastName) {
        if (this.lastName == null) this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        if (this.firstName == null) this.firstName = firstName;
    }

    public void setAge(int age) {
        if (this.age == 0) this.age = age;
    }

    public void happyBirthday() {
        age++;
    }

    public boolean hasAge() {
        return age != 0;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setAge(0)
                .setAddress(address)
                .setLastName(lastName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
