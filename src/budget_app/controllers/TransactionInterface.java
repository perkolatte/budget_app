package budget_app.controllers;

import java.util.Scanner;

public class TransactionInterface {

    protected static void transactionMenu(int pageNumber) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("\n\nTransactions\n");
        listTransactions(pageNumber);

        System.out.println("1) Add transaction");
        System.out.println("2) Go to page"); // ideally change to jump to date and add search
        if (pageNumber > 1) {
            System.out.println("3) Previous page");
        }
        System.out.println("4) Next Page");
        System.out.println("0) Main menu");

        System.out.println();
        System.out.print("Enter selection: ");
        int selection = userInput.nextInt();

        switch (selection) {
            case 1 :
                addTransaction();// add transaction
                break;
            case 2 :
                System.out.print("Enter page: ");
                selection = userInput.nextInt();
                listTransactions(selection);
                // show recent transactions and options
                break;

            default :
                System.out.println("No matching selection. Please enter a number from the ones above.");
        }

    }

    private static void addTransaction() {



    }

    private static void removeTransaction() {



    }

    // show requested page of 10 transactions
    private static void listTransactions(int pageNumber) {

        if (pageNumber > 0) { // add maxPage to prevent calling nonexistent pages



        }

    }


//    private void transactionOptions() {
//
//
//
//    }

}
