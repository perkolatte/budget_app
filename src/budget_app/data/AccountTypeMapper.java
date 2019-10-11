package budget_app.data;

import budget_app.exceptions.CriticalDatabaseException;
import budget_app.model.AccountType;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccountTypeMapper {

    public static ArrayList<AccountType> readAccountTypeTable(String query) throws CriticalDatabaseException {

        DatabaseReader databaseReader = new DatabaseReader();
        ArrayList<AccountType> accounts;

        try {
            accounts = readAccountTypes(query, databaseReader.connection);
            databaseReader.finalize();
        } catch (Exception e) {
            e.printStackTrace();
            throw new CriticalDatabaseException("Unable to connect to database. :(");
        }

        return accounts;

    }

    public static ArrayList<AccountType> readAccountTypes(String query, Connection connection) throws Exception {

        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            ArrayList<AccountType> accountTypeList = new ArrayList<>();

            while (resultSet.next()) {

                AccountType accountType = new AccountType(resultSet.getInt("account_type_id"),
                        resultSet.getString("account_type_name"));
                accountTypeList.add(accountType);

            }

            statement.close();
            resultSet.close();

            return accountTypeList;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception("SQL syntax error: " + e.getMessage());
        } finally {
            statement.close();
            resultSet.close();
        }

    }

}