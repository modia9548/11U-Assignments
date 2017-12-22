/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author Aakash Modi
 */
public class A7Q8 {

    public int allDigitsOdd(int num){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //create an object to run the methods
        A7Q7 test = new A7Q7();

        Scanner input = new Scanner(System.in);
        
        System.out.println("what is the number? ");
        
        int num = input.nextInt();
        
        test.allDigitsOdd(num);
    }
}
