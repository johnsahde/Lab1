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
public class SavingsAccount extends Account {
    
    private double interestRate;

    public SavingsAccount(double initBalance, double interestRate) {
        super(initBalance);
        this.interestRate = interestRate;
    }
    
    public void accumulateInterest() {
        balance = balance + (balance * (interestRate / 12));
    }
    
}
