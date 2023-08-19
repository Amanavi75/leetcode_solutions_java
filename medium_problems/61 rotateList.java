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


 /** write the base case if the linkedList is empty and list contain only one element
 after that compute the length of the string now search for the node from where we want to rotate after that take modulus if k is less than the length
 after that make the curr.next  as the list's head and head= cur.next and the last from where we have rotated just make its reference to null  and at last return head '*/
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        ListNode cur = head ;
        int len =1 ;
        while(cur.next!=null){
            len++;
            cur = cur.next;
        }
        cur.next=head;
        k=len-k%len;
        while(k-->0){
            cur= cur.next;
        }
        head=cur.next;
        cur.next=null;
        return head;
    }
}
