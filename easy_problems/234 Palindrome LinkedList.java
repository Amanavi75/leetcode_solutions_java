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

 /** While traversing the whole linked list, compile the number, as well as the reversed number, represented by the list. If both are same, then return true, else false. */
class Solution {
    public boolean isPalindrome(ListNode head) {
         ListNode temp = head;
        int num = 0;
        int rev = 0;
        int mul = 1;

        while(temp != null) {

            num = num * 10 + temp.val;
            rev = rev + temp.val * mul; 
            mul *= 10;

            temp = temp.next;
        }

        return num == rev;
    }
}
