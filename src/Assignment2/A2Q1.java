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
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City aakash = new City();
        //put a robot in the city
        Robot modi = new Robot(aakash, 1, 1, Direction.EAST);
        //create a line of 10 things
        new Thing(aakash, 1, 2);
        new Thing(aakash, 1, 3);
        new Thing(aakash, 1, 4);
        new Thing(aakash, 1, 5);
        new Thing(aakash, 1, 6);
        new Thing(aakash, 1, 7);
        new Thing(aakash, 1, 8);
        new Thing(aakash, 1, 9);
        new Thing(aakash, 1, 10);
        new Thing(aakash, 1, 11);


        modi.move();
        while (modi.canPickThing()) {
            if (modi.countThingsInBackpack() >= 7) {
                // if robot carrying 7 items, go past next 3 items and dont pick them up
                modi.move();
                modi.move();
                modi.move();
            } else {
                //make the robot pick the things up until it gets 7 items
                modi.pickThing();
                modi.move();

            }
        }
    }
}
