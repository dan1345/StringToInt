/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtoint;

/**
 *
 * @author Данил
 */
public class StringToInt {

   public static void main(String[] args) {
           String  strin="18723";
        System.out.println("String Before Conversion :  "+ strin);
        int output =    convertor( strin );                
        System.out.println("int value as output "+ output);
        System.out.println("");
    }
    
    
    public static int convertor( String str ){
        int i = 0, number = 0;
        boolean isNegative = false;
        int len = str.length();
        if( str.charAt(0) == '-' ){
            isNegative = true;
            i = 1;
        }
        while( i < len ){
            number *= 10;
            number += ( str.charAt(i++) - '0' );
        }
        if( isNegative )
        number = -number;
        return number;
    }   
}
    
