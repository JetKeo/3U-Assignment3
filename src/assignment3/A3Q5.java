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
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();
        kw.showThingCounts(true);
        //create a robot
        RobotSE anthonyvitoperagine = new RobotSE(kw, 1, 1, Direction.EAST);
        
        // create things
        new Thing(kw , 1, 1);
        new Thing(kw , 1, 1);
        new Thing(kw , 1, 1);
        new Thing(kw , 1, 1);
        new Thing(kw , 1, 1);
        new Thing(kw , 1, 1);
        new Thing(kw , 1, 1);
        new Thing(kw , 1, 1);
        new Thing(kw , 1, 1);
        new Thing(kw , 1, 1);
        
        int counter = 0;
            //while the counter is less then 10 repeat
            while(counter < 10){
                // if anthony can pick up something pick it up move to the next spot, turn around and come back
                if(anthonyvitoperagine.canPickThing()) {
                    anthonyvitoperagine.pickThing();
                    anthonyvitoperagine.move();
                    anthonyvitoperagine.putThing();
                    anthonyvitoperagine.turnAround();
                    anthonyvitoperagine.move();
                    anthonyvitoperagine.turnAround();
                    counter++;
                    
                    
                }
            }
            anthonyvitoperagine.move();
       
    }
}
