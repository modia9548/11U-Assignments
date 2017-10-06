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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //create a scanner for input
        Scanner input = new Scanner(System.in);
        //ask user to write aount of inches to convert
         //create a scanner for input
        System.out.println("Please enter the measurment in inches you wish to convert");
        //get the amount of inches
        double inches = input.nextDouble();
        //calculate inches into cm
        inches = inches *2.54;
        System.out.println(inches + " cm");
    }
}
