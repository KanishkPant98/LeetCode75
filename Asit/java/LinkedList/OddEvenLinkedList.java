/*328. Odd Even Linked List
 * link: https://leetcode.com/problems/odd-even-linked-list/
 */
package LinkedList;
public class OddEvenLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    //Solution
    public ListNode oddevenList(ListNode head){
        if(head == null || head.next==null){ //If only one element in the list 
            return head;
        }
        ListNode odd =head;
        ListNode oddhead = head;
        ListNode evenhead = head.next;
        ListNode even = head.next;
        
    
        while(odd!=null && odd.next!=null && even!=null && even.next!=null){
            odd.next = even.next;     
            odd = odd.next;           
            even.next = odd.next;     
            even = even.next;         
        }
        odd.next = evenhead;
        return head;
    }
}