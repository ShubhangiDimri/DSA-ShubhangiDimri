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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0) return head;
        int len=1;
        ListNode tail=head;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        if(k%len==0){
            return head;
        }
        k=k%len;   //incase of larger valuees
        tail.next=head;
       ListNode newLastNode= findNthNode(head,len-k);
        head = newLastNode.next;
        newLastNode.next=null;
        return head;

    }
    private ListNode findNthNode(ListNode head,int n){
        ListNode temp=head;
     for(int i=1 ;i<n;i++){
        temp=temp.next;
     }
     return temp;
    }
}
