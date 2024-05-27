public class User {
    private int id;
    private String username;
    private Profile profile;

    // Constructors, getters, and setters
}

public class Profile {
    private int id;
    private String fullName;
    private String email;

    // Constructors, getters, and setters
}

public class UserProfileMapper {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setUsername("exampleUser");

        Profile profile = new Profile();
        profile.setId(1);
        profile.setFullName("John Doe");
        profile.setEmail("john@example.com");

        user.setProfile(profile);
        profile.setUser(user);

        // You can perform operations involving user and profile here
    }
}
