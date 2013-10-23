/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericTypeTest;

/**
 *
 * @author desmond
 */
public class Manager extends Person {

    private int level;

    public Manager(String name, int level) {
        super(name);
        this.level = level;
    }

    @Override
    public String toString() {
        return "Manager " + super.toString() + " level: " + level; 
    }
}
