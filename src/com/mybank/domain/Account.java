package com.mybank.domain;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author JONATHAN
 */
public class Account {
    //public double balance;
    protected double balance;
    
    protected Account(double initBalance) {
        this.balance = initBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    
//    public void deposit(double amt) {
//        balance += amt;
//    }
    //Lab 4 Excercise 2: Using Conditional Statements in the Account class (Level 3)
    public boolean deposit(double amt) {
        balance += amt;
        return true;
    }
    
//    public void withdraw(double amt) {
//        if (balance >= amt) {
//            balance -= amt;
//            
//        }
//        
//        //balance -= amt;
//    }
    
    //Lab 4 Excercise 2: Using Conditional Statements in the Account class (Level 3)
    public boolean withdraw(double amt) {
        boolean result = false;
        if (balance >= amt) {
            balance -= amt;
            result = true;
            
        }
        return result;
        //balance -= amt;
    }
}
