/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author Aakash Modi
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //enter integer 1
        System.out.println("Enter amount of integers ");
        int integerAmount = input.nextInt();

        //array to store integers
        double[] integer = new double[integerAmount];
        
        //create integer to get all of the integers
        for (int i = 0; i < integer.length; i++) {
            
             System.out.println("What is integer " + (i + 1));
             
              int orderOfIntegers = input.nextInt();

            integer[i] = orderOfIntegers;
        }
        double answer = 
    }
}
