/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        flattenHelper(head);
        return head;
    }
    
    private Node flattenHelper(Node node) {
        Node current = node;
        Node last = node;
        
        while (current != null) {
            Node next = current.next;
            
            if (current.child != null) {
                Node childLast = flattenHelper(current.child);
                
                current.next = current.child;
                current.child.prev = current;
                
                if (next != null) {
                    childLast.next = next;
                    next.prev = childLast;
                }
                current.child = null;
                
                last = childLast;
            } else {
                last = current;
            }
            
            current = next;
        }
        
        return last;
    }
}