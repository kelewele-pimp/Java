/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericTypeTest;

/**
 *
 * @author desmond
 */
public class TryGenericLinkedList {

    public static void main(String[] args) {
        //create an array of coordinate pairs
        double[][] coords = {
            {1, 1}, {1, 2}, {2, 3}, {-3, 5}, {-5, 1}, {0, 0}};
        
        //create polyline from the coordinates and display it
        PolyLine polygon = new PolyLine(coords); 
        System.out.println(polygon);
        
        //create points from the coordinate array 
        Point[] points = new Point[coords.length]; 
        for(int i = 0; i < points.length; ++i){
            points[i] = new Point(coords[i][0], coords[i][1]); 
        }
        
        //Use the points to create a new polyline and display it
        PolyLine new_poly = new PolyLine(points);
        System.out.println(new_poly);
    }
}
