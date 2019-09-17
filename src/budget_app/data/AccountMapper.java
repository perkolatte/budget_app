package budget_app.data;

import budget_app.exceptions.CriticalDatabaseException;
import budget_app.model.Account;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccountMapper {

    public static ArrayList<Account> readAccountTable() throws CriticalDatabaseException {

        String queryAll = "select * from BudgetAppDB.account";
        DatabaseReader databaseReader = new DatabaseReader();
        ArrayList<Account> accounts = new ArrayList<>();

        try {
            accounts = databaseReader.readAccounts(queryAll);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return accounts;

    }

}