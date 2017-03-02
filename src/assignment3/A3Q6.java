/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author keonj9218
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        kw.showThingCounts(true);
        //create robot
        RobotSE jimmy = new RobotSE(kw, 0, 1, Direction.SOUTH);
        //create things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);

        //move onto the path
        jimmy.move();
        //infinite loop
        while (true) {
            //pick up everything in the pil and turn left
            while (jimmy.canPickThing()) {
                jimmy.pickAllThings();
                jimmy.turnLeft();
                
            }
            //if theres move things then 0 in the bag place it , move and repeat until jimmy has 0 things
            while (jimmy.countThingsInBackpack() > 0) {
                jimmy.putThing();
                jimmy.move();

                // if he has 0 things turn around
                if (jimmy.countThingsInBackpack() == 0) {
                    jimmy.turnAround();
                    //move until he gets to avenue 1
                    while (jimmy.getAvenue() > 1) {
                        jimmy.move();
                        //once he gets to avenue 1 turn left and move onto the next stack
                        if (jimmy.getAvenue() == 1) {
                            jimmy.turnLeft();
                            jimmy.move();
                        }
                    }
                }



            }
        }
    }
}
