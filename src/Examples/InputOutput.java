package Examples;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aakash Modi
 */
public class InputOutput {

    private static int birthYear;

    public static void main(String[] args) {

        {
            //say hello
            //System.out.println("Hello world!");
            //or
            //System.out.print("Hello");
            //System.out.print(" World");
        }
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        //input name
        String firstName2 = " aakash";
        //tell user to give name
        System.out.println("please enter your name");
        //get name from the user
        String firstName = input.nextLine();

        //output the variable into the screen
        System.out.println(firstName);

        //output hello and aakash together
        System.out.println("Hello" + firstName);




        //ask the person for their birth year
        System.out.println("please enter the year you were born");
        //get the year
        int birthYear = input.nextInt();

        //calculate age
        int age = 2017 - birthYear;
        System.out.println("You are " + age + " years old");


        //for loop to count down from 10
        for (int i = 10; i > 0; i = i - 1) {
            //output the value
            System.out.println(i);
        }
    }
}
