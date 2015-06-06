/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mybank.test;

import com.mybank.domain.Account;
import com.mybank.domain.Bank;
import com.mybank.domain.CheckingAccount;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;

/**
 *
 * @author JONATHAN
 */
public class TestBanking {
    public static void main(String[] args) {
         
//        System.out.println("Creating the customer Jane Smith.");
//        Customer customer = new Customer("Jane", "Smith");
//        
//        System.out.println("Creating her account with a 500.00 balance.");
//        customer.setAccount(new Account(500.00));
//        
//        System.out.println("Withdraw 150.00");
//        customer.getAccount().withdraw(150.00);
//        
//        System.out.println("Deposit 22.50");
//        customer.getAccount().deposit(22.50);
//        
//        System.out.println("Withdraw 47.62");
//        customer.getAccount().withdraw(47.62);
//        
//        System.out.println("Customer [" + customer.getLastName() + ", " 
//                + customer.getFirstName() + "]" + " has a balance of " +
//                customer.getAccount().getBalance());
        
//        
//        System.out.println("Creating the customer Jane Smith.");
//        Customer customer = new Customer("Jane", "Smith");
//        
//        System.out.println("Creating her account with a 500.00 balance.");
//        customer.setAccount(new Account(500.00));
//        
//        
//        System.out.println("Withdraw 150.00: " + customer.getAccount().withdraw(150.00));
//        
//        
//        System.out.println("Deposit 22.50: " + customer.getAccount().deposit(22.50));
//        
//        
//        System.out.println("Withdraw 47.62: " + customer.getAccount().withdraw(47.62));
//        
//        System.out.println("Withdraw 400.00: " + customer.getAccount().withdraw(400.00));
//        
//        System.out.println("Customer [" + customer.getLastName() + ", " 
//                + customer.getFirstName() + "]" + " has a balance of " +
//                customer.getAccount().getBalance());
        
        
        
        // Exercise 2 - Using Arrays to Represent One-to-Many Associations (Level 3)    
//        Bank customers = new Bank();
//        
//        customers.addCustomer("Jane", "Simms");
//        customers.addCustomer("Owen", "Bryant");
//        customers.addCustomer("Tim", "Soley");
//        customers.addCustomer("Maria", "Soley");
//        
//        for (int i = 0; i < customers.getNumberOfCustomers(); i++) {
//            System.out.println("Customer [" + i + "]" + " is " + 
//                                customers.getCustomer(i).getLastName() + 
//                                ", " + customers.getCustomer(i).getFirstName());
//        }
        
        
        
        
//        //Lab 6 Exercise 1 - Creating Bank Account Subclases (Level 3)
//        
//        
//    Bank bank = new Bank();
//    Customer customer;
//    Account account;
//
//    //
//    // Create bank customers and their accounts
//    //
//
//    System.out.println("Creating the customer Jane Smith.");
//    bank.addCustomer("Jane", "Smith");
//    customer = bank.getCustomer(0);
//    System.out.println("Creating her Savings Account with a 500.00 balance and 3% interest.");
//    customer.setAccount(new SavingsAccount(500.00, 0.03));
//
//    System.out.println("Creating the customer Owen Bryant.");
//    bank.addCustomer("Owen", "Bryant");
//    customer = bank.getCustomer(1);
//    System.out.println("Creating his Checking Account with a 500.00 balance and no overdraft protection.");
//    customer.setAccount(new CheckingAccount(500.00));
//
//    System.out.println("Creating the customer Tim Soley.");
//    bank.addCustomer("Tim", "Soley");
//    customer = bank.getCustomer(2);
//    System.out.println("Creating his Checking Account with a 500.00 balance and 500.00 in overdraft protection.");
//    customer.setAccount(new CheckingAccount(500.00, 500.00));
//
//    System.out.println("Creating the customer Maria Soley.");
//    bank.addCustomer("Maria", "Soley");
//    customer = bank.getCustomer(3);
//    System.out.println("Maria shares her Checking Account with her husband Tim.");
//    customer.setAccount(bank.getCustomer(2).getAccount());
//
//    System.out.println();
//
//    //
//    // Demonstrate behavior of various account types
//    //
//
//    // Test a standard Savings Account
//    System.out.println("Retrieving the customer Jane Smith with her savings account.");
//    customer = bank.getCustomer(0);
//    account = customer.getAccount();
//    // Perform some account transactions
//    System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
//    System.out.println("Deposit 22.50: " + account.deposit(22.50));
//    System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
//    System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
//    // Print out the final account balance
//    System.out.println("Customer [" + customer.getLastName()
//		       + ", " + customer.getFirstName()
//		       + "] has a balance of " + account.getBalance());
//
//    System.out.println();
//
//    // Test a Checking Account w/o overdraft protection
//    System.out.println("Retrieving the customer Owen Bryant with his checking account with no overdraft protection.");
//    customer = bank.getCustomer(1);
//    account = customer.getAccount();
//    // Perform some account transactions
//    System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
//    System.out.println("Deposit 22.50: " + account.deposit(22.50));
//    System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
//    System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
//    // Print out the final account balance
//    System.out.println("Customer [" + customer.getLastName()
//		       + ", " + customer.getFirstName()
//		       + "] has a balance of " + account.getBalance());
//
//    System.out.println();
//
//    // Test a Checking Account with overdraft protection
//    System.out.println("Retrieving the customer Tim Soley with his checking account that has overdraft protection.");
//    customer = bank.getCustomer(2);
//    account = customer.getAccount();
//    // Perform some account transactions
//    System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
//    System.out.println("Deposit 22.50: " + account.deposit(22.50));
//    System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
//    System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
//    // Print out the final account balance
//    System.out.println("Customer [" + customer.getLastName()
//		       + ", " + customer.getFirstName()
//		       + "] has a balance of " + account.getBalance());
//
//    System.out.println();
//
//    // Test a Checking Account with overdraft protection
//    System.out.println("Retrieving the customer Maria Soley with her joint checking account with husband Tim.");
//    customer = bank.getCustomer(3);
//    account = customer.getAccount();
//    // Perform some account transactions
//    System.out.println("Deposit 150.00: " + account.deposit(150.00));
//    System.out.println("Withdraw 750.00: " + account.withdraw(750.00));
//    // Print out the final account balance
//    System.out.println("Customer [" + customer.getLastName()
//		       + ", " + customer.getFirstName()
//		       + "] has a balance of " + account.getBalance());

        
    
        
        
        
        
        
    }
}
