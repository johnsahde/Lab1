/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mybank.batch;

import com.mybank.domain.Account;
import com.mybank.domain.Bank;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;

/**
 *
 * @author JONATHAN
 */
public class AccumulateSavingsBatch {
    
    private Bank bank;
    
    public void doBatch () {
        
        // For each customer...
        for ( int cust_idx = 0; cust_idx < bank.getNumberOfCustomers(); cust_idx++ ) {
            
            Customer customer = bank.getCustomer(cust_idx);

            // For each account for this customer...
            for ( int acct_idx = 0; acct_idx < customer.getNumberOfAccounts(); acct_idx++ ) {
                
                Account account = customer.getAccount(acct_idx);
                // Determine if the account type is SavingsAccount
                if (account instanceof SavingsAccount) {
                    SavingsAccount savingsAccount = (SavingsAccount) account;
                    savingsAccount.accumulateInterest();
                    
                } 
            } //end for account
        }// end for customer
        
    }
    
    public void setBank (Bank bank) {
        this.bank = bank;
    }
}
