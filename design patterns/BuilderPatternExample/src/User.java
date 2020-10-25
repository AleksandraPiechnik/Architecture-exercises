public class User {
    private String name;
    private String lastName;
    private int age;
    private String address;

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.address = userBuilder.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static class UserBuilder {
        private String name;
        private String lastName;
        private int age;
        private String address;

        public UserBuilder() {
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
