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
    private int count; private int count2;
    private ListNode target; private int result;
    public void recursion_function(ListNode node){
        if(node == null){
            return;
        }
        count++;
        recursion_function(node.next);
        if(count%2 == 0){
            result = count/2;
        }else{
            result = count/2 + 1;
        }
        count2++;
        if(count2 == result){
            target = node;
        }    
    }
    public ListNode middleNode(ListNode head) {
        recursion_function(head);
        return target;
    }
}