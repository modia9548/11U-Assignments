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
public class A7Q3 {

    public void divisible(int factor) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("The numbers are ");
        
        for (int numDivided = 1; numDivided <= factor; numDivided++) {
            
            int answer = factor % numDivided;







            if (answer == 0) {
                  
                System.out.println(numDivided);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create an object to run the methods
        A7Q3 test = new A7Q3();

        Scanner input = new Scanner(System.in);

        System.out.println("What is the number? ");

        int factor = input.nextInt();

        test.divisible(factor);

    }
}
