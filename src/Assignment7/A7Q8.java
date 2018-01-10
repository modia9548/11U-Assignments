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
public class A7Q8 {

    public boolean allDigitsOdd(int num){
        
        //while statement if number is odd
        
       while (num >= 11){
          num = num/10;
          if(num % 2 == 1){
              return true;
                   }else{
              if(num %2 == 0){
                  return false;
              }
          }     
       }
        
       

        return false;
       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //create an object to run the methods
        A7Q8 test = new A7Q8();

        Scanner input = new Scanner(System.in);
        
        //find the number
        System.out.println("what is the number? ");
        
        int num = input.nextInt();
        
        //put number into method
        boolean ans = test.allDigitsOdd(num);
        
        //output if true or false
        System.out.println(ans);
    }
}
