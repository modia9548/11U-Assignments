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
public class A7Q6 {

    public int lastDigit(int num){
        double answer = int num % 10;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //create an object to run the methods
        A7Q6 test = new A7Q6();

        Scanner input = new Scanner(System.in);
        
        System.out.println("what is the number? ");
        
        int num = input.nextInt();
        
        test.lastDigit(num);
        
    }
}
