/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author keonj9218
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();
        //create a robot
        RobotSE jimmy = new RobotSE(kw, 3, 3, Direction.SOUTH);

        //create a wall
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);

        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 5, 5, Direction.EAST);
        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.WEST);
        new Wall(kw, 4, 4, Direction.WEST);

        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);

        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 1, 4, Direction.WEST);

        //move until it the counter a reaches 9
        for (int a = 0; a < 9; a++) {
            jimmy.move();
            // if jimmy is on certain areas turn left
            if (jimmy.getAvenue() == 3 && jimmy.getStreet() == 6) {
                jimmy.turnLeft();
            }
            if (jimmy.getAvenue() == 6 && jimmy.getStreet() == 6) {
                jimmy.turnLeft();
            }
            if (jimmy.getAvenue() == 6 && jimmy.getStreet() == 3) {
                jimmy.turnLeft();
            }
            // if jimmy is on a certain spot go through with the second for loop
            if (jimmy.getAvenue() == 6 && jimmy.getStreet() == 3 && jimmy.getDirection() == Direction.WEST) {
                // move until counter b reaches 12
                for (int b = 0; b < 12; b++) {
                    jimmy.move();
                    // turn left a corners
                    if (jimmy.getAvenue() == 0 && jimmy.getStreet() == 3) {
                        jimmy.turnLeft();
                    }
                    if (jimmy.getAvenue() == 0 && jimmy.getStreet() == 6) {
                        jimmy.turnLeft();
                    }
                    if (jimmy.getAvenue() == 3 && jimmy.getStreet() == 6) {
                        jimmy.turnLeft();
                    }
                }
                if (jimmy.getAvenue() == 3 && jimmy.getStreet() == 6 && jimmy.getDirection() == Direction.NORTH) {

                    for (int c = 0; c < 12; c++) {
                        jimmy.move();

                        if (jimmy.getAvenue() == 3 && jimmy.getStreet() == 0) {
                            jimmy.turnLeft();
                        }
                        if (jimmy.getAvenue() == 0 && jimmy.getStreet() == 0) {
                            jimmy.turnLeft();
                        }
                        if (jimmy.getAvenue() == 0 && jimmy.getStreet() == 3) {
                            jimmy.turnLeft();
                        }
                    }
                    if (jimmy.getAvenue() == 0 && jimmy.getStreet() == 3 && jimmy.getDirection() == Direction.EAST) {

                        for (int d = 0; d < 15; d++) {
                            jimmy.move();

                            if (jimmy.getAvenue() == 6 && jimmy.getStreet() == 3) {
                                jimmy.turnLeft();
                            }
                            if (jimmy.getAvenue() == 6 && jimmy.getStreet() == 0) {
                                jimmy.turnLeft();
                            }
                            if (jimmy.getAvenue() == 3 && jimmy.getStreet() == 0) {
                                jimmy.turnLeft();
                            }
                        }
                    }
                }
            }
        }
    }
}
