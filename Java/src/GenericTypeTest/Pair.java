/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericTypeTest;

/**
 *
 * @author desmond
 */
public class Pair<Key, Value> {
    
    private Key key; 
    private Value value; 
    
    public Pair(Key keyType, Value valueType){
        this.key = keyType; 
        this.value = valueType; 
    }

    public Key getKey() {
        return key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
    
    
}
