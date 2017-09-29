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
        Robot modi = new Robot(aakash, 1, 1, Direction.EAST,20);
        //make it put down 4 rows of the objects
        int putThingCounter = 0;
        while(putThingCounter<4);
        putThingCounter = putThingCounter + 1;
       
        if(modi.countThingsInBackpack() > 0){
            modi.putThing();
        int stepCounter = 0;
        while(stepCounter<5);
        stepCounter = stepCounter + 1;
            modi.move();            
        }
                
    }
}
