/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

/**
 *
 * @author Desmond
 */
public class Square_Client {
    
    public static void main(String args[]){
        
        Square a_square = new Square(new Point2D(22, 10), 10);
        System.out.println("[X = " + a_square.getCoords().getX() + 
                ", Y = " + a_square.getCoords().getY() + "] --> Area = " + 
                a_square.area() + ", Perimeter = " + a_square.perimeter());
    }
    
}
