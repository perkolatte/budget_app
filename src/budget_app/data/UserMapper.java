package budget_app.data;

import budget_app.model.Account;
import budget_app.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserMapper {

    private static ArrayList<User> mapResultSetToUser(ResultSet resultSet) throws SQLException {

        ArrayList<User> userList = new ArrayList<>();

        while (resultSet.next()) {

            User user = new User(resultSet.getInt("user_id"),
                    resultSet.getString("username"),
                    resultSet.getString("password"));
            userList.add(user);

        }

        return userList;

    }

    public static User retrieveLastUser() {

        return null;

    }

}
