/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author Aakash Modi
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //start at 0
        int a = 0;

        //word>0
        while (a < 1) {

            System.out.print("Please enter your word: ");

            //get word
            Scanner letter2 = new Scanner(System.in);


            String letter = letter2.nextLine();

            //end program
            String ex = "EXIT";



            if (letter.equals(ex)) {

                //goodbye and end
                System.out.print("goodbye");

                break;



            }

            //empty string
            String translate = "";

            Boolean foundvowel = false;

            //vowel counter
            for (int i = 0; i < letter.length(); i++) {

                // look for a vowel at spot i 
                if ((letter.charAt(i) == 'a' || letter.charAt(i) == 'e' || letter.charAt(i) == 'i' || letter.charAt(i) == 'o' || letter.charAt(i) == 'u') && foundvowel == false) {

                    //add ub
                    translate = translate + "ub";

                    translate = translate + letter.charAt(i);

                    foundvowel = true;

                } else {

                    //skip after 2 vowels
                    if ((letter.charAt(i) == 'a' || letter.charAt(i) == 'e' || letter.charAt(i) == 'i' || letter.charAt(i) == 'o' || letter.charAt(i) == 'u') && foundvowel == true) {

                        translate = translate + letter.charAt(i);

                    } else {

                        translate = translate + letter.charAt(i);

                        foundvowel = false;

                    }
                }
            }

            System.out.print(translate);

            a = a + 1;

        }
    }
}
