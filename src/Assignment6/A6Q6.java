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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("how many student are there");
        int numberOfStudents = input.nextInt();
        //array to store integers
        double[] marks = new double[numberOfStudents];
        //ask for all the marks
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("what are the " + numberOfStudents + " marks");
            marks[i] = input.nextInt();


            for (int x = 0; x < numberOfStudents - 1; x++) {
                //if mark is bigger than other mark, then switch
                if (marks[i] < marks[x]) {
                    double tempNum = marks[i];
                    marks[i] = marks[x];
                    marks[x] = tempNum;

                }
            }
        }

        System.out.println("The lowest marks is " + marks[0]);
        System.out.println("The highest mark is " + marks[numberOfStudents - 1]);

        double total = 0;
        for (int a = 0; a < marks.length; a++) {

            total = total + marks[a];




        }
        System.out.println("The average is " + total / numberOfStudents);
    }
}
