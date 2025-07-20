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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){ //finding middle
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reverse(slow.next); //reversing the second half
        ListNode first=head; //now comparing the first half with seocnd half
        ListNode second=newHead;
        while(second!=null){
            if(first.val!=second.val){
                reverse(newHead);  //because the given data should not be alter
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverse(newHead); //people dont want to alter the og data
        return true;
    }
    private ListNode reverse(ListNode head){ //reversal function(iterative one)
        if(head==null && head.next==null ){
            return head;
        }
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}
