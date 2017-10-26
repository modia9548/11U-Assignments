package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aakash Modi
 */
public class Conditions {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // create a city
        City Aakash = new City();
        //put a robot in the city
        Robot modi = new Robot(Aakash, 2, 1, Direction.EAST);
        //create a wall
        new Wall(Aakash, 2, 1, Direction.EAST);
        new Wall(Aakash, 1, 9, Direction.WEST);
        //check if front is clear
        if (modi.frontIsClear()) {
            modi.move();

        } else {
            modi.turnLeft();
            modi.getStreet();


            modi.move();
            modi.turnLeft();
            modi.turnLeft();
            modi.turnLeft();

            //move until the wall
            while (modi.frontIsClear()) {
                modi.move();
            }

        }
    }
}
