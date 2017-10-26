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
 * @author Aakash Modi
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City aakash = new City();
        //create robot and place him in the city
        Robot modi = new Robot(aakash, 5, 5, Direction.EAST);
        //create thing (flag)
        new Thing(aakash, 5, 6);
        //create "mountain"
        new Wall(aakash, 5, 7, Direction.WEST);
        new Wall(aakash, 5, 7, Direction.NORTH);
        new Wall(aakash, 4, 8, Direction.WEST);
        new Wall(aakash, 3, 8, Direction.WEST);
        new Wall(aakash, 3, 8, Direction.NORTH);
        new Wall(aakash, 3, 8, Direction.EAST);
        new Wall(aakash, 4, 9, Direction.NORTH);
        new Wall(aakash, 4, 9, Direction.EAST);
        new Wall(aakash, 5, 9, Direction.EAST);
        //modi climbs to the top of the mountain to plant the flag
        modi.move();
        modi.pickThing();
        modi.turnLeft();
        modi.move();
        modi.turnLeft();
        modi.turnLeft();
        modi.turnLeft();
        modi.move();
        modi.turnLeft();
        modi.move();
        modi.move();
        modi.turnLeft();
        modi.turnLeft();
        modi.turnLeft();
        modi.move();
        //modi leaves flag at top of mountain
        modi.putThing();
        //modi goes down the mountain
        modi.move();
        modi.turnLeft();
        modi.turnLeft();
        modi.turnLeft();
        modi.move();
        modi.turnLeft();
        modi.move();
        modi.turnLeft();
        modi.turnLeft();
        modi.turnLeft();
        modi.move();
        modi.move();
        modi.turnLeft();



    }
}
