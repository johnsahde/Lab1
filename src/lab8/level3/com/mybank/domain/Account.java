package lab8.level3.com.mybank.domain;



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
    
    protected double balance;
    
    protected Account(double initBalance) {
        this.balance = initBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amt) {
        balance += amt;
        
    }

    public void withdraw(double amt) throws OverdraftException {
        
        if ( amt <= balance  ) {
            balance -= amt;
            
            
        } else {
            throw new OverdraftException("Insufficient funds", amt - balance);
        }
        
        
    }
}
