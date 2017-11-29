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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //ask how many people are in the class
        System.out.println("How many people are there");
        int numberOfPeople = input.nextInt();
        //array to store number of people
        double[] people = new double[numberOfPeople];

        //create integer to get all of the people
        for (int i = 0; i < people.length; i++) {

            System.out.println("What was the height of person " + (i + 1));

            int heightOfPeople = input.nextInt();

            people[i] = heightOfPeople;
        }
        double total = 0;
        //for loop for length of people
        for (int a = 0; a < people.length; a++) {

            total = total + people[a];
        }

        double answer = Math.round(total * 100 / numberOfPeople) / 100;
        System.out.println("The average height is " + answer + "cm");
        for (int i = 0; i < people.length; i++) {
            if (people[i] > answer) {
                System.out.println(people[i] + "cm are above average height");

            }

        }

    }
}
