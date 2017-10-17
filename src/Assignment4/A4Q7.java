/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author Aakash Modi
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int win = 1;
        while (win < 100) {
            System.out.println(win);
            System.out.println("Choose a number between 2 and 12");
            int score = input.nextInt();

            win = score + win;
            if (win == 54) {
                win = 19;
            }
            if (win == 90) {
                win = 48;
            }
            if (win == 99) {
                win = 77;
            }
            if (win == 9) {
                win = 34;
            }
            if (win == 40) {
                win = 64;
            }
            if (win == 67) {
                win = 86;
            }
        }

        if (win >= 100) {
            System.out.println("Congratulations, you won!");
        }
    }
}
