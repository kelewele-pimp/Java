/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

/**
 *
 * @author Desmond
 */
public class Point2D {

    private int x;
    private int y;

    public Point2D() {
        x = y = 0; 
    }
    
    public Point2D(int x, int y){
        this.x = x; 
        this.y = y;
    }
    
    @Override
    protected void finalize(){ }//invocato dal garbage collector
    
    protected int getX(){
        return x; 
    }
    
    protected int getY() {
        return y; 
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }
        
    @Override
    public String toString(){
       return "[" + x + ", " + y + "]"; 
    }
}

