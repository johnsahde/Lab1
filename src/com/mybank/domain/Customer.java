/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mybank.domain;

/**
 *
 * @author JONATHAN
 */
public class Customer {
    
    private String firstName;
    private String lastName;
    private Account[] accounts;
    private int numberOfAccounts;
    
    public Customer(String f, String l) {
        
        firstName = f;
        lastName = l;
        accounts = new Account[10];
        numberOfAccounts = 0;
       
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccount(Account[] acc) {
        this.accounts = acc;
    }
    
    public void addAccount(Account account) {
        int i = numberOfAccounts++;
        accounts[i] = account;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }
    
    public Account getAccount(int account_index) {
        return accounts[account_index];
    }
    
    
}
