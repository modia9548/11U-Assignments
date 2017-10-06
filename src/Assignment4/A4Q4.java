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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        System.out.println("How much does the food for prom cost?");
        //get the cost
        int food = input.nextInt();
        // tell user to give cost of DJ
        System.out.println("how much does the DJ cost?");
        //get the cost
        int dj = input.nextInt();
        // tell user to give cost of hall
        System.out.println("How much does it cost to rent the hall?");
        //get the cost
        int hall = input.nextInt();
        // tell user to give cost of decorations
        System.out.println("How much do decorations cost?");
        //get the number
        int decorations = input.nextInt();
        // tell user to give cost of staff
        System.out.println("How much does it cost for staff?");
        //get the cost
        int staff = input.nextInt();
        // tell user to give cost of miscellaneous equipment
        System.out.println("How much does miscellaneous equipment cost?");
        //get the number
        int miscellaneous = input.nextInt();
    }
}
