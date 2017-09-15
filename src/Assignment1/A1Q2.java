/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Aakash Modi
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City aakash = new City();
        //create robot and place him in the city
        Robot modi = new Robot(aakash,5,5,Direction.SOUTH);
        //create the "newspaper" for your robot to pick up
        new Thing (aakash,6,5);
        //create modi's house using walls
        new Wall(aakash,5,5,Direction.SOUTH);
        new Wall(aakash,5,5,Direction.EAST);
        new Wall(aakash,5,5,Direction.NORTH);
        new Wall(aakash,5,4,Direction.NORTH);
        new Wall(aakash,5,4,Direction.WEST);
        new Wall(aakash,6,4,Direction.WEST);
        new Wall(aakash,6,4,Direction.SOUTH);
        //get modi to pick up the newspaper
        modi.turnLeft();
        modi.turnLeft();
        modi.turnLeft();
        modi.move();
        modi.turnLeft();
        modi.move();
        modi.turnLeft();
        modi.move();
        modi.pickThing();
        //get modi to return to his "bed"
        modi.turnLeft();
        modi.turnLeft();
        modi.move();
        modi.turnLeft();
        modi.turnLeft();
        modi.turnLeft();
        modi.move();
        modi.turnLeft();
        modi.turnLeft();
        modi.turnLeft();
        modi.move();
        modi.turnLeft();
        modi.turnLeft();
        modi.turnLeft();
    }
}
