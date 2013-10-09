/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

/**
 *
 * @author Desmond
 */
public class Square extends Rectangle {

    public Square() {
        width = 1;
    }

    public Square(Point2D upperleftCoords, int side) {
        super(upperleftCoords, side, side);
    }

    @Override
    protected void finalize() {
    }

    public int getSide() {
        return width;
    }

    @Override
    public String toString() {
        return "SQUARE { " + upperleftCoords + " --> Side: " + width + " }";
    }
}
