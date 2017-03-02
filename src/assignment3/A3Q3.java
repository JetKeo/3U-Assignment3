/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author keonj9218
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        //create robot
        RobotSE jimmy = new RobotSE(kw, 1, 1, Direction.EAST);
        //create wall
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);

        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);

        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);

        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);

        //create things
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);


        //loop moving foward and picking up things while able to
            while (jimmy.frontIsClear()) {
                jimmy.move();
                if (jimmy.canPickThing()) {
                    jimmy.pickThing();
                }
                // if the front is not clear and facing east turn right
                if (!(jimmy.frontIsClear()) && jimmy.getDirection() == Direction.EAST) {
                    jimmy.turnRight();
                    // if front is clear move and turn right
                    if (jimmy.frontIsClear()) {
                        jimmy.move();
                    } else {
                        break;
                    }
                    jimmy.turnRight();
                    //if you can pick up something pick up
                    if (jimmy.canPickThing()) {
                        jimmy.pickThing();
                    }
                    // if front is not clear and facing west turn left, move, and pick up if able to
                } else if (!(jimmy.frontIsClear()) && jimmy.getDirection() == Direction.WEST) {
                    jimmy.turnLeft();
                    if (jimmy.frontIsClear()) {
                        jimmy.move();
                    }
                    jimmy.turnLeft();
                    if (jimmy.canPickThing()) {
                        jimmy.pickThing();
                    } else {
                        break;

                    }
                }
            }

            while (!(jimmy.frontIsClear())) {
                if (jimmy.getDirection() == Direction.SOUTH) {
                    jimmy.turnRight();
                }

                while (jimmy.getAvenue() > 1) {
                    jimmy.move();
                    if (jimmy.getAvenue() == 1) {

                        if (jimmy.getStreet() > 1) {
                            jimmy.turnRight();

                            if (jimmy.getDirection() == Direction.NORTH) {
                                while (jimmy.getAvenue() == 1) {
                                    jimmy.move();
                                    if (jimmy.getStreet() == 1) {
                                        jimmy.turnRight();
                                        break;

                                    }
                                }
                            }
                        }
                    }
                }
            }


        }

    }

