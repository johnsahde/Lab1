/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab8.level3.com.mybank.domain;

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
    public void withdraw(double amt) throws OverdraftException{
        
        if (balance < amt) {
            double overdraftNeeded = amt - balance;
            if (overdraftAmount < overdraftNeeded) {
                throw new OverdraftException("Insufficient funds for overdraft protection", overdraftNeeded);
            } else {
                balance = 0.0;
                overdraftAmount -= overdraftNeeded;
            }
        } else {
            balance -= amt; 
        }
    }
    
    
    
}
