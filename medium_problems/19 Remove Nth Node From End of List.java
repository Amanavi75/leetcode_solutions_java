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
        
        ListNode slow = head ;
        ListNode fast = head ;

        for (int i = 0;i<n;i++){
            fast= fast.next;
        }   // take your fast node to  till n node 

        if(fast==null){
           head =head.next;
             return head;
        } // corner case check if fast == null 

        while(fast.next!=null){
            slow = slow.next ;
            fast= fast.next ;

        } // now move your slow and fast  till fast.next not equal to null automaticlly the slow will be     at   the right place basically the nth node you are searching for  .

        slow.next = slow.next.next; // delete the required node
 
       return head ;

    }

}
