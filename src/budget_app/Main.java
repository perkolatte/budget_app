package budget_app;

//import budget_app.data.AccountMapper;
//import budget_app.data.AccountTypeMapper;
//import budget_app.exceptions.CriticalDatabaseException;
//import budget_app.model.Account;
//import budget_app.model.AccountType;
//
//import java.util.ArrayList;

import budget_app.controllers.UserInterface;

public class Main {

    public static void main(String[] args) {

        UserInterface userInterface = new UserInterface();
        userInterface.start();

    }


//    public static void main(String[] args) {
//
//        try {
//            testReadAccount();
//            testReadAccountType();
//
//        } catch (CriticalDatabaseException e) {
//            System.out.println("Failed to connect to database! Eek!");
//            return;
//        }
//
//    }
//
//    public static void testReadAccount() throws CriticalDatabaseException {
//        ArrayList<Account> accounts = AccountMapper.readAccountTable("SELECT * FROM BudgetAppDB.account");
//
//        for (Account account : accounts) {
//
//            System.out.println(account.toString());
//
//        }
//        System.out.println();
//
////        AccountMapper.writeAccountTable("Test Write", 1, 40.0);
//
//        accounts = AccountMapper.readAccountTable("SELECT * FROM BudgetAppDB.account");
//
//        for (Account account : accounts) {
//
//            System.out.println(account.toString());
//
//        }
//        System.out.println();
//
////        AccountMapper.removeAccount(11);
//
//        accounts = AccountMapper.readAccountTable("SELECT * FROM BudgetAppDB.account");
//
//        for (Account account : accounts) {
//
//            System.out.println(account.toString());
//
//        }
//        System.out.println();
//
//    }
//
//    public static void testReadAccountType() throws CriticalDatabaseException {
//        ArrayList<AccountType> accountTypes = AccountTypeMapper.readAccountTypeTable("SELECT * FROM BudgetAppDB.account_type");
//
//        for (AccountType accountType : accountTypes) {
//
//            System.out.println(accountType.toString());
//
//        }
//    }

}
