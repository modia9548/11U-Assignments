/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author Aakash Modi
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city and robot
        City aakash = new City();
        Robot modi = new Robot(aakash, 3, 3, Direction.SOUTH);
        new Wall(aakash, 1, 1, Direction.NORTH);
        new Wall(aakash, 1, 1, Direction.WEST);
        new Wall(aakash, 1, 2, Direction.NORTH);
        new Wall(aakash, 1, 2, Direction.EAST);
        new Wall(aakash, 2, 2, Direction.EAST);
        new Wall(aakash, 2, 2, Direction.SOUTH);
        new Wall(aakash, 2, 1, Direction.SOUTH);
        new Wall(aakash, 2, 1, Direction.WEST);

        new Wall(aakash, 1, 4, Direction.NORTH);
        new Wall(aakash, 1, 4, Direction.WEST);
        new Wall(aakash, 1, 5, Direction.NORTH);
        new Wall(aakash, 1, 5, Direction.EAST);
        new Wall(aakash, 2, 5, Direction.EAST);
        new Wall(aakash, 2, 5, Direction.SOUTH);
        new Wall(aakash, 2, 4, Direction.SOUTH);
        new Wall(aakash, 2, 4, Direction.WEST);

        new Wall(aakash, 4, 1, Direction.NORTH);
        new Wall(aakash, 4, 1, Direction.WEST);
        new Wall(aakash, 4, 2, Direction.NORTH);
        new Wall(aakash, 4, 2, Direction.EAST);
        new Wall(aakash, 5, 2, Direction.EAST);
        new Wall(aakash, 5, 2, Direction.SOUTH);
        new Wall(aakash, 5, 1, Direction.SOUTH);
        new Wall(aakash, 5, 1, Direction.WEST);

        new Wall(aakash, 4, 4, Direction.NORTH);
        new Wall(aakash, 4, 4, Direction.WEST);
        new Wall(aakash, 4, 5, Direction.NORTH);
        new Wall(aakash, 4, 5, Direction.EAST);
        new Wall(aakash, 5, 5, Direction.EAST);
        new Wall(aakash, 5, 4, Direction.SOUTH);
        new Wall(aakash, 5, 5, Direction.SOUTH);
        new Wall(aakash, 5, 4, Direction.WEST);

//create whole loop where robot repeats same action 4 times
        //el= entire loop
        for (int el = 0; el < 4; el = el + 1) {
// create loop for going around each square seperately
            for (int count = 0; count < 4; count = count + 1) {
                modi.move();
                modi.move();
                modi.move();
                //if needs to move to next side of square
                if (count < 3) {
                    modi.turnLeft();
                }

            }
        }
    }
}
