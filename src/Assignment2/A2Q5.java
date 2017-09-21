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
public class A2Q5 {
    
    
    
    public static void main(String[] args) {
        
         //create the city
     //create the city
        City aakash=new City();
        //create the robot guard
        Robot modi=new Robot(aakash,0,0,Direction.SOUTH);
        //create the driveway
        new Wall(aakash,0,0,Direction.EAST);
        new Wall(aakash,1,1,Direction.NORTH);
        new Wall(aakash,1,2,Direction.NORTH);
        new Wall(aakash,1,3,Direction.NORTH);
        new Wall(aakash,1,4,Direction.NORTH);
        new Wall(aakash,1,4,Direction.EAST);
        new Wall(aakash,2,4,Direction.EAST);
        new Wall(aakash,2,4,Direction.SOUTH);
        new Wall(aakash,2,3,Direction.SOUTH);
        new Wall(aakash,2,2,Direction.SOUTH);
        new Wall(aakash,2,1,Direction.SOUTH);
        new Wall(aakash,3,0,Direction.EAST);
        new Wall(aakash,4,1,Direction.NORTH);
        new Wall(aakash,4,2,Direction.NORTH);
        new Wall(aakash,4,3,Direction.NORTH);
        new Wall(aakash,4,3,Direction.EAST);
        new Wall(aakash,4,3,Direction.SOUTH);
        new Wall(aakash,4,2,Direction.SOUTH);
        new Wall(aakash,4,1,Direction.SOUTH);
        new Wall(aakash,5,0,Direction.EAST);
        new Wall(aakash,6,0,Direction.EAST);
        new Wall(aakash,7,1,Direction.NORTH);
        new Wall(aakash,7,2,Direction.NORTH);
        new Wall(aakash,7,3,Direction.NORTH);
        new Wall(aakash,7,4,Direction.NORTH);
        new Wall(aakash,7,5,Direction.NORTH);
        new Wall(aakash,7,5,Direction.EAST);
        new Wall(aakash,8,5,Direction.EAST);
        new Wall(aakash,8,5,Direction.SOUTH);
        new Wall(aakash,8,4,Direction.SOUTH);
        new Wall(aakash,8,3,Direction.SOUTH);
        new Wall(aakash,8,2,Direction.SOUTH);
        new Wall(aakash,8,1,Direction.SOUTH);
        new Wall(aakash,9,0,Direction.EAST);
        new Wall(aakash,9,0,Direction.SOUTH);
        //set up all the items
        new Thing(aakash,1,0);
        new Thing(aakash,1,1);
        new Thing(aakash,1,2);
        new Thing(aakash,1,3);
        new Thing(aakash,2,0);
        new Thing(aakash,2,2);
        new Thing(aakash,2,4);
        new Thing(aakash,4,0);
        new Thing(aakash,4,1);
        new Thing(aakash,4,2);
        new Thing(aakash,7,0);
        new Thing(aakash,7,1);
        new Thing(aakash,7,5);
        new Thing(aakash,8,1);
        new Thing(aakash,8,2);
        new Thing(aakash,8,4);
        //create algorithm for robot to follow
        while (modi.leftIsClear()){
            modi.turnLeft();
        }
        
        
    }
   
        
    
}
