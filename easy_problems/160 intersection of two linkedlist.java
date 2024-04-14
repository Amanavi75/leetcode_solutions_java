/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0;
        ListNode temp = headA ;
        while(temp!=null){
            sizeA++;
            temp = temp.next;
        }  // find size  of first linkedList

        int sizeB= 0;
        ListNode tempB = headB ;
        while(tempB!=null){
            sizeB++;
            tempB = tempB.next;

        } // find the size of second ListNode


        temp= headA;
        tempB= headB; // get back those two temp to head 

        if(sizeA >sizeB){  // if size of first linkedList is > then size o second LInkedList
            for(int i =1;i<=sizeA-sizeB;i++){
                temp = temp.next ;
            }
        }else {
            for(int i =1;i<=sizeB-sizeA;i++){
                tempB = tempB.next ;
            }
        }

        while(temp!=tempB){
            temp= temp.next;
            tempB= tempB.next;
        }  // find wherever the temp and tem B gets equal return that particular Node 
        
        return tempB; 

    }
        

   
}
