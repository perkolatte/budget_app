package budget_app.controllers;

import java.util.Scanner;

public class AccountInterface {

    protected static void accountMenu(int pageNumber) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("\nAccounts\n");
        listAccounts(pageNumber); // show recent transactions and options

        String selection = userInput.next();

        switch (selection) {
            case "1" :
                addAccount();// add account
                break;
            case "2" :
                listAccounts(pageNumber);
                // show recent transactions and options
                break;
            case "3" :

                // show budgets and options
                break;
            default :
                System.out.println("No matching selection. Please enter a number from the ones above.");
        }

    }

    private static void addAccount() {



    }

    private static void removeAccount() {



    }

    private static void listAccounts(int pageNumber) {



    }

}
