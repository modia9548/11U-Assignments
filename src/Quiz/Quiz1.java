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

       while (modi.frontIsClear()){
           modi.move();
           
           if (modi.canPickThing()){
               modi.pickThing();
               modi.turnLeft();
               modi.turnLeft();
               while (modi.getAvenue() != 0) {
                   modi.move();
               }
               modi.putThing();
               modi.turnLeft();
               modi.turnLeft();
           }else{
               if (!modi.frontIsClear()){
                   modi.turnLeft();
                   modi.turnLeft();
                    while (modi.getAvenue() != 0) {
                   modi.move();
                   
                   
               }
           }
       }
          
    }
       modi.turnLeft();
       modi.turnLeft();
}
