/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author Aakash Modi
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city/robot/walls
        City aakash=new City();
        Robot modi=new Robot(aakash,0,2, Direction.WEST);
        new Wall(aakash,1,2,Direction.NORTH);
        new Wall(aakash,1,1,Direction.NORTH);
        new Wall(aakash,2,2,Direction.SOUTH);       
        new Wall(aakash,1,2,Direction.EAST);        
        new Wall(aakash,2,2,Direction.EAST);
        new Wall(aakash,1,1,Direction.WEST);
        new Wall(aakash,2,1,Direction.SOUTH);
        new Wall(aakash,2,1,Direction.WEST);
         //create a move counting variable
        int moveCounter = 0;
        //continue when counter is less than 8
        while(moveCounter < 8){
            modi.move();
            modi.move();
            modi.turnLeft();
            modi.move();
            moveCounter=moveCounter + 1;
        }
    }
}
