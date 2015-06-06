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
public class Bank {

    private static Customer[] customers;
    private static int numberOfCustomers;
    
    private Bank() {
        
    
    }
    static {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }
    
    public static void addCustomer(String f, String l) {
        int i = numberOfCustomers++;
        customers[i] = new Customer(f, l);
    }

    public static int getNumberOfCustomers() {
        return numberOfCustomers;
    }
    
    public static Customer getCustomer(int customer_index) {
        return customers[customer_index];
    }
  
}
