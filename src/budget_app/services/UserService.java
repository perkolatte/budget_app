package budget_app.services;

import budget_app.data.UserMapper;
import budget_app.model.User;

public class UserService {

    public static boolean userExists() {


        // check for existing user(s) and return true if any are found
        return false;

    }

    public static void updatePassword(String password) {

        String encryptedPassword = encryptPassword(password); // Encrypt password
        // Store new password

    }

    public static boolean isCorrectPassword(String maybePassword) {

        String encryptedMaybePassword = encryptPassword(maybePassword); // encrypt plain-text and check against stored password
        String encryptedPassword = ""; // Retrieve encrypted password

        if (encryptedMaybePassword.equals(encryptedPassword)) {
            return true;
        } else {
            return false;
        }

    }

    public static String encryptPassword(String password) {

        return password; // need to encrypt plain-text password for storage in database

    }

    public static User getLastUser() {

        UserMapper.retrieveLastUser();

        return null;

    }
}
