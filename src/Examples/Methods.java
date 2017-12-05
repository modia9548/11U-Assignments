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
public class Methods {
    //void method type mean perform and action
    //sometimes called a procedure
    //inside the round brackets extra variables needed to run

    public static void sayHello(String name) {
        System.out.println("Hello " + name);


    }
    //double return type- needs to send double as an answer
    //sometimes called a function

    public double areaOfRect(double length, double width) {

        //calculate area
        double answer = length * width;

        //send back the answer
        return answer;
    }
    
    public void addFive(int a){
        a = a + 5;
    }

        /**
         * @param args the command line arguments
         */
    

    public static void main(String[] args) {
        //create an object to run the methods
        Methods test = new Methods();

        //create a scanner
        Scanner input = new Scanner(System.in);

        //ask for name
        System.out.println("Please enter your name");

        //store name
        String someName = input.nextLine();

        //say hello to the user
        sayHello(someName);

        System.out.println("Please enter the length and width of the rectangle");
        double a = input.nextDouble();
        double b = input.nextDouble();

        //calculate area
        double area = test.areaOfRect(a,b);
        
        //let the user know the answer
        System.out.println("The area is " + area);
        
        //test with variables
        int num = 10;
        test.addFive(num);
        System.out.println("Number is " + num);


    }
}
