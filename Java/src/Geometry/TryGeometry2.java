/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometry;

/**
 *
 * @author desmond
 */
public class TryGeometry2 {

    public static void main(String args[]) {

        double[][] coords = {
            {1.0, 0.0}, {6.0, 0.0}, {6.0, 10.0},
            {10.0, 10.0}, {10.0, -14.0}, {8.0, -14.0}
        };

        //create an array of points and fill it with point objects
        Point[] points = new Point[coords.length];
        for (int i = 0; i < coords.length; i++) {
            points[i] = new Point(coords[i][0], coords[i][1]);
        }
        //create an array of lines and fill it using line pairs
        Line[] lines = new Line[points.length - 1];
        double totalLength = 0.0;
        for (int i = 0; i < points.length - 1; i++) {
            lines[i] = new Line(points[i], points[i + 1]);
            totalLength = lines[i].length();
            System.out.println("Line " + (i + 1) + ' ' + lines[i]
                    + "     Length is " + lines[i].length());
        }

        // Output the total length
        System.out.println("\nTotal line length = " + totalLength);

    }
}
