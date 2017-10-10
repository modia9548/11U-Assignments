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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        System.out.println("What was the first test out of? ");
        int test1 = input.nextInt();
        
        System.out.println("What was the second test out of? ");
        int test2 = input.nextInt();
        
        System.out.println("What was the third test out of? ");
        int test3 = input.nextInt();
        
        System.out.println("What was the fourth test out of?");
        int test4 = input.nextInt();
        
        System.out.println("What was the fifth test out of?");
        int test5 = input.nextInt();
        
        System.out.println("Test scores for Doug" + 
                "test 1: ");
    }
}
