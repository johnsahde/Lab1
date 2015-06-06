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
public class Bank {
//    //Exercise 2 - Using Arrays to Represent One-to-Many Associations (Level 3)
//    private Customer[] customers;
//    private int numberOfCustomers;
//    
//    public Bank() {
//        customers = new Customer[10];
//        numberOfCustomers = 0;
//    
//    }
//    
//    public void addCustomer(String f, String l) {
//        int i = numberOfCustomers++;
//        customers[i] = new Customer(f, l);
//    }
//
//    public int getNumberOfCustomers() {
//        return numberOfCustomers;
//    }
//    
//    public Customer getCustomer(int customer_index) {
//        return customers[customer_index];
//    }
    
    //Lab 7 - Exercise 1 - Applying Static Members to a Design (Level 3)
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
