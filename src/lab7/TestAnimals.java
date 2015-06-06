/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab7;

/**
 *
 * @author JONATHAN
 */
public class TestAnimals {
    public static void main(String[] args) {
        Fish f = new Fish ();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        
        //Demonstrate different implementations of an interface
        f.play();
        c.play();
        
        //Demonstrate virtual method invocation
        e.eat();
        e.walk();
        
         //Demonstrate calling super methods
        a.walk();
        
        
    }
}
