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
public class A7Q7 {
     public int firstDigit(int num){
         
        int answer = input.nextInt();
       while (answer <= 10){
            answer = num /10;
                   }
         
        System.out.println("the first digit of the integer is " + answer);
         
        return answer;
     
            
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           //create an object to run the methods
        A7Q7 test = new A7Q7();

        Scanner input = new Scanner(System.in);
        
        System.out.println("what is the number? ");
        
        int num = input.nextInt();
        
        test.firstDigit(num);
    }
}



