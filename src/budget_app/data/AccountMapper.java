package budget_app.data;

import budget_app.exceptions.CriticalDatabaseException;
import budget_app.model.Account;

import java.sql.*;
import java.util.ArrayList;

public class AccountMapper {

    public static ArrayList<Account> readAccountTable(String query) throws CriticalDatabaseException {

        DatabaseReader databaseReader = new DatabaseReader();
        ArrayList<Account> accounts;

        try {
            accounts = readAccounts(query, databaseReader.connection);
        } catch (Exception e) {
            e.printStackTrace();
            throw new CriticalDatabaseException("Unable to connect to database. :(");
        }

        return accounts;

    }

    public static ArrayList<Account> readAccounts(String query, Connection connection) throws Exception{

        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            ArrayList<Account> accountList = new ArrayList<>();

            while (resultSet.next()) {

                Account account = new Account(  resultSet.getInt("account_id"),
                        resultSet.getString("account_name"),
                        resultSet.getInt("account_type_id"),
                        resultSet.getDouble("account_balance"));
                accountList.add(account);

            }

            statement.close();
            resultSet.close();

            return accountList;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception("SQL syntax error: " + e.getMessage());
        } finally {
            statement.close();
            resultSet.close();
        }

    }



}