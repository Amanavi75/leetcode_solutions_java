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


/*Create a dummy node. Point next to this node to head of the linked list provided.
Iterate through the given linked list to get the length of the list.
Create three pointer pre,cur and nex to reverse each group. Why? If we observe output, we can see that we have to reverse each group, apart from modifying links of group.
Iterate through the linked list until the length of list to be processed is greater than and equal to given k.
For each iteration, point cur to pre->next and nex to nex->next.
Start nested iteration for length of k.
For each iteration, modify links as following steps:-
cur->next = nex->next
nex->next = pre->next
pre->next = nex
nex = cur->next
Move pre to cur and reduce length by k.
*/
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||k==1 ){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next =head;
        ListNode cur= dummy, nex=dummy, pre=dummy;

        int count=0;
        while(cur.next!=null){
            cur = cur.next;
            count++;
        }
        while(count>=k){
            cur= pre.next;
            nex =cur.next;
            for(int i =1;i<k;i++){
                cur.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=cur.next;

            }
            pre =cur;
            count = count-k;
        }
        return dummy.next;
    }
}
