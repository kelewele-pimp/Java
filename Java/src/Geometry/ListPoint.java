/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometry;

/**
 *
 * @author desmond
 */
public class ListPoint {
    
    private Point point; 
    private ListPoint next; 

    public ListPoint(Point point) {
        this.point = point;
        this.next = null;
    }
    
    
    
     public Point getPoint() {
        return point;
    }

    public ListPoint getNext() {
        return next;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
    
    //Set the pointer to the next ListPoint
    public void setNext(ListPoint next) {
        this.next = next; //Store the next ListPoint
    }

    @Override
    public String toString() {
        return "ListPoint{" + "point=" + point + '}';
    }
    
    
    
}
