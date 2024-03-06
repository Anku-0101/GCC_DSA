/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;

        while(slow != null && fast != null){
            if(fast == slow){
                return true;
            }
            if(fast.next == null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
