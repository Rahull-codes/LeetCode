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
        ListNode a = null, b = null;
        ListNode c = head;

        while(c != null){
            a = b;
            b = c;
            c = c.next;
            b.next = a;
        }

        return b;
    }
}