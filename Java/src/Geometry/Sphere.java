/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometry;

/**
 *
 * @author desmond
 */
public class Sphere {
    
    static final double PI = 3.14; //class variable that has a fixed value
    static int count = 0; //class variable to count objects
    
    //instance variable
    double radius = 5.0;  //radius of a sphere 
    
    double xCenter = 10.0; //3D coordinates
    double yCenter = 10.0; //of the center
    double zCenter = 10.0; //of a sphere
    
    Sphere(){
        radius = 1.0; 
        ++count; //update the object count
    }
    
    Sphere(double x, double y, double z){
        this(); 
        xCenter = x; 
        yCenter = y; 
        zCenter = z;
    }
    
    Sphere(double theRadius, double x, double y, double z){
        this(x, y, z);
        radius = theRadius;
    }
    
    static int getCount(){
        return count;
    }
    
    double volume(){
        return 4.0/3.0*PI*radius*radius*radius;
    }
    
}
