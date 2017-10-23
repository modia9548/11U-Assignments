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
        double test1 = input.nextInt();
        System.out.println("What mark did you get? ");
        double mark1 = input.nextInt();
        //calculate the percentage mark
        double percentage1 = mark1 / test1 * 100;


        System.out.println("What was the second test out of? ");
        double test2 = input.nextDouble();
        System.out.println("What mark did you get? ");
        double mark2 = input.nextDouble();
        double percentage2 = mark2 / test2 * 100;

        System.out.println("What was the third test out of? ");
        double test3 = input.nextDouble();
        System.out.println("What mark did you get? ");
        double mark3 = input.nextDouble();
        double percentage3 = mark3 / test3 * 100;

        System.out.println("What was the fourth test out of?");
        double test4 = input.nextDouble();
        System.out.println("What mark did you get? ");
        double mark4 = input.nextDouble();
        double percentage4 = mark4 / test4 * 100;

        System.out.println("What was the fifth test out of?");
        double test5 = input.nextDouble();
        System.out.println("What mark did you get? ");
        double mark5 = input.nextDouble();
        double percentage5 = mark5 / test5 * 100;

        //write the test scores
        System.out.println("Test scores for Doug "
                + "test 1: " + percentage1 + "%");

        System.out.println("Test scores for Doug "
                + "test 2: " + percentage2 + "%");

        System.out.println("Test scores for Doug "
                + "test 3: " + percentage3 + "%");

        System.out.println("Test scores for Doug "
                + "test 4: " + percentage4 + "%");

        System.out.println("Test scores for Doug "
                + "test 5: " + percentage5 + "%");

        //write the average
        double totalPercentage = percentage1 + percentage2 + percentage3 + percentage4 + percentage5;
        double average = totalPercentage / 5;
        System.out.println("Average: " + average + "%");
    }
}
