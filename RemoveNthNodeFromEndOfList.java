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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        
        ListNode slow = dummyHead;
        ListNode fast = dummyHead;
        for(int i = 0 ; i < n; i++) { //move fast n times further than slow
            fast = fast.next;
        }
        while(fast.next != null) { //move both until fast reaches the end while maintaining the gap
            
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next; // skip the n-th node
        
        return dummyHead.next;
    }
}
