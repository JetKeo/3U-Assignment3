/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author keonj9218
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kw = new City();
        // create a robot
        RobotSE jimmy = new RobotSE(kw, 3, 2, Direction.SOUTH);

        //create walls
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 1, Direction.NORTH);

        //move until a while is found
        while (jimmy.frontIsClear()) {
            jimmy.move();
        }
        // infinite loop
        while (true) {
            //if facing south and front is clear turn right
            while (jimmy.getDirection() == Direction.SOUTH) {
                if (jimmy.frontIsClear()) {
                    jimmy.turnRight();
                    //if front is still clear move
                    if (jimmy.frontIsClear()) {
                        jimmy.move();
                    }
                    //if front is not clear turn left and move
                } else {
                    jimmy.turnLeft();
                    jimmy.move();
                }
                while (jimmy.getDirection() == Direction.EAST) {
                    if (jimmy.frontIsClear()) {
                        jimmy.turnRight();
                        if (jimmy.frontIsClear()) {
                            jimmy.move();
                        }

                    } else {
                        jimmy.turnLeft();
                        jimmy.move();

                        while (jimmy.getDirection() == Direction.NORTH) {
                            if (jimmy.frontIsClear()) {
                                jimmy.turnRight();
                                if (jimmy.frontIsClear()) {
                                    jimmy.move();
                                }

                            } else {
                                jimmy.turnLeft();
                                jimmy.move();

                                while (jimmy.getDirection() == Direction.WEST) {
                                    if (jimmy.frontIsClear()) {
                                        jimmy.turnRight();
                                        if (jimmy.frontIsClear()) {
                                            jimmy.move();
                                        }

                                    } else {
                                        jimmy.turnLeft();
                                        jimmy.move();



                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
