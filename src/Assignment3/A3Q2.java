/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author Aakash Modi
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city and robot
        City aakash = new City();
        Robot modi = new Robot(aakash, 0, 0, Direction.EAST);
        new Thing(aakash, 0, 0);
        new Thing(aakash, 0, 0);
        new Thing(aakash, 0, 0);
        new Thing(aakash, 0, 0);
        new Thing(aakash, 0, 0);
        new Thing(aakash, 0, 0);
        new Thing(aakash, 0, 0);
        new Thing(aakash, 0, 0);
        new Thing(aakash, 0, 0);
        new Thing(aakash, 0, 0);
        //create pick counter for 10

        int pickThingCounter = 0;
        while (pickThingCounter < 1) //robot moves and drops off thing
        {
            pickThingCounter = pickThingCounter + 1;
            while (modi.canPickThing()) {
                modi.pickThing();


                modi.move();
                modi.putThing();
                //robot comes back
                modi.turnLeft();
                modi.turnLeft();
                modi.move();
                modi.turnLeft();
                modi.turnLeft();
            }
            //robot repeats process until 10 things delivered
            modi.move();
        }
    }
}
