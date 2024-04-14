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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;

            if(slow==fast){
              break;
            }
        }  // finding if the LinkedList contains a cycle


        if(fast==null || fast.next==null ){   // if there is no cycle in the linkedList return null;
            return null;
        }else {
            ListNode temp = head;

            while(temp!=slow ){
            temp=temp.next;
            slow = slow.next;
            }  // returning the slow Node from where th cycles start 
        }
        return slow ;
    }
}
