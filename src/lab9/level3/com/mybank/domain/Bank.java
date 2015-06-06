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
public class Bank {
    
    private static List<Customer> customers;
    
    static {
        customers = new ArrayList<Customer>(10);
    }
    
    private Bank() {  
    }

    public static void addCustomer(String f, String l) {
        customers.add(new Customer(f, l));
    }

    public static int getNumberOfCustomers() {
        return customers.size();
    }
    
    public static Customer getCustomer(int customer_index) {
          return customers.get(customer_index);
    }  
}
