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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //array to store integers
        double[] marks = new double[10];
        //ask for all the marks
        for (int i = 0; i < 10; i++) {
            System.out.println("what are the ten marks");
            marks[i] = input.nextInt();


            for (int x = 0; x < 9; x++) {
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



    }
}
