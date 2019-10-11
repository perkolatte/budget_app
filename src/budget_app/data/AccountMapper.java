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

//    public static void writeAccountTable(String account_name, int account_type_id, double account_balance) throws CriticalDatabaseException {
//
//        DatabaseReader databaseReader = new DatabaseReader();
//
//        try {
//            addAccount(account_name, account_type_id, account_balance, databaseReader.connection);
//            databaseReader.finalize();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new CriticalDatabaseException("Unable to connect to database. :(");
//        }
//
//    }

    public static ArrayList<Account> readAccounts(String query, Connection connection) throws Exception{

        Statement statement = null;
        ResultSet resultSet = null;
        DatabaseReader databaseReader = new DatabaseReader();

        try {
            statement = databaseReader.connection.createStatement();
            resultSet = statement.executeQuery(query);

            ArrayList<Account> accountList = mapResultSetToAccount(resultSet);

            statement.close();
            resultSet.close();

            return accountList;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception("SQL syntax error: " + e.getMessage());
        }
    }

    private static ArrayList<Account> mapResultSetToAccount(ResultSet resultSet) throws SQLException {

        ArrayList<Account> accountList = new ArrayList<>();

        while (resultSet.next()) {

            Account account = new Account(  resultSet.getInt("account_id"),
                    resultSet.getString("account_name"),
                    resultSet.getInt("account_type_id"),
                    resultSet.getDouble("account_balance"));
            accountList.add(account);

        }

        return accountList;

    }

    public static Account getAccount(String accountName) throws CriticalDatabaseException {

        DatabaseReader databaseReader = new DatabaseReader();
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = databaseReader.connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM BudgetAppDB.account WHERE account_name = " + accountName);
            ArrayList<Account> accounts = mapResultSetToAccount(resultSet);
            return accounts.get(0);
        } catch (SQLException e) {
            System.out.println("SQL error!");
            throw new CriticalDatabaseException(e.getMessage());
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new CriticalDatabaseException("Unable to close statement object in getAccount()!");
            }
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new CriticalDatabaseException("Unable to close resultSet object in getAccount()!");
            }
        }
    }

    public static Account addAccount(String account_name, int account_type_id, double account_balance) throws CriticalDatabaseException{

        DatabaseReader databaseReader = new DatabaseReader();
        Statement statement = null;
        ResultSet resultSet = null;
        ArrayList<Account> newAccount;

        try {
            statement = databaseReader.connection.createStatement();

            statement.executeUpdate("INSERT INTO BudgetAppDB.account (account_name, account_type_id, account_balance) " +
                    "VALUES (\'" + account_name + "\'," + account_type_id + "," + account_balance + ");");

            resultSet = statement.executeQuery("SELECT * FROM BudgetAppDB.account WHERE account_name=\'" + account_name + "\';");

            newAccount = mapResultSetToAccount(resultSet);
            resultSet.close();
            return newAccount.get(0);
        } catch (SQLException e) {
            System.out.println("SQL error!");
            throw new CriticalDatabaseException(e.getMessage());
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new CriticalDatabaseException("Unable to close statement object in addAccount()!");
            }
//            try {
//                resultSet.close();
//            } catch (SQLException e) {
//                throw new CriticalDatabaseException("Unable to close resultSet object in addAccount()!");
//            }
        }
    }

    public static void removeAccount(int account_id) throws CriticalDatabaseException{

        DatabaseReader databaseReader = new DatabaseReader();
        Statement statement = null;

        try {
            statement = databaseReader.connection.createStatement();
            int rowsAffected = statement.executeUpdate("DELETE FROM BudgetAppDB.account WHERE account_id = " + account_id);
            System.out.println(rowsAffected + " row removed.");
        } catch (SQLException e) {
            System.out.println("SQL error!");
            e.printStackTrace();
        }
    }

}