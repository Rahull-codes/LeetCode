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
    public boolean isPalindrome(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();
        ListNode trav = head;
        while(trav != null){
            stack.push(trav.val);
            trav = trav.next;
        }
        trav = head;
        for(int i = 0 ; trav != null ; i++ ){
            if(stack.pop() != trav.val){
                return false;
            }
            trav = trav.next;
        }
        return true;
    }
}