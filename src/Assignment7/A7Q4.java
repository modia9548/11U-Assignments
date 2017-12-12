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
public class A7Q4 {
    
    
    public double compoundInterest(double initialMoney, double years,double interestRate){
        
       double adjustedInterest = Math.pow(1 + interestRate, years);
       
       double answer = initialMoney * adjustedInterest;
       
        System.out.println("Your balance after " + years + " years is $" + answer);
    /**
     * @param args the command line arguments
     */
        return answer;
    }
    
    
    public static void main(String[] args) {
        
          //create an object to run the methods
        A7Q4 test = new A7Q4();

        Scanner input = new Scanner(System.in);

        System.out.println("What is the initial amount? ");

        int factor = input.nextInt();
        
        System.out.println("What is the interest rate in decimal numbers? ");
        
        double interest = input.nextDouble();
        
        System.out.println("How many years is the balance in the account? ");
        
        int years = input.nextInt();
        
        test.compoundInterest(factor, years, interest);
    }
}
