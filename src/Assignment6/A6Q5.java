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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("how many marks are there");
        int numberOfMarks = input.nextInt();
        //array to store integers
        double[] marks = new double[numberOfMarks];
        //ask for all the marks
        for (int i = 0; i < numberOfMarks; i++) {
            System.out.println("what are the " + numberOfMarks + " marks");
            marks[i] = input.nextInt();


            for (int x = 0; x < numberOfMarks - 1; x++) {
                //if mark is bigger than other mark, then switch
                if (marks[i] < marks[x]) {
                    double tempNum = marks[i];
                    marks[i] = marks[x];
                    marks[x] = tempNum;

                }
            }
        }
        for (int j = 0; j < marks.length; j++) {
            System.out.println("the marks in ascending order are " + marks[j]);
        }
//find the median
        if (numberOfMarks % 2 == 0) {
            double firstNumber = marks[numberOfMarks / 2];
            double secondNumber = marks[numberOfMarks / 2 - 1];
            System.out.println("The median is " + (firstNumber + secondNumber) / 2);

        } else {



            System.out.println("The median is " + marks[numberOfMarks / 2]);
        }



    }
}
