/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author modia9548
 */
public class A1Q5 {
    private static String M;
    private static String K;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City aakash = new City();
        //create robot and place her in the city
        Robot maria = new Robot(aakash,0,1,Direction.WEST);
        //give maria a letter to identify her
        maria.setLabel("M");
        //create house for karel
        new Wall(aakash,3,3,Direction.SOUTH);
        new Wall(aakash,3,3,Direction.EAST);
        new Wall(aakash,2,3,Direction.EAST) ;
        new Wall(aakash,2,3,Direction.NORTH);
        new Wall(aakash,2,3,Direction.WEST);
        //create second robot and place it inside of its home
        Robot karel = new Robot(aakash,3,3,Direction.EAST);
        //give karel a letter to identify him
        karel.setLabel("K");
        //set up the droppd groceries in the city
        new Thing(aakash,0,0);
        new Thing(aakash,1,0);
        new Thing(aakash,1,1);
        new Thing(aakash,1,2);
        new Thing(aakash,2,2);
        //get maria and karel to alternate moving to pick up dropped items
        maria.move();
        maria.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        //maria and karel meet in the middle together
       
    }
}
