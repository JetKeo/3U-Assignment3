/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;


/**
 *
 * @author keonj9218
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        //create robot
        Robot jimmy = new Robot(kw, 1, 1, Direction.EAST);
        
        new Wall(kw, 1, 5, Direction.WEST);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 4);
        //move
        while(true){
        jimmy.move();
        //when ever he reaches something stop
        if(!(jimmy.frontIsClear())||jimmy.canPickThing()){
            break;
        }
        
        
        
        
    }
}
}