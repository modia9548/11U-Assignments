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
public class A7Q2 {
    public void letterGrade(int mark) {
           Scanner input = new Scanner(System.in);
             
        
        
        if (mark < 50){
            System.out.println("Your mark is F");
        }else if (50 < mark && mark < 59){
            System.out.println("Your mark is D");
    }else if (60 < mark && mark < 69){
            System.out.println("Your mark is C");
    }else if (70 < mark && mark < 79){
            System.out.println("Your mark is B");
    }else if (mark > 80 ){
            System.out.println("Your mark is A");
    }
       
        
        }
      
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //create an object to run the methods
        A7Q2 test = new A7Q2();
        
        Scanner input = new Scanner(System.in);

        System.out.println("What is you mark? ");
   
        int mark= input.nextInt();
        
        test.letterGrade(mark);
        
        
}
}



