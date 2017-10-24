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
        //get user to input word
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = input.nextLine();

        //find the first vowel in the word
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u') {
                String front = word.substring(0, i);
                String ending = word.substring(i);



                //add ub before the vowel and continue the word
                String translated = front + "ub" + ending;
                //if there are two vowels together, add ub only to the first vowel
                System.out.println(word + " in Ubbi Dubbi is " + translated);

            }
        }
    }
}
