/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumTest;

/**
 *
 * @author desmond
 */
public enum JacketSize {
    small(36), 
    medium(40), 
    large(42), 
    extra_large(46), 
    extra_extra_large(48);
    
    private int chetSize; 
    //Constructor
    private JacketSize(int chetSize) {
        this.chetSize = chetSize; 
    }
    
    //Default COnstructor
    private JacketSize(){
        chetSize = 0; 
    }
    
    public void setChetSize(int chetSize){
        this.chetSize = chetSize; 
    }
    
    public int getChetSize(){
        return chetSize; 
    }
    
    @Override
    public String toString(){
        switch (this) {
            case small:
                return "S";
            case medium: 
                return "M"; 
            case large: 
                return "L";
            case extra_large: 
                return "XL"; 
            default:
                return "XXL"; 
        }
    }
    
}
