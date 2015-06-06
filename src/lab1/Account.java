/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author JONATHAN
 */
public class Account {
    private double balance;
    
    public Account(double initBalance) {
        this.balance = initBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amt) {
        balance += amt;
    }
    
    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
        }
    }
}
