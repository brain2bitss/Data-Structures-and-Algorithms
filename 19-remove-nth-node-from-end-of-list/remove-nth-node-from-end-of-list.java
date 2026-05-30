/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode target;
    private int count;
    public void recursion_fun(ListNode node, int n){
        if( node == null ){
            return;
        }
        recursion_fun(node.next, n);
        count++;
        if( count == n ){
            target = node;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        recursion_fun(head, n);
        if(head == target){
            return target.next;
        }
        
        ListNode previous = head;
        while( previous.next != target ){
            previous = previous.next;
        }
        
        previous.next = target.next;
        
        return head;
    }
}