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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){return;}

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode head1 = head;
        ListNode head2 = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = head2;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head2 = prev;

        ListNode f1 = head1;
        ListNode f2 = head2;
          
        while(f2 != null){
            ListNode s1 = f1.next;
            ListNode s2 = f2.next;
            f1.next = f2;
            f2.next = s1;
            f1 = s1;
            f2 = s2;
        }

    }
}