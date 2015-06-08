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
public class TestIsSubString {
     public static void main(String[] args) {
        String text = "The cat in the hat.";
         
        System.out.println("isSubString(\"cat\", \"The cat in the hat.\") "
                + isSubString("cat", text));
        
        System.out.println("isSubString(\"bat\", \"The cat in the hat.\") "
                + isSubString("bat", text));
        
        System.out.println("isSubString(\"The\", \"The cat in the hat.\") "
                + isSubString("The", text));
        
        System.out.println("isSubString(\"hat.\", \"The cat in the hat.\") "
                + isSubString("hat.", text));
        
    } // end main

    private static boolean isSubString(String s, String x) {

         // Version 3 ESTABLE BUENA
        boolean found = false;
        int c = 0, j =0;
        int subStringLength = s.length() - 1;
        int stringLength = x.length() - 1;
        
        outer:
        for (int i = 0; i <= subStringLength; i++) {    //Recorrido de subcadena
                do {                                    //Recorrido de cadena
                    if (j <= stringLength) {            
                        
                        if (s.charAt(i) == x.charAt(j)) { // Comparación de caracter de subcadena con carater de cadena asigna found = true si encuentra caracter e incrementa contador
                            found = true;
                            c++;    
                        }
                        else if (found && c == subStringLength + 1){ //Si no se encontró la subcadena en la cadena retorna false y rompe ciclo
                            found = false;    
                            break outer;
                        }
                        else {
                            found = false;
                            i = c = 0;
                        }
                        
                        j++;
                    } // end if
                    else {
                        found = false;
                        break outer;
                    } // end else
                    
                } while(!found);// end do-while
        }//end for
        
        return found;
    }// end isSubString function
}// end TestIsSubString class
