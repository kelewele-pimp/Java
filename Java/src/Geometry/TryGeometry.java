/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometry;

import Geometry.Point;
import Geometry.Line;

/**
 *
 * @author desmond
 */
public class TryGeometry {

    public static void main(String[] args) {

        //Create two points and display them
        Point start = new Point(0.1, 1.0);
        Point end = new Point(5.0, 6.0);
        System.out.println("Points created are: " + start + " and " + end);

        //Create two lines and display them
        Line line1 = new Line(start, end); 
        Line line2 = new Line(0.1, 3.0, 3.0, 0.0); 
        
        System.out.println("Lines created are " + line1 + "and" + line2);
        
        //Display the Intersection
        System.out.println("Intersection is " + line2.intersects(line1));
        
        //Now move the end point of line1 and show the intersection
        end.move(1.0, -5.0);
        System.out.println("Intersection is " + line1.intersects(line2));
    }
}
