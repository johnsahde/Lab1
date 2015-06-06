package lab8.level3.com.mybank.report;

import com.mybank.domain.*;

public class CustomerReport {

    public CustomerReport() {
    }

    public void generateReport() {

        // Print report header
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        // For each customer...
        for ( int cust_idx = 0; cust_idx < Bank.getNumberOfCustomers(); cust_idx++ ) {
            
            Customer customer = Bank.getCustomer(cust_idx);

            // Print the customer's name
            System.out.println();
            System.out.println("Customer: " + customer.getLastName() + ", " + customer.getFirstName());

            // For each account for this customer...
            for ( int acct_idx = 0; acct_idx < customer.getNumberOfAccounts(); acct_idx++ ) {
                
                Account account = customer.getAccount(acct_idx);
                String  account_type = "";
                
                // Determine the account type
                /*** Use the instanceof operator to test what type of account
                **** we have and set account_type to an appropriate value, such
                **** as "Savings Account" or "Checking Account". ***/
              
                if (account instanceof SavingsAccount) {
                    account_type = "Savings Account";
                } else if (account instanceof CheckingAccount) {
                    account_type = "Checking Account";
                } else {
                    account_type = "Uknown Account Type";
                }
                
                // Print the current balance of the account
                /*** Print out the type of account and the balance. ***/
                System.out.println("  " + account_type + ": current balance is " + account.getBalance() );
            } //end for account
        }// end for customer
    }// end generateReport()
}// end CustomerReport class
