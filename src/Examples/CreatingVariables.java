package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aakash Modi
 */
public class CreatingVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City aakash = new City();
        Robot modi = new Robot(aakash, 1, 1, Direction.EAST);
        //create a move counting variable
        int moveCounter = 0;
        //continue when counter is less than 10
        while (moveCounter < 10) {
            //move forward
            modi.move();
            //add 1 to move counter
            moveCounter = moveCounter + 1;
        }
        modi.turnLeft();
        modi.turnLeft();
        //counted for loop
        for (int count = 0; count < 10; count = count + 1) {
            //move the robot
            modi.move();
        }
    }
}
