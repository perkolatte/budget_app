package budget_app.data;

import budget_app.model.AccountType;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccountTypeMapper {

    public void readAccountTypeTable() {

        String queryAll = "select * from BudgetAppDB.account_type";
        DatabaseReader databaseReader = null;

        try {
            ArrayList<AccountType> accountTypes = databaseReader.readAccountTypes(queryAll);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}