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
public class A7Q5 {

    public void chaotic(int lines) {

        //for loop for number of lines
        for (int i = 0; i < lines; i++) {
            int randNum = (int) (Math.random() * (5)) + 1;
            
            //input for number of stars
            for (int j = 0; j < randNum; j++) {


                System.out.print("*");
                
            }
            System.out.println(" ");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create an object to run the methods
        A7Q5 test = new A7Q5();

        Scanner input = new Scanner(System.in);

        System.out.println("how many lines do you want");

        int numLines = input.nextInt();

        test.chaotic(numLines);

    }
}
