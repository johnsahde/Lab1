/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

/**
 *
 * @author JONATHAN 
 */
public class TestMyPoint {
    public static void main(String[] args) {
        
        MyPoint start = new MyPoint(10,10);
        MyPoint end  = new MyPoint(20,30);
        MyPoint stray  = end;
        
        System.out.println("Start point is " + start.toString());
        System.out.println("End point is " + end.toString());
        
        
         
        System.out.println("\nStray point is " + stray.toString());
        System.out.println("End point is " + end.toString());
        
        stray.x = 47;
        stray.y = 50;
        
        System.out.println("\nStray point is " + stray.toString());
        System.out.println("End point is " + end.toString());
        System.out.println("Start point is " + start.toString());
        
        
        
    
    }
    
    
}
