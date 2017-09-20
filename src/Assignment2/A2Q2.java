/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Aakash Modi
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the city and robot
        City aakash = new City();
        Robot modi = new Robot(aakash, 3, 2, Direction.EAST);
        //create the walls to run past
        new Wall(aakash, 3, 2, Direction.EAST);
        new Wall(aakash, 3, 2, Direction.SOUTH);
        new Wall(aakash, 3, 3, Direction.EAST);
        new Wall(aakash, 3, 3, Direction.SOUTH);
        new Wall(aakash, 3, 4, Direction.SOUTH);
        new Wall(aakash, 3, 5, Direction.SOUTH);
        new Wall(aakash, 3, 5, Direction.EAST);
        new Wall(aakash, 3, 6, Direction.SOUTH);
        new Wall(aakash, 3, 7, Direction.SOUTH);
        new Wall(aakash, 3, 8, Direction.SOUTH);
        new Wall(aakash, 3, 8, Direction.EAST);
        new Wall(aakash, 3, 9, Direction.SOUTH);
        new Wall(aakash, 3, 10, Direction.SOUTH);
        //put object at the end
        new Thing(aakash, 3, 10);
        //make robot hurdle over walls, or else it moves forward
        //make robot stop at the object

        while (!modi.canPickThing()) {
            if (modi.frontIsClear()) {
                modi.move();
            } else {
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
            }


        }
    }
