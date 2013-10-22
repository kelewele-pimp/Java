/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericTypeTest;

/**
 *
 * @author desmond
 */
public class PolyLine {
    
    private LinkedList<Point> polyline;
    
    //construct a polyline from an array of coordinate pairs
    public PolyLine(double[][] coords){
        Point[] points = new Point[coords.length]; 
        
        //create points from the coordinates
        for(int i = 0; i  < coords.length; ++i){
            points[i] = new Point(coords[i][0], coords[i][1]); 
        }
        
        //create a polyLine from the array of points
        polyline = new LinkedList<>(points); 
    }
    
    //counstruct polyline from array of points
    public PolyLine(Point[] points){
        polyline = new LinkedList<>(points);
    }
    
    //Add point object to the list
    public void addPoint(Point point){
        polyline.addItem(point);
    }
    
    
    //Add a point from a coordinate pair to the list
    public void addPoint(double x, double y){
        polyline.addItem(new Point(x, y));
    }
    
    //String representation of polyline
    @Override
    public String toString(){
        StringBuffer str = new StringBuffer("PolyLine: ");
        Point point = polyline.getFirst(); 
        
        while(point != null){
            str.append(" (" + point + ")");
            point = polyline.getNext(); 
        }
        return str.toString(); 
    }
}
