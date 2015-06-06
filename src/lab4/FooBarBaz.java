/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;

/**
 *
 * @author JONATHAN
 */
public class FooBarBaz {
    public static void main(String[] args) {
        boolean divisible = false;
        for (int i = 1; i <= 50; i++) {
            
            System.out.print(i);
            if(i%3 == 0) {
                System.out.print(" foo ");
                divisible = true;
            }
            if(i%5 == 0) {
                System.out.print(" bar ");
                divisible = true;
            }
            if(i%7 == 0) {
                System.out.print(" baz ");
                divisible = true;
            }
            
            System.out.println();
            divisible = false;
        }
    }
}
