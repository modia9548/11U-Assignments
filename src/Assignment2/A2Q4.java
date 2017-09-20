/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author Aakash Modi
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the city
        City aakash=new City();
        //create the robot guard
        Robot modi=new Robot(aakash,0,0,Direction.EAST);
        //create the castle
        new Wall(aakash,2,2,Direction.WEST);
        new Wall(aakash,2,2,Direction.NORTH);
        new Wall(aakash,2,3,Direction.NORTH);
        new Wall(aakash,2,3,Direction.EAST);
        new Wall(aakash,3,3,Direction.EAST);
        new Wall(aakash,3,3,Direction.SOUTH);
        new Wall(aakash,3,2,Direction.WEST);
        new Wall(aakash,3,2,Direction.SOUTH);
        new Wall(aakash,1,1,Direction.WEST);
        new Wall(aakash,1,1,Direction.SOUTH);
        new Wall(aakash,1,1,Direction.NORTH);
        new Wall(aakash,1,1,Direction.EAST);
        new Wall(aakash,1,4,Direction.EAST);
        new Wall(aakash,1,4,Direction.NORTH);
        new Wall(aakash,1,4,Direction.WEST);
        new Wall(aakash,1,4,Direction.SOUTH);
        new Wall(aakash,4,4,Direction.EAST);
        new Wall(aakash,4,4,Direction.SOUTH);
        new Wall(aakash,4,4,Direction.NORTH);
        new Wall(aakash,4,4,Direction.WEST);
        new Wall(aakash,4,1,Direction.EAST);
        new Wall(aakash,4,1,Direction.SOUTH);
        new Wall(aakash,4,1,Direction.NORTH);
        new Wall(aakash,4,1,Direction.WEST);
    }
}
