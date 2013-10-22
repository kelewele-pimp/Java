/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericTypeTest;

/**
 *
 * @author desmond
 */
public class BinaryTree <T extends Comparable<T>> {
    
    private Node root; 
    
    //Add value to the tree
    public void add(T value){
        if(root  == null){
            root = new Node(value); 
        } else {
            add(value, root);
        }
    }
    
    private void add(T value, Node node){
        int comparison = node.obj.compareTo(value); 
        if(comparison == 0){    //if value is equal to the current node 
            ++node.count;       //just increment the count
            return; 
        }
        
        if(comparison > 0){     //if value is less than the current node (object being pointed to is greater than value)
            if(node.left == null){
                node.left = new Node(value); 
            } else {
                add(value, node.left);
            }
        } else {
            if(node.right == null){
                node.right = new Node(value); 
            } else {
                add(value, node.right);
            }
        }
    }
    
    //create a list containing the values of the list in sequence
    public LinkedList<T> sort(){
        LinkedList<T> values = new LinkedList<>(); 
        treeSort(root, values);
        return values; 
    }
    
    private void treeSort(Node node, LinkedList<T> values){
        if(node != null){
            treeSort(node.left, values);
        }
        for(int i = 0; i < node.count; ++i){
            values.addItem(node.obj);
        }
        treeSort(node.right, values);
    }
    
    private class Node{
        
        T obj; 
        int count; 
        Node left; 
        Node right; 
        
        Node(T value){
            obj = value; 
            count = 1; 
        }
    }
}
