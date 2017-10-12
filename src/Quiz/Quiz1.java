/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Aakash Modi
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City aakash = new City();
        Robot modi = new Robot(aakash, 1, 0, Direction.EAST);
        new Wall(aakash, 1, 0, Direction.WEST);

        new Wall(aakash, 1, 2, Direction.SOUTH);
        new Wall(aakash, 1, 2, Direction.NORTH);

        new Wall(aakash, 1, 3, Direction.NORTH);
        new Wall(aakash, 1, 3, Direction.SOUTH);

        new Wall(aakash, 1, 4, Direction.NORTH);
        new Wall(aakash, 1, 4, Direction.SOUTH);

        new Wall(aakash, 1, 5, Direction.NORTH);
        new Wall(aakash, 1, 5, Direction.SOUTH);

        new Wall(aakash, 1, 6, Direction.NORTH);
        new Wall(aakash, 1, 6, Direction.SOUTH);
        new Wall(aakash, 1, 6, Direction.EAST);

        new Thing(aakash, 1, 2);
        new Thing(aakash, 1, 3);
        new Thing(aakash, 1, 4);
        new Thing(aakash, 1, 5);
        new Thing(aakash, 1, 6);

        //tell the robot to move if able to
        while (modi.frontIsClear()) {
            modi.move();
            
            
            //when the robot cannot pick something, move forward
            while (!modi.canPickThing()) {
                modi.move();
                
                
            }
            //pick thing up if can
            if (modi.canPickThing()) {
                modi.pickThing();
            }
            //return to origin
            modi.turnLeft();
            modi.turnLeft();
            while (modi.getAvenue() != 0) {
                modi.move();
            }

            
            //put thing then turn around
            
            modi.putThing();
            
            modi.turnLeft();
            modi.turnLeft();

        } 
        //if front is not clear, go back to origin
        modi.turnLeft();
        modi.turnLeft();
        
        while (modi.getAvenue() != 0) {
            modi.move();
           
        }
        modi.turnLeft();
        modi.turnLeft();
    }
    
}
