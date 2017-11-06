/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author Aakash Modi
 */
public class ArrayOfIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //assignment 4 question 4
        //create a scanner
        Scanner input = new Scanner(System.in);
        // array to store costs/expenses
        double[] expenses = new double[6];
        //create a string to list all of the cost names
        String[] expenseNames = new String[6];
        //put names into array
        expenseNames[0] = "food";
        expenseNames[1] = "dj";
        expenseNames[2] = "hall rental";
        expenseNames[3] = "decorations";
        expenseNames[4] = "staff fees";
        expenseNames[5] = "miscellaneous things";

        //use a loop to get all the info
        for (int i = 0; i < expenses.length; i++) {
            //ask for the expense
            System.out.println("How much does the " + expenseNames[i] + " cost?");
            //storing the expense
            expenses[i] = input.nextDouble();
        }
        //get all the expenses, add them up
        //start at 0
        double total = 0;
        //go through the expenses
        for (int i = 0; i < expenses.length; i++) {
            //add expenses to total
            total = total + expenses[i];
        }

        int tickets = (int) Math.ceil(total / 35);
        //tell the user
        System.out.println("Prom will cost $" + total);
        System.out.println("need to sell " + tickets + " tickets");
    }
}
