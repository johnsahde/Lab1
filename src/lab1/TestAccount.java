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
public class TestAccount {
    public static void main(String [] args) {
        Account acc = new Account(100.0);
        acc.deposit(50.0);
        acc.withdraw(147.0);
        System.out.println("Final account balance is: "+ acc.getBalance());
    }
    
    
}