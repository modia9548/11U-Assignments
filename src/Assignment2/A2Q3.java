/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author Aakash Modi
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the city and robot
        City aakash = new City();
        Robot modi = new Robot(aakash, 33, 26, Direction.WEST);
        //make sure the robot is facing south
        while(modi.getDirection()!=Direction.NORTH){
            modi.turnLeft();
        }
       //get the robot to keep moving until it reaches street 0 
        while(modi.getStreet() != 0){
            modi.move();
            
        }
    
        modi.turnLeft();
        //get the robot to keep moving until it reaches avenue 0
        while(modi.getAvenue() != 0){
            modi.move();
        }
        
        
        
    }
}
