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
// move the fslow pointer by one and fast  pointer by two since when the fast pointer completed thetraversal the slow will be at the middle of the linked list and at last we will retunr the slow as my mid node 
class Solution {
    public ListNode middleNode(ListNode head) {
       ListNode slow = head ;
       ListNode fast = slow ;
       while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
       } 
       return slow ;
    }
}
