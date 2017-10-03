/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author Aakash Modi
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city and robot
        City aakash = new City();
        Robot modi = new Robot(aakash, 1, 1, Direction.EAST, 20);
        //make it continue task until street 5 is reached
        while (modi.getStreet() != 5) {
            int putThingCounter = 0;
            //make it put down 4 rows of the objects
            while (putThingCounter < 5) {
                putThingCounter = putThingCounter + 1;

                if (modi.countThingsInBackpack() > 0) {
                    modi.putThing();
                    //make it count the steps until it goes 5 spaces


                    modi.move();

                }
            }

            //return back to origin avenue
            modi.turnLeft();
            modi.turnLeft();
            while (modi.getAvenue() != 1) {
                modi.move();
            }
            //move to face towards next row
            modi.turnLeft();
            modi.move();
            modi.turnLeft();


        }

    }
}
