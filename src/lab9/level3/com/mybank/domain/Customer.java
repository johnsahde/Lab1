/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab9.level3.com.mybank.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JONATHAN
 */
public class Customer {
    
    private String firstName;
    private String lastName;
    private List<Account> accounts;
    
    public Customer(String f, String l) {
        
        firstName = f;
        lastName = l;
        accounts = new ArrayList<Account>(10);

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

    public void setAccount(List<Account> acc) {
        this.accounts = acc;
    }
    
    public void addAccount(Account account) {
          accounts.add(account);
    }

    public int getNumberOfAccounts() {
          return accounts.size();
    }
    
    public Account getAccount(int account_index) {
         return accounts.get(account_index);
    }
    
    
}
