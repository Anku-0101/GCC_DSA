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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = list1;
        ListNode start = list1;
        
        int num = b-a+1;
        while(--a > 0){
            start = start.next;
        }
        ListNode end = start.next;
        while(num-- > 0){
            end = end.next;
        }
        
        start.next = list2;
        ListNode tail = list2;

        while(tail.next != null){
            tail = tail.next;
        }
        System.out.println(start.val);
        System.out.println(end.val);
        System.out.println(tail.val);
        tail.next = end;
        return head;
    }
}
