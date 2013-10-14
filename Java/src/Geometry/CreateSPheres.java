/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometry;

/**
 *
 * @author desmond
 */
public class CreateSPheres {

    public static void main(String args[]) {
        System.out.println("Number of objects " + Sphere.count);

        Sphere ball = new Sphere(4.0, 0.0, 0.0, 0.0);
        System.out.println("Number of objects " + Sphere.count);

        Sphere globe = new Sphere(12.0, 1.0, 1.0, 1.0);
        System.out.println("Number of objects " + Sphere.count); 
        
        //OUTPUT THE VOLUME OF EACH SPHERE
        System.out.println("ball volume: " + ball.volume());
        System.out.println("globe volume: " + globe.volume());
    }
}
