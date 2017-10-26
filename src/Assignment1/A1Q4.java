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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City aakash = new City();
        //create robot and place him in the city
        Robot modi = new Robot(aakash, 0, 0, Direction.SOUTH);
        //create second robot and place it beside the first robot
        Robot karel = new Robot(aakash, 0, 1, Direction.SOUTH);
        //create the wall(s)
        new Wall(aakash, 0, 1, Direction.WEST);
        new Wall(aakash, 1, 1, Direction.WEST);
        new Wall(aakash, 1, 1, Direction.SOUTH);
        //get the robots to meet in the middle
        modi.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        modi.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        modi.turnLeft();
        modi.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();


    }
}
