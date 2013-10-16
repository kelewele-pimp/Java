/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumTest;


/**
 *
 * @author desmond
 */
public class Jacket {
    
    private JacketSize size; 
    private JacketColor color; 
    
    public Jacket(JacketSize size, JacketColor color){
        this.size = size; 
        this.color = color; 
    }
    
    @Override
    public String toString(){
        StringBuffer str = new StringBuffer("Jacket ");
        return str.append(size).append(" in ").append(color).toString(); 
    }
}
