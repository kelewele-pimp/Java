/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometry;

/**
 *
 * @author desmond
 */
public class TryPolyLine {
    
    public static void main(String[] args) {
        
        //create an array of coordnate pairs
        double[][] coords = {
            {1,1},{1,2},{2,3},
            {-3,5},{-5,1},{0,0}
        };
        
        //create a polyline from the coordinates and display it
        PolyLine polygon = new PolyLine(coords);
        System.out.println(polygon);
        
        //add a point and display the polygain again
        polygon.addPoint(10, 10);
        System.out.println(polygon);
        
        //create point objects from the coordinate array
        Point[] points = new Point[coords.length]; 
        for(int i = 0; i < points.length; i++){
            points[i] = new Point(coords[i][0], coords[i][1]);
        }
        
        //use the points to create a new PolyLine and display it
        PolyLine newPolyLine = new PolyLine(points); 
        System.out.println(newPolyLine);
    }
}
