package Examples;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aakash Modi
 */
public class RobotExample {
    private static String T;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new city called kitchener
        City kitchener = new City();
        
        // create a robot
        Robot karel = new Robot(kitchener,3,2,Direction.EAST);
        //create a second robot name tina
        Robot tina = new Robot(kitchener,3,5,Direction.WEST);
        
        new Wall(kitchener,3,2,Direction.NORTH);
        
        tina.setLabel("T");
        
        new Thing(kitchener,3,3);
        
         tina.setColor(Color.CYAN);
        //get karel to move
       karel.move();
       //move to thing, have karel pick up thing
       karel.pickThing();
       karel.move();
       //get karel to turn left
       karel.turnLeft();
       karel.move();
       karel.move();
       karel.move();
       karel.move();
       karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        //get tina to move
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.turnLeft();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        //make karel drop the thing he's carrying
        karel.putThing();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        tina.turnLeft();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.turnLeft();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.pickThing();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.turnLeft();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
        tina.move();
         tina.move();
          tina.move();
        tina.putThing();
         tina.move();
        
    }
}
