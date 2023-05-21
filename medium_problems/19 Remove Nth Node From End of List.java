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
       ListNode start = new ListNode(); // ceate a dummy node first 
       start.next = head;// points its next to head 
       ListNode fast = start ; // create a fast and slow pointer 
       ListNode slow = start ;

       for (int i =0;i<n;i++){
           fast = fast.next;
       } 
       while(fast.next!=null) { // run it till fast tend to null
           fast = fast.next;
           slow = slow.next;
       }
       slow.next = slow.next.next;
       return start.next;  
    }
}
