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
    public static ListNode reverse(ListNode centerNode) {
        ListNode a = null, b = null, c = centerNode;
        while (c != null) {
            a = b;
            b = c;
            c = c.next;
            b.next = a;
        }
        return b;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = reverse(slow);
        ListNode curr = head;

        while (temp != null ) {
            if (curr.val != temp.val) {
                return false;
            }
            curr = curr.next;
            temp = temp.next;
        }

        return true;
    }
}