package dal;

public class UserDatabase {
     private static UserDatabase instance;

    private UserDatabase() {
        // Private constructor to prevent instantiation
    }
    public static synchronized UserDatabase getInstance() {
        if (instance == null) {
            instance = new UserDatabase();
        }
        return instance;
    }
}
