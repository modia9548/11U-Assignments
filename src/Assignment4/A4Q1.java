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
public class A4Q1 {

    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        //get name from the user
        String firstName = input.nextLine();

        //output the variable into the screen
        System.out.println(firstName);

        //output hello and first name together, followed by how are you
        System.out.println("Hello " + firstName + ", how are you?");

    }
}
