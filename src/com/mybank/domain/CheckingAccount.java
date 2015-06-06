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
public class CheckingAccount extends Account {
    
    private double overdraftAmount;

    public CheckingAccount(double initBalance, double overdraftAmount) {
        super(initBalance);
        this.overdraftAmount = overdraftAmount;
    }
    

    public CheckingAccount(double initBalance) {
        this(initBalance, 0.0);
    }
    
    @Override
    public boolean withdraw(double amt) {
        boolean result = true;
        
        if (balance < amt) {
            double overdraftNeeded = amt - balance;
            if (overdraftAmount < overdraftNeeded) {
                result = false;
            }
            else {
                balance = 0.0;
                overdraftAmount -= overdraftNeeded;
            }
        } else {
            balance -= amt; 
        }
        return result;
    }
    
    
    
}
