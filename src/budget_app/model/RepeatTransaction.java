package budget_app.model;

public class RepeatTransaction {

    int repeat_transaction_id;

    // need to create tables:
    // repeat_transaction_week_day
    // repeat_transaction_month_day
    // repeat_transaction_month

}


// new repeat transaction creates transaction only if user specifies it has already occurred.

// date of last login saved. balance at last login saved. (no need to pull and total all transactions)
// update balance with repeat transactions since last login.




// simplify app to only work with recurring transactions and show remaining spendable/savable?
// Who actually wants to enter in individual transactions? Anyone?

// My current budgeting system requires only inputting (recurring and balances) and (updating future recurring, updating balances)
// All one-off transactions are either put on credit cards and CC bills are considered recurring and with amounts based on estimated spending
// or are considered part of expendable income.

// This is why bank transaction aggregation became a thing.

// Does Mint have APIs? Am I able to use their data to gather insights and predict future balances/savings?
// Estimate future balance based on reduced spending in given category?