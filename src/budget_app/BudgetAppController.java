package budget_app;

import budget_app.data.AccountMapper;
import budget_app.exceptions.CriticalDatabaseException;
import budget_app.model.Account;

import java.util.ArrayList;

public class BudgetAppController {

    public static void main(String[] args) {

        try {
            testReadAccount();
        } catch (CriticalDatabaseException e) {
            System.out.println("Failed to connect to database! Eek!");
            return;
        }

    }

    public static void testReadAccount() throws CriticalDatabaseException {
        ArrayList<Account> accounts = AccountMapper.readAccountTable("SELECT * FROM BudgetAppDB.account");

        for (Account account : accounts) {

            System.out.println(account.toString());

        }
    }

}
