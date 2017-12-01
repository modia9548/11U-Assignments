/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

/**
 *
 * @author Aakash Modi
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //array up to 1000
        int[] numbers = new int[1001];

        //filled the array with incrementing numbers starting at 2
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        for (int x = 2; x < numbers.length; x++) {
            if (numbers[x] != 0) {

                int prime = numbers[x];
                //count from increments of variable

                //for loop to count multiplication #
                for (int i = 2; i * prime < numbers.length; i++) {
                    numbers[i * prime] = 0;
                }
                System.out.println("The prime numbers are " + numbers[x]);
            }
        }



    }
}
