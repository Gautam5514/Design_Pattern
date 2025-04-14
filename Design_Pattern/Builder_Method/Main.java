package Builder_Method;

public class Main {
    public static void main (String[] args) {

        User user = new User.UserBuilder()
        .setEmailId("gautam1@gmail.com")
        .setUserId("USER12D")
        .setUserName("Gautam")
        .build();
        System.out.println(user);

        // User user2 = new User.UserBuilder()
        User user2 = User.UserBuilder.builder()
            .setEmailId("Sagar123@gmail.com")
            .setUserId("Sagar123")
            .setUserName("Sagar")
            .build();
        System.out.println(user2);

    }
}
