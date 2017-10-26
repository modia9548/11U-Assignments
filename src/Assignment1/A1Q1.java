/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author Aakash Modi
 */
public class A1Q1 {

    private static Direction Direction;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City aakash = new City();
        //create robot and place him in the city
        Robot modi = new Robot(aakash, 5, 5, Direction.WEST);
        //create a square wall
        new Wall(aakash, 5, 5, Direction.SOUTH);
        new Wall(aakash, 5, 4, Direction.SOUTH);
        new Wall(aakash, 6, 3, Direction.EAST);
        new Wall(aakash, 7, 3, Direction.EAST);
        new Wall(aakash, 7, 4, Direction.SOUTH);
        new Wall(aakash, 7, 5, Direction.SOUTH);
        new Wall(aakash, 6, 5, Direction.EAST);
        new Wall(aakash, 7, 5, Direction.EAST);

        //begin moving the robot around the square wall
        modi.move();
        modi.move();
        modi.turnLeft();
        modi.move();
        modi.move();
        modi.move();
        modi.turnLeft();
        modi.move();
        modi.move();
        modi.move();
        modi.turnLeft();
        modi.move();
        modi.move();
        modi.move();
        modi.turnLeft();
        modi.move();
    }
}
