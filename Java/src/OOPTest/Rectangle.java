/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

/**
 *
 * @author Desmond
 */
public class Rectangle {

    protected int width;
    protected int height;
    protected Point2D upperleftCoords;

    public Rectangle() {
        //No Arg Constructor
    }

    public Rectangle(Point2D upperleftCoords, int width, int height) {
        this.width = width;
        this.height = height;
        this.upperleftCoords = upperleftCoords;
    }

    @Override
    protected void finalize() {
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Point2D getCoords() {
        return upperleftCoords;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setUpperleftCoords(Point2D upperleftCoords) {
        this.upperleftCoords = upperleftCoords;
    }

    public int area() {
        return width * height;
    }

    public int perimeter() {
        return 2 * width + 2 * height;
    }

    public String toString() {
        return "RETTANGOLO { " + upperleftCoords + " --> Width : " + width + ", " + "Height: " + height + "}";
    }
}
