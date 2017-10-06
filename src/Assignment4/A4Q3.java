/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author Aakash Modi
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // tell user to give 1st number
        System.out.println("Please enter your first number");
        //get the number
        int number1 = input.nextInt();
        // tell user to give 2nd number
        System.out.println("Please enter your second number");
        //get the number
        int number2 = input.nextInt();
        // tell user to give 3rd number
        System.out.println("Please enter your third number");
        //get the number
        int number3 = input.nextInt();
        // tell user to give 4th number
        System.out.println("Please enter your fourth number");
        //get the number
        int number4 = input.nextInt();
        
        System.out.println(number1 + "," + number2 + "," + number3 + "," + number4);
    }
}
