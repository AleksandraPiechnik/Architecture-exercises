public class Main {
    public static void main(String[] args) {
        User.UserBuilder userBuilder = new User.UserBuilder();
        User user = userBuilder
                .setName("Tom")
                .setLastName("Brown")
                .setAge(30)
                .setAddress("address")
                .build();

        System.out.println(user);
    }
}
