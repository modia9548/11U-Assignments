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

        //ask how many students are in the class
        System.out.println("How many students are in the class?");
        int numberOfStudents = input.nextInt();
        //array to store number of students
        double[] students = new double[numberOfStudents];

        //create integer to get all of the marks
        for (int i = 0; i < students.length; i++) {

            System.out.println("What were the marks of student " + (i + 1));

            int marksOfStudents = input.nextInt();

            students[i] = marksOfStudents;
        }
        double total = 0;
        for (int a = 0; a < students.length; a++) {

            total = total + students[a];
        }
        
       double answer = Math.round(total*100/students)/100;
       
        


    }
}
