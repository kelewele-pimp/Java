/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometry;

/**
 *
 * @author desmond
 */
public class PolyLine {

    private ListPoint start;
    private ListPoint end;

    //contstruct a polyline from an array of points
    public PolyLine(Point[] points) {
        if (points != null) {
            for (Point p : points) {
                addPoint(p);
            }
        }
    }

    //construct a polyline from an aray of coordinates
    public PolyLine(double[][] coords){
        if(coords != null){
            for(int i = 0; i < coords.length; i++){
                addPoint(coords[i][0], coords[i][1]);
            }
        }
    }
    
    //add a point object to the list
    public void addPoint(Point point) {
        ListPoint newEnd = new ListPoint(point);
        if (start == null) {
            start = newEnd;
        } else {
            end.setNext(newEnd);
        }
        end = newEnd;
    }

    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer("Polyline: ");
        ListPoint nextPoint = start;
        while (nextPoint != null) {
            str.append(" " + nextPoint);
            nextPoint = nextPoint.getNext();
        }
        return str.toString();
    }
}
