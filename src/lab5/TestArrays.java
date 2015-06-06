/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab5;

/**
 *
 * @author JONATHAN
 */
public class TestArrays {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] array2 = array1;
        System.out.print("array1 is ");
        printArray(array1);
        System.out.println();
        
        for (int i = 0; i < array2.length; i++) {
            if (i == 0 || i%2 == 0) {
                array2[i] = i;
            }
        }
 
//        array2[0] = 0;
//        array2[2] = 2;
//        array2[4] = 4;
//        array2[6] = 6;
        System.out.print("array2 is ");
        printArray(array2);
        System.out.println();
    }
    public static void printArray(int[] array) {
        System.out.print('<');
        for (int i = 0; i < array.length; i++) {
            //print an element
            System.out.print(array[i]);
            if ( (i + 1) < array.length ) {
                System.out.print(", ");
            }
        }
        System.out.print('>');
    }
}
