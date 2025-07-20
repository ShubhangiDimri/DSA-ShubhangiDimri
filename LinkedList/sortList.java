class Solution {
    public ListNode sortList(ListNode head) {
    if(head==null || head.next==null){
        return head;
    }
  //find middle
  ListNode middle=findMiddle(head);
  ListNode leftHead=head, rightHead=middle.next;
  middle.next=null;
  leftHead=sortList(leftHead);
  rightHead=sortList(rightHead);
  return mergeTwoLists(leftHead,rightHead);

    }
  private ListNode findMiddle(ListNode head){
    ListNode slow=head,fast=head.next;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
    
  }
   private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode dnode= new ListNode(-1);
        ListNode temp=dnode;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }
            else{
                 temp.next=t2;
                temp=t2;
                t2=t2.next;
            }
        }
        if(t1!=null) temp.next=t1;
        else temp.next=t2;
        return dnode.next;
    }

}
