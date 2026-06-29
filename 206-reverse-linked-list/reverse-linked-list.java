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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode node = reverseList(head.next);

        head.next.next = head;

        head.next = null;

        return node;
    }
}

// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode curr = head;

//         while (curr != null) {
//             ListNode next = curr.next; // store next
//             curr.next = prev;          // reverse pointer
//             prev = curr;               // move prev
//             curr = next;               // move curr
//         }

//         return prev; // new head
//     }
// }