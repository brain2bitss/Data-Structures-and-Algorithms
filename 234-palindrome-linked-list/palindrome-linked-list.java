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

    private ListNode front;
    public boolean isPalindrome(ListNode head) {
        front = head;
        ListNode end = head;
        return recursion(end);
    }
    private boolean recursion(ListNode end){
        //move to the end
        if(end == null){
            return true;
        }

        if(!recursion(end.next)){
            return false;
        }

        if(front.val != end.val){
            return false;
        }

        front = front.next;
        return true;
    }
}