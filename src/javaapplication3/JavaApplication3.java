
package javaapplication3;

import java.util.Scanner;
/**
 *
 * @author Miguel
 */
public class JavaApplication3 {

    public static void main(String[] args) {
     
        Scanner read = new Scanner(System.in);
        float number1 = 0;
        
        Number n1 = new Number();
        
        System.out.print("Introduzca un numero ");
        number1 = read.nextFloat();
        
        
        n1.setNumber(number1);
       System.out.println("el cubo del numero ingresado es: "+n1.NumberCubo());
     
        
    }
    
}
