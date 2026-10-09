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
        ListNode oldHead = head;
        head = null;
        while(oldHead != null){
            ListNode temp = oldHead ;
            oldHead = oldHead.next;
            temp.next = head ;  
            head = temp;
        }

        return head;

    }
}