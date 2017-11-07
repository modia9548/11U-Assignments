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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
         // array to store marks
        double[] marks = new double[6];
        //ask how many students are in the class
        System.out.println("How many students are in the class?");
        int numberOfStudents= input.nextInt();
        //create a string to list all of the cost names
        String[] markNames = new String[numberOfStudents];
    }
}
