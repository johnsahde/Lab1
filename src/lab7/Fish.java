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
public class Fish extends Animal implements Pet{
    
    private String name;
    
    public Fish () {
        super(0);
    }
    
    public String getName () {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public void play () {
        System.out.println("Fish swim in their tanks all day.");
    }
    
    @Override
    public void walk () {
        super.walk();
        System.out.println("Fish, of course, can't walk; they swim.");
    }
    
    public void eat () {
        System.out.println("Fish eat pond scum");
    }
}
