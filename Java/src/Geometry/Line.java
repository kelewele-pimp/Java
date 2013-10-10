/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometry;

/**
 *
 * @author desmond
 */
public class Line {

    private Point start;
    private Point end;

    //Create a line from two points (by passing Point objects as arguments)
    public Line(final Point start, final Point end) {
        this.start = new Point(start);
        this.end = new Point(end);
    }

    //create a line from two coordinate pairs (by simply using x and y coordinates)
    public Line(double xStart, double yStart, double xEnd, double yEnd) {
        this.start = new Point(xStart, yStart);
        this.end = new Point(xEnd, yEnd);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    //Calculate the length of a line
    public double length() {
        return start.distance(end);
    }

    // Return a point as the intersection of two lines
    Point intersects(final Line line1) {
        Point localPoint = new Point(0, 0);

        double num = (end.getY() - start.getY()) * (start.getX() - line1.start.getX())
                - (end.getX() - start.getX()) * (start.getY() - line1.start.getY());

        double denom = (end.getY() - start.getY()) * (line1.end.getX() - line1.start.getX())
                - (end.getX() - start.getX()) * (line1.end.getY() - line1.start.getY());

        localPoint.setX(line1.start.getX() + (line1.end.getX()
                - line1.start.getX()) * num / denom);
        localPoint.setY(line1.start.getY() + (line1.end.getY()
                - line1.start.getY()) * num / denom);

        return localPoint;
    }

    public String toString() {
        return "(" + start + "):(" + end + ")";
    }
}
