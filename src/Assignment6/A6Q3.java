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

        //array to store integers
        double[] integer = new double[2];

        //enter the integers
        System.out.println("enter the two integers ");
        integer[0] = input.nextInt();
        integer[1] = input.nextInt();

        if (integer[0] > integer[1]) {
            double tempNum = integer[0];
            integer[0] = integer[1];
            integer[1] = tempNum;
            System.out.println("The integer in ascending order are " + integer[0] + "," + integer[1]);


        } else {
            System.out.println("The integers in ascending order are " + integer[0] + "," + integer[1]);
        }
    }
}
