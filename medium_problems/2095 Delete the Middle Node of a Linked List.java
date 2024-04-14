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
    public ListNode deleteMiddle(ListNode head) {

        ListNode slow = head;
        ListNode fast= head ;

        
        if(head.next == null){
            return null;
        }


        while(fast.next.next!=null && fast.next.next.next!=null){
            slow = slow.next;
            fast= fast.next.next;

        }


        /*  
        fast.next.next is condition for terminating it in case of even number of ListNode (right middle )
        fast.next.next.next  is condition for terminating it in case of odd number of ListNode 
        */

        slow.next = slow.next.next; // deletion of the node

        return head;
        
    }
}
