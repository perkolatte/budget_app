package budget_app.controllers;

import budget_app.data.AccountMapper;
import budget_app.exceptions.CriticalDatabaseException;
import budget_app.model.Transaction;
import budget_app.services.AccountService;
import budget_app.services.TransactionService;
import budget_app.services.UserService;

import java.util.Scanner;

public class MainInterface {

    Scanner userInput = new Scanner(System.in);

    public void start() {

        UserService.userExists();

        UserService.getLastUser();

        System.out.println("Welcome!");
        mainMenu();

//        try {
//            AccountMapper.removeAccount();
//            AccountMapper.addAccount("Test", 1, 10);
//        } catch (CriticalDatabaseException e) {
//            e.printStackTrace();
//        }

    }

    private void mainMenu() {

        System.out.println("\n\nMain Menu\n");

        System.out.println("1. Transactions");
        System.out.println("2. Accounts");
        //System.out.println("3. Budgets");

        System.out.println();
        System.out.print("Enter selection: ");
        int selection = userInput.nextInt();

        switch (selection) {
            case 1 :
                TransactionInterface.transactionMenu(1);// show transaction and options
                break;
            case 2 :
                AccountInterface.accountMenu(1); // show recent transactions and options
                break;
            case 3 :
                System.out.println("Budgeting is not yet available. Stay tuned!");
                mainMenu();
                // show budgets and options
                break;
            default :
                System.out.println("No matching selection. Please enter a number from the ones above.");
        }

    }



    private void listTransactions(int pageNumber) {

        // show requested page of 10 transactions

    }

    public void transactionOptions() {



    }

    public void addTransaction() {



    }

    private void setupNewUser() {



    }

}
