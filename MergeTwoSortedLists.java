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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merged;
        
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        
        if (l1.val < l2.val) {
            merged = l1;
            merged.next = mergeTwoLists(l1.next, l2);
        } else {
            merged = l2;
            merged.next = mergeTwoLists(l1, l2.next);
        }
        
        return merged;
    }
}
