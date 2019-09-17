package budget_app.data;

import budget_app.exceptions.CriticalDatabaseException;
import budget_app.model.Account;
import budget_app.model.AccountType;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseReader {

    Connection connection = null;

    public DatabaseReader() throws CriticalDatabaseException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //com.mysql.jdbc.Driver deprecated
            connection = DriverManager.getConnection("jdbc:mysql://localhost/BudgetAppDB?user=root&password=nouN733_berN&useSSL=false&serverTimezone=America/Los_Angeles");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new CriticalDatabaseException("Critical error: " + e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
            throw new CriticalDatabaseException("SQL syntax error: " + e.getMessage());
        }

    }

    protected void finalize() throws Throwable {
        connection.close();
    }

    public ArrayList<Account> readAccounts(String query) throws Exception{

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

    public ArrayList<AccountType> readAccountTypes(String query) throws Exception{

        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            ArrayList<AccountType> accountTypeList = new ArrayList<>();

            while (resultSet.next()) {

                AccountType accountType = new AccountType(  resultSet.getInt("account_type_id"),
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
