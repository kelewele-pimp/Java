/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometry;
import static java.lang.Math.sqrt;

/**
 *
 * @author desmond
 */
public class Point {
    //coordinates of the point
    private double x; 
    private double y; 
    
    //Create a point from coordinates
    Point(double x, double y){
        this.x = x; 
        this.y = y;     
    }
    
    //Create a point from another point object
    Point(Point oldPoint){
        this.x = oldPoint.x; 
        this.y = oldPoint.y; 
    }
    
    //Move a point
    public void move(double x, double y){
        this.x += x; 
        this.y += y; 
    }
    
    //Calculate distance to another point
    public double distance(final Point aPoint){
        return sqrt((x - aPoint.x)*(x - aPoint.x) + (y - aPoint.y)*(y - aPoint.y));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    
    public String toString(){
        return x + ", " + y; 
    }
    
}
