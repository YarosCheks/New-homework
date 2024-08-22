public class Main {
    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setFirstName("Анна")
                .setLastName("Вольф")
                .setAge(31)
//                .setAddress("Сидней")
                .build();

        System.out.println(mom.hasAddress());
        System.out.println(mom.hasAge());

        Person son = mom.newChildBuilder()
                .setFirstName("Антошка")
                .build();

        System.out.println(mom.hasAddress());
        System.out.println(mom.hasAge());

        System.out.println("У\n" + mom + "\nесть сын,\n" + son + "\n");

        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Возраст недопустимый
            new PersonBuilder()
                    .setFirstName("Name")
                    .setLastName("Surname")
                    .setAge(-100).build();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}