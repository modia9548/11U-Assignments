/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import Examples.Methods;
import java.util.Scanner;

/**
 *
 * @author Aakash Modi
 */
public class A7Q1 {
    public double areaOfCircle(double radius){
        //write formula to alculate area
        double answer = Math.PI * Math.pow(radius,2);
        //send back answer
        return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //create an object to run the methods
        A7Q1 test = new A7Q1();
         //create a scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the radius of the circle? ");
        
         //store radius
        double radius = input.nextDouble();
        
        //calculation
        double area = test.areaOfCircle(radius);
        
        //round number to 2nd decimal place
        area = Math.round(area*100)/100.0;
        
        //output area of circle
        System.out.println("The area of the circle is " + area);
    }
}
